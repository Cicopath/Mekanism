package mekanism.client.gui.robit;

import mekanism.client.gui.GuiMekanism;
import mekanism.client.gui.button.GuiButtonDisableableImage;
import mekanism.common.Mekanism;
import mekanism.common.entity.EntityRobit;
import mekanism.common.inventory.container.entity.IEntityContainer;
import mekanism.common.network.PacketGuiButtonPress;
import mekanism.common.network.PacketGuiButtonPress.ClickedEntityButton;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class GuiRobit<CONTAINER extends Container & IEntityContainer<EntityRobit>> extends GuiMekanism<CONTAINER> {

    protected final EntityRobit robit;
    private Button mainButton;
    private Button craftingButton;
    private Button inventoryButton;
    private Button smeltingButton;
    private Button repairButton;

    protected GuiRobit(CONTAINER container, PlayerInventory inv, ITextComponent title) {
        super(container, inv, title);
        robit = container.getEntity();
        xSize += 25;
    }

    @Override
    public void init() {
        super.init();
        addButton(mainButton = new GuiButtonDisableableImage(guiLeft + 179, guiTop + 10, 18, 18, 201, 18, -18, getGuiLocation(),
              onPress -> Mekanism.packetHandler.sendToServer(new PacketGuiButtonPress(ClickedEntityButton.ROBIT_MAIN, robit.getEntityId()))));
        addButton(craftingButton = new GuiButtonDisableableImage(guiLeft + 179, guiTop + 30, 18, 18, 201, 54, -18, getGuiLocation(),
              onPress -> {
                  if (shouldOpenGui(RobitGuiType.CRAFTING)) {
                      Mekanism.packetHandler.sendToServer(new PacketGuiButtonPress(ClickedEntityButton.ROBIT_CRAFTING, robit.getEntityId()));
                  }
              }));
        addButton(inventoryButton = new GuiButtonDisableableImage(guiLeft + 179, guiTop + 50, 18, 18, 201, 90, -18, getGuiLocation(),
              onPress -> {
                  if (shouldOpenGui(RobitGuiType.INVENTORY)) {
                      Mekanism.packetHandler.sendToServer(new PacketGuiButtonPress(ClickedEntityButton.ROBIT_INVENTORY, robit.getEntityId()));
                  }
              }));
        addButton(smeltingButton = new GuiButtonDisableableImage(guiLeft + 179, guiTop + 70, 18, 18, 201, 126, -18, getGuiLocation(),
              onPress -> {
                  if (shouldOpenGui(RobitGuiType.SMELTING)) {
                      Mekanism.packetHandler.sendToServer(new PacketGuiButtonPress(ClickedEntityButton.ROBIT_SMELTING, robit.getEntityId()));
                  }
              }));
        addButton(repairButton = new GuiButtonDisableableImage(guiLeft + 179, guiTop + 90, 18, 18, 201, 162, -18, getGuiLocation(),
              onPress -> {
                  if (shouldOpenGui(RobitGuiType.REPAIR)) {
                      Mekanism.packetHandler.sendToServer(new PacketGuiButtonPress(ClickedEntityButton.ROBIT_REPAIR, robit.getEntityId()));
                  }
              }));
    }

    @Override
    protected ResourceLocation getGuiLocation() {
        return MekanismUtils.getResource(ResourceType.GUI, getBackgroundImage());
    }

    protected abstract String getBackgroundImage();

    protected abstract boolean shouldOpenGui(RobitGuiType guiType);

    public enum RobitGuiType {
        CRAFTING,
        INVENTORY,
        SMELTING,
        REPAIR
    }
}