package mekanism.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;

public class ModelEnergyCube extends Model {

    private static final ResourceLocation OVERLAY_ON = MekanismUtils.getResource(ResourceType.RENDER, "energy_cube_overlay_on.png");
    private static final ResourceLocation OVERLAY_OFF = MekanismUtils.getResource(ResourceType.RENDER, "energy_cube_overlay_off.png");
    private static final ResourceLocation BASE_OVERLAY = MekanismUtils.getResource(ResourceType.RENDER, "energy_cube_overlay_base.png");

    private final ModelRenderer[] leds1;
    private final ModelRenderer[] leds2;
    private final ModelRenderer[] ports;
    private final ModelRenderer[] connectors;
    private final ModelRenderer frame12;
    private final ModelRenderer frame11;
    private final ModelRenderer frame10;
    private final ModelRenderer frame9;
    private final ModelRenderer frame8;
    private final ModelRenderer frame7;
    private final ModelRenderer frame6;
    private final ModelRenderer frame5;
    private final ModelRenderer frame4;
    private final ModelRenderer frame3;
    private final ModelRenderer frame2;
    private final ModelRenderer frame1;
    private final ModelRenderer corner8;
    private final ModelRenderer corner7;
    private final ModelRenderer corner6;
    private final ModelRenderer corner5;
    private final ModelRenderer corner4;
    private final ModelRenderer corner3;
    private final ModelRenderer corner2;
    private final ModelRenderer corner1;
    private final ModelRenderer connectorBackToggle;
    private final ModelRenderer connectorRightToggle;
    private final ModelRenderer connectorBottomToggle;
    private final ModelRenderer connectorLeftToggle;
    private final ModelRenderer connectorFrontToggle;
    private final ModelRenderer connectorTopToggle;
    private final ModelRenderer portBackToggle;
    private final ModelRenderer portBottomToggle;
    private final ModelRenderer portFrontToggle;
    private final ModelRenderer portLeftToggle;
    private final ModelRenderer portRightToggle;
    private final ModelRenderer portTopToggle;
    private final ModelRenderer ledTop1;
    private final ModelRenderer ledTop2;
    private final ModelRenderer ledBack1;
    private final ModelRenderer ledBack2;
    private final ModelRenderer ledBottom2;
    private final ModelRenderer ledBottom1;
    private final ModelRenderer ledFront1;
    private final ModelRenderer ledFront2;
    private final ModelRenderer ledRight2;
    private final ModelRenderer ledRight1;
    private final ModelRenderer ledLeft1;
    private final ModelRenderer ledLeft2;

    public ModelEnergyCube() {
        //TODO: 1.15 Check if this is the proper render type to use
        super(RenderType::func_228634_a_);
        textureWidth = 64;
        textureHeight = 64;

        frame12 = new ModelRenderer(this, 0, 0);
        frame12.func_228304_a_(0F, 0F, 0F, 3, 10, 3, false);
        frame12.setRotationPoint(-8F, 11F, 5F);
        frame12.setTextureSize(64, 64);
        frame12.mirror = true;
        setRotation(frame12, 0F, 0F, 0F);
        frame11 = new ModelRenderer(this, 0, 0);
        frame11.func_228304_a_(0F, 0F, 0F, 3, 10, 3, false);
        frame11.setRotationPoint(5F, 11F, -8F);
        frame11.setTextureSize(64, 64);
        frame11.mirror = true;
        setRotation(frame11, 0F, 0F, 0F);
        frame10 = new ModelRenderer(this, 0, 13);
        frame10.func_228304_a_(0F, 0F, 0F, 10, 3, 3, false);
        frame10.setRotationPoint(-5F, 21F, 5F);
        frame10.setTextureSize(64, 64);
        frame10.mirror = true;
        setRotation(frame10, 0F, 0F, 0F);
        frame9 = new ModelRenderer(this, 12, 0);
        frame9.func_228304_a_(0F, 0F, 0F, 3, 3, 10, false);
        frame9.setRotationPoint(5F, 21F, -5F);
        frame9.setTextureSize(64, 64);
        frame9.mirror = true;
        setRotation(frame9, 0F, 0F, 0F);
        frame8 = new ModelRenderer(this, 0, 13);
        frame8.func_228304_a_(0F, 0F, 0F, 10, 3, 3, false);
        frame8.setRotationPoint(-5F, 8F, 5F);
        frame8.setTextureSize(64, 64);
        frame8.mirror = true;
        setRotation(frame8, 0F, 0F, 0F);
        frame7 = new ModelRenderer(this, 0, 13);
        frame7.func_228304_a_(0F, 0F, 0F, 10, 3, 3, false);
        frame7.setRotationPoint(-5F, 21F, -8F);
        frame7.setTextureSize(64, 64);
        frame7.mirror = true;
        setRotation(frame7, 0F, 0F, 0F);
        frame6 = new ModelRenderer(this, 0, 0);
        frame6.func_228304_a_(0F, 0F, 0F, 3, 10, 3, false);
        frame6.setRotationPoint(5F, 11F, 5F);
        frame6.setTextureSize(64, 64);
        frame6.mirror = true;
        setRotation(frame6, 0F, 0F, 0F);
        frame5 = new ModelRenderer(this, 0, 0);
        frame5.func_228304_a_(0F, 0F, 0F, 3, 10, 3, false);
        frame5.setRotationPoint(-8F, 11F, -8F);
        frame5.setTextureSize(64, 64);
        frame5.mirror = true;
        setRotation(frame5, 0F, 0F, 0F);
        frame4 = new ModelRenderer(this, 12, 0);
        frame4.func_228304_a_(0F, 0F, 0F, 3, 3, 10, false);
        frame4.setRotationPoint(5F, 8F, -5F);
        frame4.setTextureSize(64, 64);
        frame4.mirror = true;
        setRotation(frame4, 0F, 0F, 0F);
        frame3 = new ModelRenderer(this, 12, 0);
        frame3.func_228304_a_(0F, 0F, 0F, 3, 3, 10, false);
        frame3.setRotationPoint(-8F, 21F, -5F);
        frame3.setTextureSize(64, 64);
        frame3.mirror = true;
        setRotation(frame3, 0F, 0F, 0F);
        frame2 = new ModelRenderer(this, 12, 0);
        frame2.func_228304_a_(0F, 0F, 0F, 3, 3, 10, false);
        frame2.setRotationPoint(-8F, 8F, -5F);
        frame2.setTextureSize(64, 64);
        frame2.mirror = true;
        setRotation(frame2, 0F, 0F, 0F);
        frame1 = new ModelRenderer(this, 0, 13);
        frame1.func_228304_a_(0F, 0F, 0F, 10, 3, 3, false);
        frame1.setRotationPoint(-5F, 8F, -8F);
        frame1.setTextureSize(64, 64);
        frame1.mirror = true;
        setRotation(frame1, 0F, 0F, 0F);
        corner8 = new ModelRenderer(this, 26, 13);
        corner8.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner8.setRotationPoint(5F, 21F, 5F);
        corner8.setTextureSize(64, 64);
        corner8.mirror = true;
        setRotation(corner8, 0F, 0F, 0F);
        corner7 = new ModelRenderer(this, 26, 13);
        corner7.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner7.setRotationPoint(5F, 21F, -8F);
        corner7.setTextureSize(64, 64);
        corner7.mirror = true;
        setRotation(corner7, 0F, 0F, 0F);
        corner6 = new ModelRenderer(this, 26, 13);
        corner6.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner6.setRotationPoint(-8F, 21F, 5F);
        corner6.setTextureSize(64, 64);
        corner6.mirror = true;
        setRotation(corner6, 0F, 0F, 0F);
        corner5 = new ModelRenderer(this, 26, 13);
        corner5.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner5.setRotationPoint(-8F, 21F, -8F);
        corner5.setTextureSize(64, 64);
        corner5.mirror = true;
        setRotation(corner5, 0F, 0F, 0F);
        corner4 = new ModelRenderer(this, 26, 13);
        corner4.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner4.setRotationPoint(5F, 8F, 5F);
        corner4.setTextureSize(64, 64);
        corner4.mirror = true;
        setRotation(corner4, 0F, 0F, 0F);
        corner3 = new ModelRenderer(this, 26, 13);
        corner3.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner3.setRotationPoint(5F, 8F, -8F);
        corner3.setTextureSize(64, 64);
        corner3.mirror = true;
        setRotation(corner3, 0F, 0F, 0F);
        corner2 = new ModelRenderer(this, 26, 13);
        corner2.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner2.setRotationPoint(-8F, 8F, 5F);
        corner2.setTextureSize(64, 64);
        corner2.mirror = true;
        setRotation(corner2, 0F, 0F, 0F);
        corner1 = new ModelRenderer(this, 26, 13);
        corner1.func_228304_a_(0F, 0F, 0F, 3, 3, 3, false);
        corner1.setRotationPoint(-8F, 8F, -8F);
        corner1.setTextureSize(64, 64);
        corner1.mirror = true;
        setRotation(corner1, 0F, 0F, 0F);
        connectorBackToggle = new ModelRenderer(this, 38, 16);
        connectorBackToggle.func_228304_a_(0F, 0F, 0F, 10, 6, 1, false);
        connectorBackToggle.setRotationPoint(-5F, 13F, 6F);
        connectorBackToggle.setTextureSize(64, 64);
        connectorBackToggle.mirror = true;
        setRotation(connectorBackToggle, 0F, 0F, 0F);
        connectorRightToggle = new ModelRenderer(this, 38, 0);
        connectorRightToggle.func_228304_a_(0F, 0F, 0F, 1, 6, 10, false);
        connectorRightToggle.setRotationPoint(6F, 13F, -5F);
        connectorRightToggle.setTextureSize(64, 64);
        connectorRightToggle.mirror = true;
        setRotation(connectorRightToggle, 0F, 0F, 0F);
        connectorBottomToggle = new ModelRenderer(this, 0, 19);
        connectorBottomToggle.func_228304_a_(0F, 0F, 0F, 10, 1, 6, false);
        connectorBottomToggle.setRotationPoint(-5F, 22F, -3F);
        connectorBottomToggle.setTextureSize(64, 64);
        connectorBottomToggle.mirror = true;
        setRotation(connectorBottomToggle, 0F, 0F, 0F);
        connectorLeftToggle = new ModelRenderer(this, 38, 0);
        connectorLeftToggle.func_228304_a_(0F, 0F, 0F, 1, 6, 10, false);
        connectorLeftToggle.setRotationPoint(-7F, 13F, -5F);
        connectorLeftToggle.setTextureSize(64, 64);
        connectorLeftToggle.mirror = true;
        setRotation(connectorLeftToggle, 0F, 0F, 0F);
        connectorFrontToggle = new ModelRenderer(this, 38, 16);
        connectorFrontToggle.func_228304_a_(0F, 0F, 0F, 10, 6, 1, false);
        connectorFrontToggle.setRotationPoint(-5F, 13F, -7F);
        connectorFrontToggle.setTextureSize(64, 64);
        connectorFrontToggle.mirror = true;
        setRotation(connectorFrontToggle, 0F, 0F, 0F);
        connectorTopToggle = new ModelRenderer(this, 0, 19);
        connectorTopToggle.func_228304_a_(0F, 0F, 0F, 10, 1, 6, false);
        connectorTopToggle.setRotationPoint(-5F, 9F, -3F);
        connectorTopToggle.setTextureSize(64, 64);
        connectorTopToggle.mirror = true;
        setRotation(connectorTopToggle, 0F, 0F, 0F);
        portBackToggle = new ModelRenderer(this, 18, 35);
        portBackToggle.func_228304_a_(0F, 0F, 0F, 8, 8, 1, false);
        portBackToggle.setRotationPoint(-4F, 12F, 7F);
        portBackToggle.setTextureSize(64, 64);
        portBackToggle.mirror = true;
        setRotation(portBackToggle, 0F, 0F, 0F);
        portBottomToggle = new ModelRenderer(this, 0, 26);
        portBottomToggle.func_228304_a_(0F, 0F, 0F, 8, 1, 8, false);
        portBottomToggle.setRotationPoint(-4F, 23F, -4F);
        portBottomToggle.setTextureSize(64, 64);
        portBottomToggle.mirror = true;
        setRotation(portBottomToggle, 0F, 0F, 0F);
        portFrontToggle = new ModelRenderer(this, 18, 35);
        portFrontToggle.func_228304_a_(0F, 0F, 0F, 8, 8, 1, false);
        portFrontToggle.setRotationPoint(-4F, 12F, -8F);
        portFrontToggle.setTextureSize(64, 64);
        portFrontToggle.mirror = true;
        setRotation(portFrontToggle, 0F, 0F, 0F);
        portLeftToggle = new ModelRenderer(this, 0, 35);
        portLeftToggle.func_228304_a_(0F, 0F, 0F, 1, 8, 8, false);
        portLeftToggle.setRotationPoint(-8F, 12F, -4F);
        portLeftToggle.setTextureSize(64, 64);
        portLeftToggle.mirror = true;
        setRotation(portLeftToggle, 0F, 0F, 0F);
        portRightToggle = new ModelRenderer(this, 0, 35);
        portRightToggle.func_228304_a_(0F, 0F, 0F, 1, 8, 8, false);
        portRightToggle.setRotationPoint(7F, 12F, -4F);
        portRightToggle.setTextureSize(64, 64);
        portRightToggle.mirror = true;
        setRotation(portRightToggle, 0F, 0F, 0F);
        portTopToggle = new ModelRenderer(this, 0, 26);
        portTopToggle.func_228304_a_(0F, 0F, 0F, 8, 1, 8, false);
        portTopToggle.setRotationPoint(-4F, 8F, -4F);
        portTopToggle.setTextureSize(64, 64);
        portTopToggle.mirror = true;
        setRotation(portTopToggle, 0F, 0F, 0F);
        ledTop1 = new ModelRenderer(this, 0, 51);
        ledTop1.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledTop1.setRotationPoint(-5.5F, 8.1F, -0.5F);
        ledTop1.setTextureSize(64, 64);
        ledTop1.mirror = true;
        setRotation(ledTop1, 0F, 0F, 0F);
        ledTop2 = new ModelRenderer(this, 0, 51);
        ledTop2.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledTop2.setRotationPoint(4.5F, 8.1F, -0.5F);
        ledTop2.setTextureSize(64, 64);
        ledTop2.mirror = true;
        setRotation(ledTop2, 0F, 0F, 0F);
        ledBack1 = new ModelRenderer(this, 0, 51);
        ledBack1.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledBack1.setRotationPoint(-5.5F, 15.5F, 6.9F);
        ledBack1.setTextureSize(64, 64);
        ledBack1.mirror = true;
        setRotation(ledBack1, 0F, 0F, 0F);
        ledBack2 = new ModelRenderer(this, 0, 51);
        ledBack2.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledBack2.setRotationPoint(4.5F, 15.5F, 6.9F);
        ledBack2.setTextureSize(64, 64);
        ledBack2.mirror = true;
        setRotation(ledBack2, 0F, 0F, 0F);
        ledBottom2 = new ModelRenderer(this, 0, 51);
        ledBottom2.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledBottom2.setRotationPoint(4.5F, 22.9F, -0.5F);
        ledBottom2.setTextureSize(64, 64);
        ledBottom2.mirror = true;
        setRotation(ledBottom2, 0F, 0F, 0F);
        ledBottom1 = new ModelRenderer(this, 0, 51);
        ledBottom1.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledBottom1.setRotationPoint(-5.5F, 22.9F, -0.5F);
        ledBottom1.setTextureSize(64, 64);
        ledBottom1.mirror = true;
        setRotation(ledBottom1, 0F, 0F, 0F);
        ledFront1 = new ModelRenderer(this, 0, 51);
        ledFront1.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledFront1.setRotationPoint(-5.5F, 15.5F, -7.9F);
        ledFront1.setTextureSize(64, 64);
        ledFront1.mirror = true;
        setRotation(ledFront1, 0F, 0F, 0F);
        ledFront2 = new ModelRenderer(this, 0, 51);
        ledFront2.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledFront2.setRotationPoint(4.5F, 15.5F, -7.9F);
        ledFront2.setTextureSize(64, 64);
        ledFront2.mirror = true;
        setRotation(ledFront2, 0F, 0F, 0F);
        ledRight2 = new ModelRenderer(this, 0, 51);
        ledRight2.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledRight2.setRotationPoint(6.9F, 15.5F, 4.5F);
        ledRight2.setTextureSize(64, 64);
        ledRight2.mirror = true;
        setRotation(ledRight2, 0F, 0F, 0F);
        ledRight1 = new ModelRenderer(this, 0, 51);
        ledRight1.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledRight1.setRotationPoint(6.9F, 15.5F, -5.5F);
        ledRight1.setTextureSize(64, 64);
        ledRight1.mirror = true;
        setRotation(ledRight1, 0F, 0F, 0F);
        ledLeft1 = new ModelRenderer(this, 0, 51);
        ledLeft1.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledLeft1.setRotationPoint(-7.9F, 15.5F, 4.5F);
        ledLeft1.setTextureSize(64, 64);
        ledLeft1.mirror = true;
        setRotation(ledLeft1, 0F, 0F, 0F);
        ledLeft2 = new ModelRenderer(this, 0, 51);
        ledLeft2.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        ledLeft2.setRotationPoint(-7.9F, 15.5F, -5.5F);
        ledLeft2.setTextureSize(64, 64);
        ledLeft2.mirror = true;
        setRotation(ledLeft2, 0F, 0F, 0F);

        leds1 = new ModelRenderer[]{ledBottom1, ledTop1, ledFront1, ledBack1, ledLeft1, ledRight1};
        leds2 = new ModelRenderer[]{ledBottom2, ledTop2, ledFront2, ledBack2, ledLeft2, ledRight2};

        ports = new ModelRenderer[]{portBottomToggle, portTopToggle, portFrontToggle, portBackToggle, portLeftToggle, portRightToggle};
        connectors = new ModelRenderer[]{connectorBottomToggle, connectorTopToggle, connectorFrontToggle, connectorBackToggle, connectorLeftToggle, connectorRightToggle};
    }

    @Override
    public void func_225598_a_(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int otherLight, float red, float green, float blue, float alpha) {
        //public void render(float size, EnergyCubeTier tier, TextureManager manager, boolean renderMain) {
        //TODO: 1.15
        /*if (renderMain) {
            frame12.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame11.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame10.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame9.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame8.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame7.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame6.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame5.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame4.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame3.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame2.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            frame1.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);

            corner8.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            corner7.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            corner6.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            corner5.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            corner4.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            corner3.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            corner2.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            corner1.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        }

        RenderSystem.pushMatrix();
        RenderSystem.scalef(1.001F, 1.005F, 1.001F);
        RenderSystem.translatef(0, -0.0061F, 0);
        manager.bindTexture(BASE_OVERLAY);
        MekanismRenderer.color(tier.getBaseTier().getColor());
        GlowInfo glowInfo = MekanismRenderer.enableGlow();

        corner8.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        corner7.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        corner6.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        corner5.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        corner4.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        corner3.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        corner2.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        corner1.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);

        MekanismRenderer.disableGlow(glowInfo);
        MekanismRenderer.resetColor();
        RenderSystem.popMatrix();*/
    }

    public void renderSide(float size, Direction side, boolean canInput, boolean canOutput, TextureManager renderer) {
        //TODO: 1.15
        /*if (canInput || canOutput) {
            connectors[side.ordinal()].func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
            ports[side.ordinal()].func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        }

        GlowInfo glowInfo;
        if (canOutput) {
            glowInfo = MekanismRenderer.enableGlow();
            renderer.bindTexture(BASE_OVERLAY);
            ports[side.ordinal()].func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        } else {
            glowInfo = MekanismRenderer.NO_GLOW;
        }

        renderer.bindTexture(canOutput ? OVERLAY_ON : OVERLAY_OFF);

        leds1[side.ordinal()].func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        leds2[side.ordinal()].func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        MekanismRenderer.disableGlow(glowInfo);*/
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public static class ModelEnergyCore extends Model {

        private ModelRenderer cube;

        public ModelEnergyCore() {
            //TODO: 1.15 Check if this is the proper render type to use
            super(RenderType::func_228634_a_);
            textureWidth = 32;
            textureHeight = 32;

            cube = new ModelRenderer(this, 0, 0);
            cube.func_228304_a_(-8, -8, -8, 16, 16, 16, false);
            cube.setRotationPoint(0, 0, 0);
            cube.setTextureSize(32, 32);
            cube.mirror = true;
        }

        @Override
        public void func_225598_a_(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int otherLight, float red, float green, float blue, float alpha) {
            cube.func_228309_a_(matrix, vertexBuilder, light, otherLight, red, green, blue, alpha);
        }
    }
}