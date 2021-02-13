package ru.starshineproject.galacticraftbiology.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.starshineproject.galacticraftbiology.BlocksRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        BlocksRegistry.register();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
