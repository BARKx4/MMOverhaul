package mmoverhaul.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.container.FurnaceOutputSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

@Mixin(FurnaceOutputSlot.class)
public class FurnaceTakeItemMixin 
{	
	@Inject(method = "onTakeItem", at = @At(value = "HEAD"), cancellable = true)
    private ItemStack BARKx4$onTakeItem(PlayerEntity player, ItemStack itemstack, CallbackInfoReturnable ci)
    {
		System.out.println("[ egg ]");
		itemstack = new ItemStack(Blocks.AIR);
		MinecraftClient.getInstance().player.inventory.setCursorStack(itemstack);
		ci.cancel();
		return itemstack;
    }
}
