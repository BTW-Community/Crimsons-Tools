package crimsonstools.item.items;

import btw.item.items.ShovelItem;
import net.minecraft.src.*;
public class TrowelItem extends ShovelItem {
    public TrowelItem(int itemID) {
        super( itemID, EnumToolMaterial.STONE , /*iMaxUses=*/ 6);

        efficiencyOnProperMaterial /= 10;
        this.setUnlocalizedName("crimsonToolsItemTrowel");
        this.setCreativeTab(CreativeTabs.tabTools);

    }
}
