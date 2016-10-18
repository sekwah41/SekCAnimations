package sekcanimations.timing;

/**
 * Created by sekwah on 18/10/2016.
 */
public class TimelineHandler {



    public float percentRemaining(float progress, float oldProgress){
        float oldRemProgress = 1f - oldProgress;
        float remProgress = oldProgress - progress;
        return remProgress / oldRemProgress;
    }

    public float progress(float currentTime, float lastTime, float startTime, float endTime) {
        float oldTime = currentTime - startTime;
        float time = currentTime - startTime;
        float length = endTime - startTime;

        return this.percentRemaining(time / length, oldTime / length);
    }
}
