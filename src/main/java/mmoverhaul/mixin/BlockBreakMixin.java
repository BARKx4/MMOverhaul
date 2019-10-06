package mmoverhaul.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import mmoverhaul.enums.SkillChallengeResult;
import mmoverhaul.init.ModBlocks;
import mmoverhaul.skills.Mining;
import mmoverhaul.skills.SkillUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LogBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Mixin(Block.class)
public abstract class BlockBreakMixin
{
    @Inject(method = "afterBreak", at = @At(value = "HEAD"), cancellable = true)
    private void mmoverhaul_afterBreak(World world, PlayerEntity player, BlockPos blockpos, BlockState blockstate, BlockEntity blockentity, ItemStack itemstack, CallbackInfo ci)
    {
    	if (blockstate.getBlock() instanceof LogBlock) 
		{
			if (player != null) 
			{
				ItemStack heldItem = player.getMainHandStack();
				
				if (!(heldItem.getItem() instanceof AxeItem) || heldItem == null) 
				{
					player.sendMessage(new LiteralText("You fail to gather anything useful from the tree. Try a better tool."));
					ci.cancel();
				}
				else if (((AxeItem)heldItem.getItem()).getMaterial().getMiningLevel() < 2)
				{
					player.sendMessage(new LiteralText("You fail to gather anything useful from the tree. Try a better tool."));
					ci.cancel();
				}
			}
		}
    	else if (blockstate.getBlock() instanceof OreBlock)
		{
			if (player != null) 
			{
				Block blockType = blockstate.getBlock();
				
				if (blockType == Blocks.REDSTONE_ORE || blockType == Blocks.COAL_ORE) return;
				
				SkillChallengeResult scrResult = SkillChallengeResult.FAIL;
				
				if (blockType == Blocks.IRON_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltIron());
				else if (blockType == ModBlocks.DULL_COPPER_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltDullCopper());
				else if (blockType == ModBlocks.COPPER_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltCopper());
				else if (blockType == ModBlocks.BRONZE_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltBronze());
				else if (blockType == Blocks.GOLD_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltGold());
				else if (blockType == ModBlocks.AGAPITE_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltAgapite());
				else if (blockType == ModBlocks.VERITE_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltVerite());
				else if (blockType == ModBlocks.UMBRACITE_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltUmbracite());
				else if (blockType == ModBlocks.VALORITE_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.SmeltValorite());
				else if (blockType == Blocks.LAPIS_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.MineLapis());
				else if (blockType == Blocks.EMERALD_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.MineEmerald());
				else if (blockType == Blocks.DIAMOND_ORE) scrResult = SkillUtils.challenge(player, new Mining(), new Mining.MineDiamond());
				
				if (scrResult == SkillChallengeResult.POOR)
				{
					Random rand = new Random();
					
					// 50-50 chance to get iron instead
					if (rand.nextInt(100) > 50)
					{
						if (blockType != Blocks.IRON_ORE)
						{
							player.sendMessage(new LiteralText("You fail to extract the exotic ores, but manage to salvage some iron."));
						}
						
						itemstack = new ItemStack(Blocks.IRON_ORE, 1);
					}
				}
				else if (scrResult == SkillChallengeResult.FAIL)
				{
					// get iron instead of the special ore.
					if (blockType != Blocks.IRON_ORE)
					{
						player.sendMessage(new LiteralText("You fail to extract the exotic ores, but manage to salvage some iron."));
					}
					
					itemstack = new ItemStack(Blocks.IRON_ORE, 1);
				}
			}
		}
    }
}