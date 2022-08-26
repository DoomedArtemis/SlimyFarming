package de.artemis.slimyfarming.common.blocks;

import de.artemis.slimyfarming.common.registration.ModBlocks;
import de.artemis.slimyfarming.common.registration.ModContainers;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import org.jetbrains.annotations.NotNull;

public class SlimeFabricatorContainer extends AbstractContainerMenu {

    private final BlockEntity blockEntity;
    private final Player playerEntity;
    private final IItemHandler playerInventory;

    @SuppressWarnings("removal")
    public SlimeFabricatorContainer(int windowID, BlockPos blockPos, Inventory playerInventory, Player player) {
        super (ModContainers.SLIME_FABRICATOR_CONTAINER.get(), windowID);
        blockEntity = player.getCommandSenderWorld().getBlockEntity(blockPos);
        this.playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);

        if (blockEntity != null) {
            blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
                addSlot(new SlotItemHandler(handler, 0, 13, 17));
                addSlot(new SlotItemHandler(handler, 1, 31, 17));
                addSlot(new SlotItemHandler(handler, 2, 49, 17));
                addSlot(new SlotItemHandler(handler, 3, 67, 17));
                addSlot(new SlotItemHandler(handler, 4, 85, 17));

                addSlot(new SlotItemHandler(handler, 5, 13, 35));
                addSlot(new SlotItemHandler(handler, 6, 31, 35));
                addSlot(new SlotItemHandler(handler, 7, 49, 35));
                addSlot(new SlotItemHandler(handler, 8, 67, 35));
                addSlot(new SlotItemHandler(handler, 9, 85, 35));

                addSlot(new SlotItemHandler(handler, 10, 13, 53));
                addSlot(new SlotItemHandler(handler, 11, 31, 53));
                addSlot(new SlotItemHandler(handler, 12, 49, 53));
                addSlot(new SlotItemHandler(handler, 13, 67, 53));
                addSlot(new SlotItemHandler(handler, 14, 85, 53));

                addSlot(new SlotItemHandler(handler, 15, 13, 71));
                addSlot(new SlotItemHandler(handler, 16, 31, 71));
                addSlot(new SlotItemHandler(handler, 17, 49, 71));
                addSlot(new SlotItemHandler(handler, 18, 67, 71));
                addSlot(new SlotItemHandler(handler, 19, 85, 71));

                addSlot(new SlotItemHandler(handler, 20, 13, 89));
                addSlot(new SlotItemHandler(handler, 21, 31, 89));
                addSlot(new SlotItemHandler(handler, 22, 49, 89));
                addSlot(new SlotItemHandler(handler, 23, 67, 89));
                addSlot(new SlotItemHandler(handler, 24, 85, 89));

                addSlot(new SlotItemHandler(handler, 25, 143, 53));
            });
        }
        layoutPlayerInventorySlots(8, 120);
    }


    @NotNull
    @Override
    public ItemStack quickMoveStack(@NotNull Player p_38941_, int p_38942_) {
        return null;
    }

    @Override
    public boolean stillValid(@NotNull Player p_38874_) {
        return stillValid(ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos()), playerEntity, ModBlocks.SLIME_FABRICATOR.get());
    }

    private int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx) {
        for (int i = 0 ; i < amount ; i++) {
            addSlot(new SlotItemHandler(handler, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }

    private int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
        for (int j = 0 ; j < verAmount ; j++) {
            index = addSlotRange(handler, index, x, y, horAmount, dx);
            y += dy;
        }
        return index;
    }

    private void layoutPlayerInventorySlots(int leftCol, int topRow) {
        // Player inventory
        addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);

        // Hotbar
        topRow += 58;
        addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
    }
}
