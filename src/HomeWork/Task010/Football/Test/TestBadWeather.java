package ru.kpfu.itis.Group11401.Astashev.Task010.Football.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.Group11401.Astashev.Task010.Football.BadWeather;

public class TestBadWeather {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task010/Football/spring-config.xml"
    );
    @Test
    public void ConstructorBadWeatherShouldBeRight() {
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather");
        int intensity = 1;
        int time = 1;
        int forecast = 3;
        Assert.assertTrue(intensity == badWeather.getIntensity() &&
                time == badWeather.getTime() && forecast == badWeather.getForecast());
    }

    @Test
    public void GetterBadWeatherIntensityBeRight() {
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather");
        int intensity = 1;
        Assert.assertTrue(intensity == badWeather.getIntensity());
    }

    @Test
    public void GetterBadWeatherTimeBeRight() {
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather");
        int time = 1;
        Assert.assertTrue(time == badWeather.getTime());
    }

    @Test
    public void GetterBadWeatherForecastBeRight() {
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather");
        int forecast = 3;
        Assert.assertTrue(forecast == badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTheRain() {
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather1");
        int k = badWeather.getTime();
        badWeather.rain(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeTheRain_forecast3() {
        //BadWeather badWeather = new BadWeather(1, 3, 3);
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather2");
        int k = badWeather.getForecast();
        badWeather.rain(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeThefog() {
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather1");
        int k = badWeather.getTime();
        badWeather.fog(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeThefog_forecast3() {
       // BadWeather badWeather = new BadWeather(1, 3, 3);
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather2");
        int k = badWeather.getForecast();
        badWeather.fog(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k < badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTherainAndSnow() {
        //BadWeather badWeather = new BadWeather(3, 3, 3);
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather1");
        int k = badWeather.getTime();
        badWeather.rainAndSnow(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeTheRainAndSnow_forecast3() {
        //BadWeather badWeather = new BadWeather(1, 1, 4);
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather3");
        int k = badWeather.getForecast();
        badWeather.rainAndSnow(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTheSunny() {
        //BadWeather badWeather = new BadWeather(1, 1, 4);
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather3");
        int k = badWeather.getTime();
        badWeather.sunny();
        Assert.assertTrue(k < badWeather.getForecast());
    }

    @Test
    public void MethodRainShouldMakeTheThunder() {
        //BadWeather badWeather = new BadWeather(3, 3, 3);
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather1");
        int k = badWeather.getTime();
        badWeather.thunder(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getTime());
    }

    @Test
    public void MethodRainShouldMakeTheThunder_forecast3() {
        //BadWeather badWeather = new BadWeather(1, 1, 4);
        BadWeather badWeather =(BadWeather) ac.getBean("badWeather3");
        int k = badWeather.getTime();
        badWeather.thunder(badWeather.getIntensity(), badWeather.getTime(), badWeather.getForecast());
        Assert.assertTrue(k > badWeather.getTime());
    }
}