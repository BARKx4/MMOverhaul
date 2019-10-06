package mmoverhaul.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.block.Blocks;
import net.minecraft.container.FurnaceOutputSlot;
import net.minecraft.item.ItemStack;

@Mixin(FurnaceOutputSlot.class)
public class FurnaceCraftedMixin 
{
	@Inject(method = "onCrafted(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "HEAD"), cancellable = true)
	private void mmoverhaul_onCrafted(ItemStack itemstack, CallbackInfo ci)
    {
		System.out.println("[ egg 2 ] " + itemstack.getItem().getName().asString());
		itemstack = new ItemStack(Blocks.AIR);
    }
}
