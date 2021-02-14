package ru.starshineproject.galacticraftbiology;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.starshineproject.galacticraftbiology.api.ItemsGB;
import ru.starshineproject.galacticraftbiology.oredict.OreDictAdd;
import ru.starshineproject.galacticraftbiology.proxy.CommonProxy;

import java.util.ArrayList;
import java.util.List;

@Mod(
        modid = GalacticraftBiology.MODID,
        name = GalacticraftBiology.MODNAME,
        version = GalacticraftBiology.VERSION

)
public class GalacticraftBiology {

    public static final String MODID = "galacticraftbiology";
    public static final String MODNAME = "Galacticraft Biology";
    public static final String VERSION = "1.0-SNAPSHOT";

    public static final Logger logger = LogManager.getLogger(MODID.toUpperCase());

    public static final List<Item> ITEMS = new ArrayList();
    public static final List<Block> BLOCKS = new ArrayList();

    @SidedProxy(clientSide = "ru.starshineproject.galacticraftbiology.proxy.ClientProxy", serverSide = "ru.starshineproject.galacticraftbiology.proxy.CommonProxy")
    public static CommonProxy proxy;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MODID)
    public static GalacticraftBiology INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    public static CreativeTabs tabGBMain = new CreativeTabs(MODNAME) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemsGB.moon_bee_comb);
        }
    };

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
        BlocksRegistry.initBlock();

    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
        new OreDictAdd().initOreDict();

    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
        ITEMS.clear();
        BLOCKS.clear();

    }

    /**
     * Forge will automatically look up and bind blocks to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MODID)
    public static class Blocks {
      /*
          public static final MySpecialBlock mySpecialBlock = null; // placeholder for special block below
      */
    }

    /**
     * Forge will automatically look up and bind items to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MODID)
    public static class Items {
      /*
          public static final ItemBlock mySpecialBlock = null; // itemblock for the block above
          public static final MySpecialItem mySpecialItem = null; // placeholder for special item below
      */
    }

    /**
     * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
     */
    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        /**
         * Listen for the register event for creating custom items
         */
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
           /*
             event.getRegistry().register(new ItemBlock(Blocks.myBlock).setRegistryName(MODID, "myBlock"));
             event.getRegistry().register(new MySpecialItem().setRegistryName(MODID, "mySpecialItem"));
            */
        }

        /**
         * Listen for the register event for creating custom blocks
         */
        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
           /*
             event.getRegistry().register(new MySpecialBlock().setRegistryName(MODID, "mySpecialBlock"));
            */
        }
    }
    /* EXAMPLE ITEM AND BLOCK - you probably want these in separate files
    public static class MySpecialItem extends Item {

    }

    public static class MySpecialBlock extends Block {

    }
    */
}
