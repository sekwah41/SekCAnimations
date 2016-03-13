package sekwah.mods.sekcanimations.animdata;

/**
 * Created by on 13/03/2016.
 *
 * @author sekwah41
 */
public class TogglePose extends Pose {
    public TogglePose(String poseName, PartData... partData) {
        super(poseName, partData);
    }

    /**
     * This checks if the animation should still be on or not. This stops lingering
     * toggle animations. E.g. a player starts to fly so the animation is started
     * then this is run each update tick(not render update) the animation is on to
     * check if it should still be active.
     *
     * @return if the anim should be deactivated
     */
    public boolean checkActive(){
        return true;
    }

}
