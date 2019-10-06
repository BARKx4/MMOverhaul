package mmoverhaul.container;

import net.minecraft.container.Container;
import net.minecraft.container.ContainerType;
import net.minecraft.container.Slot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.BasicInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ForgeContainer extends Container 
{
   private static final Logger LOGGER = LogManager.getLogger();
   private final Inventory result;
   private final Inventory inventory;
   private final PlayerEntity player;

   public ForgeContainer(int int_1, PlayerInventory playerInventory) 
   {
      super(ContainerType.ANVIL, int_1);
      this.result = new CraftingResultInventory();
      this.inventory = new BasicInventory(12);
      
      this.player = playerInventory.player;
      
      this.addSlot(new Slot(this.inventory, 0, 27, 47));
      this.addSlot(new Slot(this.inventory, 1, 76, 47));
      
      int x;
      for(x = 0; x < 3; ++x) {
         for(int y = 0; y < 9; ++y) {
            this.addSlot(new Slot(playerInventory, y + x * 9 + 9, 8 + y * 18, 84 + x * 18));
         }
      }

      for(x = 0; x < 9; ++x) {
         this.addSlot(new Slot(playerInventory, x, 8 + x * 18, 142));
      }
   }

	@Override
	public boolean canUse(PlayerEntity var1) 
	{
		// TODO Auto-generated method stub
		return true;
	}
}
