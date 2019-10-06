package mmoverhaul.block;

import mmoverhaul.block.entity.ForgeBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.container.NameableContainerProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class ForgeBlock extends Block
{
	public ForgeBlock(Settings block$Settings_1) 
   	{
		super(block$Settings_1);
	}

   	public BlockEntity createBlockEntity(BlockView blockView) 
   	{
	   return new ForgeBlockEntity(null);
   	}

   	protected void openContainer(World world, BlockPos blockPos, PlayerEntity playerEntity) 
   	{
	   BlockEntity blockEntity = world.getBlockEntity(blockPos);
	   if (blockEntity instanceof ForgeBlockEntity) 
	   {
		   playerEntity.openContainer((NameableContainerProvider)blockEntity);
	   }
   }
}
