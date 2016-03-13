package sekwah.mods.sekcanimations.trackers;

/**
 * Try different animation track types and animation codes to get the generally nicest :)
 *
 * @author sekwah41
 */
public class PartTracker {

    public float posX = 0;
    public float posY = 0;
    public float posZ = 0;

    public float angleX = 0;
    public float angleY = 0;
    public float angleZ = 0;

    // If true then look at the
    public boolean animatingToPose = false;

    /**
     * Max distances moved that tick(update every tick)
     */
    public float velocityX = 0;

}
