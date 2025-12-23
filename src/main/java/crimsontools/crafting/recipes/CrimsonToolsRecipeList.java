package crimsontools.crafting.recipes;

import btw.crafting.recipe.RecipeManager;
import btw.item.BTWItems;
import crimsontools.item.CrimsonToolsItems;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class CrimsonToolsRecipeList {
    public static void initRecipes() {
        RecipeManager.addShapelessRecipe(new ItemStack(CrimsonToolsItems.trowel ), new Object[] {
                Item.stick,
                new ItemStack(BTWItems.sharpStone, 1),
                Item.silk
        });

        RecipeManager.addShapelessRecipe(new ItemStack(CrimsonToolsItems.trowel ), new Object[] {
                Item.stick,
                new ItemStack(BTWItems.sharpStone, 1),
                BTWItems.hempFibers
        });

        RecipeManager.addShapelessRecipe(new ItemStack(CrimsonToolsItems.trowel ), new Object[] {
                Item.stick,
                new ItemStack(BTWItems.sharpStone, 1),
                BTWItems.sinew
        });
    }
}
