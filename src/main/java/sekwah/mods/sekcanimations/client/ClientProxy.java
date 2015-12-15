package sekwah.mods.sekcanimations.client;

import cpw.mods.fml.common.FMLCommonHandler;
import sekwah.mods.sekcanimations.common.CommonProxy;

public class ClientProxy extends CommonProxy {

    public void startUsageReport() {

    }

    public void initTickHandlers()
    {
        super.initTickHandlers();
        tickHandlerClient = new TickHandlerClient();
        FMLCommonHandler.instance().bus().register(tickHandlerClient);
    }

}
