package mekanism.client.render.item.block;

import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nonnull;
import mekanism.client.model.ModelSolarNeutronActivator;
import mekanism.client.render.MekanismRenderer;
import mekanism.client.render.item.ItemLayerWrapper;
import mekanism.client.render.item.MekanismItemStackRenderer;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;

public class RenderSolarNeutronActivatorItem extends MekanismItemStackRenderer {

    private static ModelSolarNeutronActivator solarNeutronActivator = new ModelSolarNeutronActivator();
    public static ItemLayerWrapper model;

    @Override
    public void renderBlockSpecific(@Nonnull ItemStack stack, TransformType transformType) {
        RenderSystem.rotatef(180, 0, 0, 1);
        RenderSystem.scalef(0.6F, 0.6F, 0.6F);
        RenderSystem.translatef(0, -0.55F, 0);
        MekanismRenderer.bindTexture(MekanismUtils.getResource(ResourceType.RENDER, "solar_neutron_activator.png"));
        //TODO: 1.15
        //solarNeutronActivator.render(0.0625F);
    }

    @Override
    protected void renderItemSpecific(@Nonnull ItemStack stack, TransformType transformType) {
    }

    @Nonnull
    @Override
    protected TransformType getTransform(@Nonnull ItemStack stack) {
        return model.getTransform();
    }
}