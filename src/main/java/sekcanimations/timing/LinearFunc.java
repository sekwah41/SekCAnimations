package sekcanimations.timing;

public class LinearFunc implements TimingFunction {

    @Override
    public float progress(float currentTime, float duration) {
        return currentTime / duration;
    }

}
