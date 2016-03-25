package sekwah.mods.sekcanimations.client;

import net.minecraftforge.common.MinecraftForge;
import sekwah.mods.sekcanimations.common.CommonProxy;

public class ClientProxy extends CommonProxy {

    public void startUsageReport() {

    }

    public void initTickHandlers()
    {
        super.initTickHandlers();
        tickHandlerClient = new TickHandlerClient();
        MinecraftForge.EVENT_BUS.register(tickHandlerClient);
    }

}
