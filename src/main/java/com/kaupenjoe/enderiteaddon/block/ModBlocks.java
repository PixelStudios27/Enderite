package com.kaupenjoe.enderiteaddon.block;

import com.kaupenjoe.enderiteaddon.util.registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {


    public static final RegistryObject<Block> ENDERITE_BLOCK = register("enderite_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(50f,1200f).sound(SoundType.METAL)));

    public static void register() {}

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = registration.BLOCKS.register(name, block);
        registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;
    }

}
