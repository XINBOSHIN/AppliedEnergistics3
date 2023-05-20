/*
 * This file is part of Applied Energistics 2. Copyright (c) 2013 - 2015, AlgorithmX2, All rights reserved. Applied
 * Energistics 2 is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version. Applied Energistics 2 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details. You should have received a copy of the GNU Lesser General Public License along with
 * Applied Energistics 2. If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.core.sync.packets;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;

import appeng.core.sync.AppEngPacket;
import appeng.core.sync.network.INetworkInfo;
import appeng.integration.IntegrationRegistry;
import appeng.integration.IntegrationType;
import appeng.integration.abstraction.IFMP;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PacketMultiPart extends AppEngPacket {

    // automatic.
    public PacketMultiPart(final ByteBuf stream) {}

    // api
    public PacketMultiPart() {
        final ByteBuf data = Unpooled.buffer();

        data.writeInt(this.getPacketID());

        this.configureWrite(data);
    }

    @Override
    public void serverPacketData(final INetworkInfo manager, final AppEngPacket packet, final EntityPlayer player) {
        final IFMP fmp = (IFMP) IntegrationRegistry.INSTANCE.getInstance(IntegrationType.FMP);
        if (fmp != null) {
            final EntityPlayerMP sender = (EntityPlayerMP) player;
            MinecraftForge.EVENT_BUS.post(fmp.newFMPPacketEvent(sender)); // when received it just posts this event.
        }
    }
}
