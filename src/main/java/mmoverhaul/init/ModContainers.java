package mmoverhaul.init;

import mmoverhaul.container.ForgeContainer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModContainers 
{
	public static void init()
    {
		Registry.register(Registry.CONTAINER, new Identifier("mmoverhaul", "container_forge"), new ForgeContainer());
    }
}
