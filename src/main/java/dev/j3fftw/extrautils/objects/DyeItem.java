package dev.j3fftw.extrautils.objects;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.inventory.ItemStack;

/**
 * A class that can be used to register {@link SlimefunItem}
 * that use the Dye material. Items registered using
 * this class can not interact with blocks or entities.
 *
 * @author NCBPFluffyBear
 */
public class DyeItem extends UnplaceableBlock {

    public DyeItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }



}
