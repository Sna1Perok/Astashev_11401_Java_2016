package ru.kpfu.itis.Group11401.Astashev.Task010.Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class Observer implements Spectator {


   private int count;
    private   boolean pyrotechnics;
    private  boolean performance;
    private  boolean posters;
    private  String sector;
    private int teamSpirit;

    public int getCount() {
        return count;
    }

    public boolean isPyrotechnics() {
        return pyrotechnics;
    }

    public boolean isPerformance() {
        return performance;
    }

    public boolean isPosters() {
        return posters;
    }

    public String getSector() {
        return sector;
    }

    public int getTeamSpirit() {
        return teamSpirit;
    }

    public Observer(int count, boolean pyrotechnics, boolean performance, boolean posters, String sector, int teamSpirit){
        this.count = count;
        this.sector  = sector;
        this.pyrotechnics = pyrotechnics;
        this.performance = performance;
        this.posters = posters;
        this.teamSpirit = teamSpirit;
    }
    @Override
    public void shout() {
        this.teamSpirit++;
        System.out.println("Зрители сектора" + this.sector + " кричат что-то не понятное");
    }

    @Override
    public void sign() {
        if (performance) {
            this.performance = false;
            System.out.println("На трибунах сектора " + this.sector + " зрители устроили перфоманс");
        }
    }

    @Override
    public void cheer() {
        if (posters) {
            this.posters = false;
            System.out.println("На трибунах фанатов " + this.sector + " появяются плакаты с символикой клуба");
        }
    }

    @Override
    public void usetp() {
        if (count > 2000) {
            if (pyrotechnics) {
                this.pyrotechnics = false;
                System.out.println("На трибунах сектора " + this.sector + " нашлись зрители у которых есть пиротехника" +
                        " слышны взрывы пиротехники и видно дымовые шашки");
            }
        }
        System.out.println("Зрители не довольны");
    }

    @Override
    public void fight(Fans fans) {
        this.pyrotechnics = false;
        System.out.println("Зритеи секстора " + this.sector + " начинают паниковать");
    }

}