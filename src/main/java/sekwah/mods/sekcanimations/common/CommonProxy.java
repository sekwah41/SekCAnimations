package sekwah.mods.sekcanimations.common;

import cpw.mods.fml.common.FMLCommonHandler;
import sekwah.mods.sekcanimations.client.TickHandlerClient;

public class CommonProxy {

    public void startUsageReport() {

    }

    public void initTickHandlers()
    {
        tickHandlerServer = new TickHandlerServer();
        FMLCommonHandler.instance().bus().register(tickHandlerServer);
    }

    public TickHandlerServer tickHandlerServer;

    public TickHandlerClient tickHandlerClient;

}
