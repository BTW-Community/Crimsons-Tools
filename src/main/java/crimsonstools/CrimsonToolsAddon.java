package crimsonstools;

import btw.AddonHandler;
import btw.BTWAddon;
import crimsonstools.crafting.recipes.CrimsonToolsRecipeList;
import crimsonstools.item.CrimsonToolsItemInitializer;

public class CrimsonToolsAddon extends BTWAddon {
    private static CrimsonToolsAddon instance;

    private CrimsonToolsAddon() {
        super("Crimson's Tools", "0.1.0", "CrimsonTools");
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
        CrimsonToolsItemInitializer.initItems();
    }

    @Override
    public void postInitialize() {
        CrimsonToolsRecipeList.initRecipes();
    }

    public static CrimsonToolsAddon getInstance() {
        if (instance == null)
            instance = new CrimsonToolsAddon();
        return instance;
    }
}
