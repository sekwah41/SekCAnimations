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
     * Maybe the inputs should be changed to stuff like length (of anim) and time rather than its start and stop times
     *
     * @param currentTime
     * @param duration
     * @return
     */
    public float progress(float currentTime, float duration);

}
