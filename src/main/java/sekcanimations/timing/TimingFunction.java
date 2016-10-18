package sekcanimations.timing;

/**
 * Series of timing functions to be used to make the animation smoother or just add more characteristics.
 * The animation code will sort out how far it moves and how movement is handled.
 *
 */
public class TimingFunction {

    /**
     * Amount to move to the next position.
     *
     * @param currentTime
     * @param lastTime
     * @param startTime
     * @param endTime
     * @return
     */
    public float progress(float currentTime, float lastTime, float startTime, float endTime){
        return 1;
    }

    public float percentRemaining(float progress, float oldProgress){
        float oldRemProgress = 1f - oldProgress;
        float remProgress = oldProgress - progress;
        return remProgress / oldRemProgress;
    }

}
