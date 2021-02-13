package ru.starshineproject.galacticraftbiology.vanadiumBeehouse;

import forestry.api.apiculture.DefaultBeeListener;
import forestry.api.apiculture.IBeeHousingInventory;
import forestry.api.apiculture.IBeeListener;
import forestry.api.apiculture.IBeeModifier;
import forestry.apiculture.InventoryBeeHousing;
import forestry.apiculture.gui.ContainerBeeHousing;
import forestry.apiculture.gui.GuiBeeHousing;
import forestry.apiculture.tiles.TileBeeHousingBase;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Collections;

public class TileVanadiumBeehouse extends TileBeeHousingBase {
    private static final IBeeModifier beeModifier = new VanadiumBeehouseModifier();
    private final IBeeListener beeListener = new DefaultBeeListener();
    private final InventoryBeeHousing beeInventory = new InventoryBeeHousing(12);

    public TileVanadiumBeehouse(){
        super("vanadium.bee.house");

        this.beeInventory.disableAutomation();
        this.setInternalInventory(this.beeInventory);
    }

    @Override
    public IBeeHousingInventory getBeeInventory() {
        return beeInventory;
    }

    @Override
    public Iterable<IBeeModifier> getBeeModifiers() {
        return Collections.singleton(beeModifier);
    }

    @Override
    public Iterable<IBeeListener> getBeeListeners() {
        return Collections.singleton(beeListener);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public GuiContainer getGui(EntityPlayer entityPlayer, int i) {
        ContainerBeeHousing container = new ContainerBeeHousing(entityPlayer.inventory, this, false);
        return new GuiBeeHousing<>(this,container, GuiBeeHousing.Icon.BEE_HOUSE);
    }

    @Override
    public Container getContainer(EntityPlayer entityPlayer, int i) {
        return new ContainerBeeHousing(entityPlayer.inventory,this,false);
    }
}
