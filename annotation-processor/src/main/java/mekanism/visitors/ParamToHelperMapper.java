package mekanism.visitors;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.ParameterSpec;

import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleTypeVisitor14;
import javax.lang.model.util.Types;

public class ParamToHelperMapper extends SimpleTypeVisitor14<CodeBlock, Integer> {

    private final ParameterSpec helperParam;
    private final TypeMirror filterInterface;
    private final Types typeUtils;

    public ParamToHelperMapper(ParameterSpec helperParam, TypeMirror filterInterface, Types typeUtils) {
        this.helperParam = helperParam;
        this.filterInterface = filterInterface;
        this.typeUtils = typeUtils;
    }

    @Override
    protected CodeBlock defaultAction(TypeMirror e, Integer paramNum) {
        throw new IllegalStateException("Unhandled type: " + e);
    }

    @Override
    public CodeBlock visitPrimitive(PrimitiveType t, Integer paramNum) {
        return CodeBlock.of("$N.$L($L)", helperParam, "get" + switch (t.getKind()) {
            case BOOLEAN -> "Bool";
            case BYTE -> "Byte";
            case SHORT -> "Short";
            case INT -> "Int";
            case LONG -> "Long";
            case CHAR -> "Char";
            case FLOAT -> "Float";
            case DOUBLE -> "Double";
            default -> throw new IllegalStateException("Unknown primitive: " + t.getKind());
        }, paramNum);
    }

    @Override
    public CodeBlock visitDeclared(DeclaredType t, Integer paramNum) {
        ClassName className = ClassName.get((TypeElement) t.asElement());
        TypeElement typeElement = (TypeElement) t.asElement();
        if (typeElement.getKind() == ElementKind.ENUM) {
            return CodeBlock.of("$N.getEnum($L, $T.class)", helperParam, paramNum, className);
        } else {
            if (typeUtils.isAssignable(t, filterInterface)) {
                return CodeBlock.of("$N.getFilter($L, $T.class)", helperParam, paramNum, className);
            }
        }
        switch (className.canonicalName()) {
            case "java.util.List" -> {
                return CodeBlock.of("$N.getList($L /* $L */)", helperParam, paramNum, t.getTypeArguments().get(0).toString());
            }
            case "java.util.Map" -> {
                return CodeBlock.of("$N.getMap($L)", helperParam, paramNum);
            }
            default -> {
                return CodeBlock.of("$N.get$L($L)", helperParam, className.simpleName(), paramNum);
            }
        }
    }
}
