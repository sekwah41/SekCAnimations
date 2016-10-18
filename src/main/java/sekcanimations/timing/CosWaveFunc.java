package sekcanimations.timing;

public class CosWaveFunc implements TimingFunction {

    @Override
    public float progress(float currentTime, float duration) {
        double func = (currentTime / duration) * (Math.PI / 2d);
        return (float) Math.cos(func) * 0.5f + 0.5f;
    }

}
