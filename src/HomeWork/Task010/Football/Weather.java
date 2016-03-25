package ru.kpfu.itis.Group11401.Astashev.Task010.Football;

/**
 * Created by 1 on 13.02.2016.
 */
public interface Weather {
    void rain(int intensity, int time, int forecast);
    void fog(int intensity, int time, int forecast);
    void rainAndSnow(int intensity, int time, int forecast);
    void sunny();
    void thunder(int intensity, int time, int forecast);
}
