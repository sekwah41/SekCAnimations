package sekcanimations.common.core;

import sekcanimations.common.SekCAnimations;

public class ApiHandler {

    public static void setRenderPlayer(boolean shouldRender){
        SekCAnimations.instance.eventHandler.shouldRenderPlayer = shouldRender;
    }

    public static void setRenderPlayerHand(boolean shouldRender){
        SekCAnimations.instance.eventHandler.shouldRenderPlayerHands = shouldRender;
    }

}
