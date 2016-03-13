package sekwah.mods.sekcanimations.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;

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
