package de.artemis.slimyfarming.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import de.artemis.slimyfarming.SlimyFarming;
import de.artemis.slimyfarming.common.blocks.SlimeFabricatorContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class SlimeFabricatorScreen extends AbstractContainerScreen<SlimeFabricatorContainer> {

    private final ResourceLocation GUI = new ResourceLocation(SlimyFarming.MODID, "textures/gui/slime_fabricator_gui.png");

    public SlimeFabricatorScreen(SlimeFabricatorContainer container, Inventory inv, Component name) {
        super(container, inv, name);
    }

    @Override
    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture(0, GUI);
        int relX = (this.width - this.getXSize()) / 2;
        int relY = (this.height - this.getYSize()) / 2;
        this.blit(matrixStack, relX, relY, 0, 0, this.getXSize(), this.getYSize());
    }

    @Override
    protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
        drawText(poseStack, 8, 90, Component.translatable("text.slimefabricator.player_inventory_title").getString(), 4144959);
        drawCenteredText(poseStack, getXSize() / 2, -13, Component.translatable("text.slimefabricator.block_inventory_title").getString(), 4144959);
    }

    protected void drawText(PoseStack poseStack, int mouseX, int mouseY, String text, int color) {
        Minecraft.getInstance().font.draw(poseStack, text, mouseX, mouseY, color);
    }

    protected void drawCenteredText(PoseStack poseStack, int mouseX, int mouseY, String text, int color) {
        Minecraft.getInstance().font.draw(poseStack, text, mouseX - (Minecraft.getInstance().font.width(text) / 2), mouseY, color);
    }

    @Override
    public int getYSize() {
        return 202;
    }

    @Override
    public int getXSize() {
        return 176;
    }
}
