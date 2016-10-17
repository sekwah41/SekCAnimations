package sekcanimations.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

/**
 * Created on 14/12/2015.
 *
 * Updates the player render data(also resets the booleans for each updater, add a boolean to be changed so if the render is called
 * it updates the pose data for the client render, this way it will only activate if called and will only be called once).
 *
 * Also do general updates, probably best to keep pose changes tick based and most stuff tick based rather than spamming the renders
 * This will help the frame rate :)
 *
 * 20 fps animations would look rather laggy, allthough you could update position logic for recently rendered entities during ticks
 * and slowly sorta tween it to the next location to add smooth movement but less updates :)
 *
 * @author sekwah41
 */
public class TickHandlerClient {

    // TODO more hashmaps will be needed for entity animatiors and such. Possibly add a system where if the maps are not updated
    // for more than a certain time they are removed, and if a player or whatever comes into range without data it renders normal until
    // the data is retrieved or some other systems, just try to add efficiency to the system ;)
    public HashMap<String, AnimationDataClient> playerAnimData = new HashMap<String, AnimationDataClient>();

    @SubscribeEvent
    public void renderTick(TickEvent.RenderTickEvent event){

    }

    @SubscribeEvent
    public void worldTick(TickEvent.ClientTickEvent event) {

        if(event.phase == TickEvent.Phase.END && Minecraft.getMinecraft().theWorld != null) {

        }

    }

}
