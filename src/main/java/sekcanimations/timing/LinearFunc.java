package sekcanimations.timing;

public class LinearFunc extends TimingFunction {


    public float progress(float currentTime, float lastTime, float startTime, float endTime) {
        float oldTime = currentTime - startTime;
        float time = currentTime - startTime;
        float length = endTime - startTime;

        return this.percentRemaining(time / length, oldTime / length);
    }
}
