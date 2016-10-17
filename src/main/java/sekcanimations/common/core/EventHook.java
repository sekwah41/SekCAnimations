package sekcanimations.common.core;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

/**
 * Created on 13/12/2015.
 *
 * @author sekwah41
 */
public class EventHook {

    public boolean shouldRenderPlayer = true;

    public boolean shouldRenderPlayerHands = true;

    public boolean hasRenderedPlayer = false;

    public boolean hasRenderedPlayerHands = false;

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

    // This means it comes after morph but youll need to pay attention to others possibly.
    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onRenderHand(RenderHandEvent event){

        this.hasRenderedPlayerHands = false;

        if(event.isCanceled()){
            return;
        }

        if(!this.shouldRenderPlayerHands){
            return;
        }

        /**
         * Possibly have it so a mod has to enable it to edit players. Otherwise it can just be used for mobs
         * Though it may add its own poses and anims like mo bends and the newer legs in naruto
          */

        event.setCanceled(true);




        // TODO handle its own rendering

        this.hasRenderedPlayerHands = true;

    }

    // This means it comes after morph but youll need to pay attention to others possibly.
    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onRenderPlayer(RenderPlayerEvent.Pre event){

        this.hasRenderedPlayer = false;

        if(event.isCanceled()){
            return;
        }

        if(!this.shouldRenderPlayer){
            return;
        }

        event.setCanceled(true);




        this.hasRenderedPlayer = true;

    }

}
