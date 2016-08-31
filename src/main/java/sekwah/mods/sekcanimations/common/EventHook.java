package sekwah.mods.sekcanimations.common;


import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

/**
 * Created on 13/12/2015.
 *
 * @author sekwah41
 */
public class EventHook {



    // Is client side only
    @SubscribeEvent
    public void onClientConnect(FMLNetworkEvent.ClientConnectedToServerEvent event){
        resetAllAnimTrackers();
    }

    // Is client side only
    @SubscribeEvent
    public void onClientDisonnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent event){
        resetAllAnimTrackers();
    }

    public void resetAllAnimTrackers(){
        // TODO add code to clear all hashmaps and reset all anim data being tracked by the user.
    }

}
