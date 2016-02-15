package Football;

/**
 * Created by 1 on 15.02.2016.
 */

public class GoodWeather implements Weather {
    int intensity;
    int time;
    int forecast;

    public GoodWeather(int intensity, int time, int forecast) {
        this.intensity = intensity;
        this.time = time;
        this.forecast = forecast;
    }

    @Override
    public void rain(int intensity, int time, int forecast) {
        if (intensity > 0 && time > 0&&intensity < 3 && time < 3) {
            System.out.println("Маленький дождик не помеха, а только на ползу");
        } else {
            if (forecast < 0) {
                System.out.println("Будет дождь, наконец то");
            }
        }
    }

    @Override
    public void fog(int intensity, int time, int forecast) {
        System.out.println("Произошла какая-то ошибка, прознозируют туман, но его нету и кажется не планируется");
    }

    @Override
    public void rainAndSnow(int intensity, int time, int forecast) {
        System.out.println("Произошла какая-то ошибка, прознозируют дождь и снег, но его нету и кажется не планируется," +
                " погода ведь Хорошая");
    }

    @Override
    public void sunny() {
        System.out.println("Прекрасная погода для игры!");
    }

    @Override
    public void thunder(int intensity, int time, int forecast) {
        System.out.println("Произошла какая-то ошибка, прознозируют грозу, но ее нету и кажется не планируется," +
                " погода ведь Хорошая");
    }
}