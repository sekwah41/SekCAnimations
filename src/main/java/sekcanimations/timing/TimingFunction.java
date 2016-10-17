package sekcanimations.timing;

/**
 * Series of timing functions to be used to make the animation smoother or just add more characteristics.
 * The animation code will sort out how far it moves and how movement is handled.
 *
 */
public interface TimingFunction {

    /**
     * Amount to move to the next position.
     *
     * @param currentTime
     * @param lastTime
     * @param startTime
     * @param endTime
     * @return
     */
    float progress(float currentTime, float lastTime, float startTime, float endTime);

}
