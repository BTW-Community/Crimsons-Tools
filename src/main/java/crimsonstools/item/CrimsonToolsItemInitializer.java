package crimsonstools.item;

import crimsonstools.item.items.TrowelItem;

public class CrimsonToolsItemInitializer {
    public static void initItems() {
        CrimsonToolsItems.trowel = new TrowelItem(CrimsonToolsItemIDs.TROWEL_ID);
    }
}
