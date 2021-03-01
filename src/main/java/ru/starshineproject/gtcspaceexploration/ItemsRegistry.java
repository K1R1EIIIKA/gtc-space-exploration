package ru.starshineproject.gtcspaceexploration;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import ru.starshineproject.gtcspaceexploration.api.ItemsGB;
import ru.starshineproject.gtcspaceexploration.item.*;

@GameRegistry.ObjectHolder("gtcspaceexploration")
@Mod.EventBusSubscriber
public class ItemsRegistry {

    @SideOnly(Side.CLIENT)
    private static void registryModel(Item item) {
        final ResourceLocation regName = item.getRegistryName();
        if (regName == null) {
            GTCSpaceExploration.logger.error("Null key received during model registration: {}\n. Please report", item.toString());
            return;
        }
        final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
        ModelBakery.registerItemVariants(item, mrl);
        ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
    }


    public static void initItems(IForgeRegistry<Item> e) {
        e.register(ItemsGB.plate_solar = new PlateSolar());
        e.register(ItemsGB.ingot_vanadium = new IngotVanadium());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e){
        initItems(e.getRegistry());
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {
        GTCSpaceExploration.ITEMS.forEach(ItemsRegistry::registryModel);
    }
}
