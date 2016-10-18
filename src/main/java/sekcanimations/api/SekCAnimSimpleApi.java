package sekcanimations.api;

import cpw.mods.fml.common.Loader;

/**
 *
 * NOTE This class should be used to access stuff for compatability and/or very basic features. It +
 *
 *
 * Took the idea of this from seeing iChun do something similar, thanks bud ;)
 *
 * If you want to add support for any mod using anims just copy this file into your mod and use it to communicate without
 * needing a dependency.
 *
 * Also use Loader.isModLoaded("sekcanims") or the SekCAnimSimpleApi.isloaded() and dont just keep calling the methods taking advantage
 * of the fact it still works.
 *
 *
 * Would have been called Api but if there is another class called wanting to be used it would start to look messy to use both.
 * Basically the name is too generic.
  */
public final class SekCAnimSimpleApi {

    public static boolean isLoaded(){
        return Loader.isModLoaded("sekcanims");
    }


    /**
     * If this is called once then it will leave the rendering off forever unless another mod is interfering with it.
     *
     * If you want to specifically decide when they should or should not render decide on the {@link net.minecraftforge.client.event.RenderPlayerEvent.Pre}
     * and set it during the HIGHEST priority. This will allow for choosing per player.
     *
     * @param shouldRender
     */
    public static void setRenderPlayer(boolean shouldRender){
        try {
            Class.forName("sekcanimations.common.core.ApiHandler").getDeclaredMethod("setRenderPlayer", Boolean.class).invoke(shouldRender);
        } catch (Exception e) {
            return;
        }
    }

    /**
     * If this is called once then it will leave the rendering off forever unless another mod is interfering with it.
     *
     * If you want to specifically decide when they should or should not render decide on the {@link net.minecraftforge.client.event.RenderHandEvent}
     * and set it during the HIGHEST priority. This will allow for choosing per player.
     *
     * @param shouldRender
     */
    public static void setRenderPlayerHand(boolean shouldRender){
        try {
			Class.forName("sekcanimations.common.core.ApiHandler").getDeclaredMethod("setRenderPlayerHand", Boolean.class).invoke(shouldRender);
		} catch (Exception e) {
            return;
		}
    }




}
