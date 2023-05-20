package appeng.test.mockme;

import net.minecraft.inventory.InventoryCrafting;

import appeng.api.networking.crafting.ICraftingMedium;
import appeng.api.networking.crafting.ICraftingPatternDetails;

public class MockCraftingMedium implements ICraftingMedium {

    @Override
    public boolean pushPattern(ICraftingPatternDetails patternDetails, InventoryCrafting table) {
        return true;
    }

    @Override
    public boolean isBusy() {
        return false;
    }
}
