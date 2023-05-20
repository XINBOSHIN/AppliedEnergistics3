package appeng.test.mockme;

import net.minecraftforge.common.util.ForgeDirection;

import appeng.api.networking.IGridHost;
import appeng.api.networking.IGridNode;
import appeng.api.util.AECableType;

public class MockGridMachine implements IGridHost {

    @Override
    public IGridNode getGridNode(ForgeDirection dir) {
        return null;
    }

    @Override
    public AECableType getCableConnectionType(ForgeDirection dir) {
        return AECableType.GLASS;
    }

    @Override
    public void securityBreak() {
        // no-op
    }
}
