package Football;/**
 * Created by 1 on 15.02.2016.
 */

public class BadWeather implements Weather {

    int intensity;
    int time;
    int forecast;

    public BadWeather(int intensity, int time, int forecast) {
        this.intensity = intensity;
        this.time = time;
        this.forecast = forecast;
    }

    @Override
    public void rain(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Идет сильный дождь, и кажется он никогда не закончится");
        } else {
            if (forecast > 0) {
                System.out.println("Будет дождь");
            }
        }
    }

    @Override
    public void fog(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Над полем навис туман");
        } else {
            if (forecast > 0) {
                System.out.println("Надвигается туман");
            }
        }
    }

    @Override
    public void rainAndSnow(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Идет сильный дождь и снег, и кажется он никогда не закончится");
        } else {
            if (forecast > 0) {
                System.out.println("Надвигается непонятный дождь");
            }
        }
    }

    @Override
    public void sunny() {
        System.out.println("Произошла какая-то ошибка, прознозируют солнце, но его нету и кажется не планируется," +
                " погода ведь ужасная");
    }

    @Override
    public void thunder(int intensity, int time, int forecast) {
        if (intensity > 2 && time > 2) {
            System.out.println("Идет сильныя гроза, и кажется она никогда не закончится");
        } else {
            if (forecast > 0) {
                System.out.println("Надвигается гроза");
            }
        }
    }
}