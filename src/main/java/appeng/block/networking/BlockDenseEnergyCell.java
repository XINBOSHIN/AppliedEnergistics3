/*
 * This file is part of Applied Energistics 2. Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved. Applied
 * Energistics 2 is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version. Applied Energistics 2 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details. You should have received a copy of the GNU Lesser General Public License along with
 * Applied Energistics 2. If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.block.networking;

import java.util.EnumSet;

import net.minecraft.util.IIcon;

import appeng.api.config.PowerMultiplier;
import appeng.client.texture.ExtraBlockTextures;
import appeng.core.features.AEFeature;
import appeng.tile.networking.TileDenseEnergyCell;

public class BlockDenseEnergyCell extends BlockEnergyCell {

    public BlockDenseEnergyCell() {
        this.setTileEntity(TileDenseEnergyCell.class);
        this.setFeature(EnumSet.of(AEFeature.DenseEnergyCells));
    }

    @Override
    public IIcon getIcon(final int direction, final int metadata) {
        return switch (metadata) {
            case 0 -> ExtraBlockTextures.MEDenseEnergyCell0.getIcon();
            case 1 -> ExtraBlockTextures.MEDenseEnergyCell1.getIcon();
            case 2 -> ExtraBlockTextures.MEDenseEnergyCell2.getIcon();
            case 3 -> ExtraBlockTextures.MEDenseEnergyCell3.getIcon();
            case 4 -> ExtraBlockTextures.MEDenseEnergyCell4.getIcon();
            case 5 -> ExtraBlockTextures.MEDenseEnergyCell5.getIcon();
            case 6 -> ExtraBlockTextures.MEDenseEnergyCell6.getIcon();
            case 7 -> ExtraBlockTextures.MEDenseEnergyCell7.getIcon();
            default -> super.getIcon(direction, metadata);
        };
    }

    @Override
    public double getMaxPower() {
        return 200000.0 * 8.0 * PowerMultiplier.CONFIG.multiplier;
    }
}
