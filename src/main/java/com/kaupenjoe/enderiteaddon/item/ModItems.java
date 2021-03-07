package com.kaupenjoe.enderiteaddon.item;

import com.kaupenjoe.enderiteaddon.util.registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> ENDERITE_INGOT =
            registration.ITEMS.register("enderite_ingot",
                  () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register()
    {

    }
}
