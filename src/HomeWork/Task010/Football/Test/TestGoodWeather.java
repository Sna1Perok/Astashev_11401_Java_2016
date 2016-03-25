package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.GoodWeather;

public class TestGoodWeather {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );

    @Test
    public void ConstructorGoodWeatherShouldBeRight() {
        GoodWeather badWeather = (GoodWeather) ac.getBean("goodWeather");
        int intensity = 1;
        int time = 1;
        int forecast = 3;
        Assert.assertTrue(intensity == badWeather.getIntensity() &&
                time == badWeather.getTime() && forecast == badWeather.getForecast());
    }

    @Test
    public void GetterGoodWeatherIntensityBeRight() {
        // GoodWeather badWeather = new GoodWeather(1, 1, 3);
        GoodWeather badWeather = (GoodWeather) ac.getBean("goodWeather");
        int intensity = 1;
        Assert.assertTrue(intensity == badWeather.getIntensity());
    }

    @Test
    public void GetterGoodWeatherTimeBeRight() {
        // GoodWeather badWeather = new GoodWeather(1, 1, 3);
        GoodWeather badWeather = (GoodWeather) ac.getBean("goodWeather");
        int time = 1;
        Assert.assertTrue(time == badWeather.getTime());
    }

    @Test
    public void GetterGoodWeatherForecastBeRight() {
        // GoodWeather badWeather = new GoodWeather(1, 1, 3);
        GoodWeather badWeather = (GoodWeather) ac.getBean("goodWeather");
        int forecast = 3;
        Assert.assertTrue(forecast == badWeather.getForecast());
    }

    @Test
    public void ConstructorGoodWeatherShouldBeCorrect() {
        // GoodWeather goodWeather = new GoodWeather(3, 3, 3);
        GoodWeather goodWeather = (GoodWeather) ac.getBean("goodWeather1");
        int time = 3;
        int identicy = 3;
        int forecast = 3;
        Assert.assertTrue(time == goodWeather.getTime() && identicy == goodWeather.getIntensity() &&
                forecast == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherShouldMakeARain() {
        // GoodWeather goodWeather = new GoodWeather(3, 3, 3);
        GoodWeather goodWeather = (GoodWeather) ac.getBean("goodWeather2");
        int time = 2;
        goodWeather.rain(2, 2, 2);
        Assert.assertTrue(time + 1 == goodWeather.getTime());
    }

    @Test
    public void MethodRainInGoodWeatherWithLightRain() {
        // GoodWeather goodWeather = new GoodWeather(2, 2, -3);
        GoodWeather goodWeather = (GoodWeather) ac.getBean("goodWeather3");
        int forecast = -3;
        goodWeather.rain(4, 4, -3);
        Assert.assertTrue(forecast + 1 == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherWithLightFog() {
        // GoodWeather goodWeather = new GoodWeather(2, 2, -3);
        GoodWeather goodWeather = (GoodWeather) ac.getBean("goodWeather3"); int forecast = -3;
        goodWeather.fog(4, 4, -3);
        Assert.assertTrue(forecast + 1 == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherShouldMakeRainAndSnow() {
        // GoodWeather goodWeather = new GoodWeather(2, 2, -3);
        GoodWeather goodWeather = (GoodWeather) ac.getBean("goodWeather3"); int forecast = -3;
        goodWeather.rainAndSnow(4, 4, -3);
        Assert.assertTrue(forecast + 1 == goodWeather.getForecast());
    }

    @Test
    public void MethodRainInGoodWeatherShouldSunny() {
        // GoodWeather goodWeather = new GoodWeather(2, 2, 2);
        GoodWeather goodWeather = (GoodWeather) ac.getBean("goodWeather2");
        int time = 2;
        goodWeather.sunny();
        Assert.assertTrue(time + 1 == goodWeather.getTime());
    }

    @Test
    public void MethodRainInGoodWeatherShouldThunder() {
        // GoodWeather goodWeather = new GoodWeather(2, 2, 2);
        GoodWeather goodWeather = (GoodWeather) ac.getBean("goodWeather2");  int time = 2;
        goodWeather.thunder(2, 2, 2);
        Assert.assertTrue(time + 1 == goodWeather.getForecast());
    }

}