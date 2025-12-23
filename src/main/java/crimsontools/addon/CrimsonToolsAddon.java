package crimsontools.addon;

import api.BTWAddon;
import api.AddonHandler;
import crimsontools.crafting.recipes.CrimsonToolsRecipeList;
import crimsontools.item.CrimsonToolsItemInitializer;

public class CrimsonToolsAddon extends BTWAddon {
    private static CrimsonToolsAddon instance;

    public CrimsonToolsAddon() {
        super();
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

}
