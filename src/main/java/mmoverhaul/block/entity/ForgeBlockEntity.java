package mmoverhaul.block.entity;

import mmoverhaul.container.ForgeContainer;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LockableContainerBlockEntity;
import net.minecraft.container.Container;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeFinder;
import net.minecraft.recipe.RecipeInputProvider;
import net.minecraft.recipe.RecipeUnlocker;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.Tickable;
import net.minecraft.util.math.Direction;

public class ForgeBlockEntity extends LockableContainerBlockEntity implements SidedInventory, RecipeUnlocker, RecipeInputProvider, Tickable
{
	protected DefaultedList<ItemStack> inventory;
	
	public ForgeBlockEntity(BlockEntityType<?> blockEntityType_1) 
	{
	   super(blockEntityType_1);
	   this.inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);
	}

	protected Text getContainerName() 
	{
		return new TranslatableText("container.forge", new Object[0]);
	}

	protected Container createContainer(int id, PlayerInventory playerInventory) 
	{
		return new ForgeContainer(id, playerInventory);
	}

	@Override
	public int getInvSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isInvEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ItemStack getInvStack(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack takeInvStack(int var1, int var2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack removeInvStack(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInvStack(int var1, ItemStack var2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canPlayerUseInv(PlayerEntity var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provideRecipeInputs(RecipeFinder var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastRecipe(Recipe<?> var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Recipe<?> getLastRecipe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getInvAvailableSlots(Direction var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canInsertInvStack(int var1, ItemStack var2, Direction var3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canExtractInvStack(int var1, ItemStack var2, Direction var3) {
		// TODO Auto-generated method stub
		return false;
	}
}
