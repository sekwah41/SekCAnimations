package sekwah.mods.sekcanimations.common;

import net.minecraftforge.common.MinecraftForge;
import sekwah.mods.sekcanimations.client.TickHandlerClient;

public class CommonProxy {

    public void startUsageReport() {

    }

    public void initTickHandlers()
    {
        tickHandlerServer = new TickHandlerServer();

        MinecraftForge.EVENT_BUS.register(tickHandlerServer);
    }

    public TickHandlerServer tickHandlerServer;

    public TickHandlerClient tickHandlerClient;

}
