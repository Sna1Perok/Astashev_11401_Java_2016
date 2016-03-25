package ru.kpfu.itis.Group11401.Astashev.Task010.Football;

/**
 * Created by 1 on 15.02.2016.
 */

public class BadWeather implements Weather {

    private int intensity;
    private int time;
    private int forecast;

    public int getIntensity() {
        return intensity;
    }

    public int getTime() {
        return time;
    }

    public int getForecast() {
        return forecast;
    }

    public BadWeather(int intensity, int time, int forecast) {
        this.intensity = intensity;
        this.time = time;
        this.forecast = forecast;
    }

    @Override
    public void rain(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Идет сильный дождь, и кажется он никогда не закончится");
            this.time++;
        } else {
            if (forecast > 0) {
                this.forecast++;
                System.out.println("Будет дождь");
            }
        }
    }

    @Override
    public void fog(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Над полем навис туман");
            this.time++;
            this.time++;
        } else {
            if (forecast > 0) {
                System.out.println("Надвигается туман");
                this.forecast++;
                this.forecast++;
            }
        }
    }

    @Override
    public void rainAndSnow(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Идет сильный дождь и снег, и кажется он никогда не закончится");
            this.time--;
        } else {
            if (forecast > 0) {
                System.out.println("Надвигается непонятный дождь");
                this.forecast--;
            }
        }
    }

    @Override
    public void sunny() {
        System.out.println("Произошла какая-то ошибка, прознозируют солнце, но его нету и кажется не планируется," +
                " погода ведь ужасная");
        this.time--;
    }

    @Override
    public void thunder(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Идет сильныя гроза, и кажется она никогда не закончится");
            this.time--;
        } else {
            if (forecast > 0) {
                System.out.println("Надвигается гроза");
                this.time--;
            }
        }
    }
}