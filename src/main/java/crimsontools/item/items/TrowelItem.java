package crimsontools.item.items;

import api.item.items.ShovelItem;
import net.minecraft.src.*;

public class TrowelItem extends ShovelItem {
    public TrowelItem(int itemID) {
        super( itemID, EnumToolMaterial.STONE , /*iMaxUses=*/ 6);

        efficiencyOnProperMaterial /= 10;
        setUnlocalizedName("crimsontools:stone_trowel");
        setCreativeTab(CreativeTabs.tabTools);
        //setTextureName("crimsontools:stone_trowel");

    }
}
