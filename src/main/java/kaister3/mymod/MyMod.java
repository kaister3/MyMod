package kaister3.mymod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.network.simple.SimpleChannel;

public class MyMod {
   private static final Logger LOGGER= LogManager.getLogger();

   public static final String MODID = "mymod";
   public static final String NAME = "My Mod";

   public static final ItemGroupMyMod ITEM_GROUP = new ItemGroupMyMod();

   // public static final SimpleChannel network = ModNetWork

   public MyMod() {
      //
   }
}
