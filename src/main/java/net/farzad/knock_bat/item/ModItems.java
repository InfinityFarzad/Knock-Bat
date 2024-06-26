package net.farzad.knock_bat.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.farzad.knock_bat.KnockBat;
import net.farzad.knock_bat.item.custom.BattItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BATT = RegisterItem("batt",
            new BattItem(ToolMaterials.WOOD,-3
                    ,9,new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item[] bigItems = {BATT};
    //bigitems is just a list name and is used to change the items model in inventory
    // but doss not change its size handheld that is done in its json file.

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(KnockBat.MOD_ID, name), item);

    }








    public static void registerModItems () {
        KnockBat.LOGGER.debug("Registering Mod Items for " + KnockBat.MOD_ID);

    }



}
