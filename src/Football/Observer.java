package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class Observer implements Spectator {


    int count;
    boolean pyrotechnics;
    boolean performance;
    boolean posters;
    String sector;

    public Observer(int count, boolean pyrotechnics, boolean performance, boolean posters, String sector){
        this.count = count;
        this.sector  = sector;
        this.pyrotechnics = pyrotechnics;
        this.performance = performance;
        this.posters = posters;
    }
    @Override
    public void shout() {
        System.out.println("Зрители сектора" + this.sector + " кричат что-то не понятное");
    }

    @Override
    public void sign() {
        if (performance) {
            System.out.println("На трибунах сектора " + this.sector + " зрители устроили перфоманс");
        }
    }

    @Override
    public void cheer() {
        if (posters) {
            System.out.println("На трибунах фанатов " + this.sector + " появяются плакаты с символикой клуба");
        }
    }

    @Override
    public void usetp() {
        if (count > 2000) {
            if (pyrotechnics) {
                System.out.println("На трибунах сектора " + this.sector + " нашлись зрители у которых есть пиротехника" +
                        " слышны взрывы пиротехники и видно дымовые шашки");
            }
        }
        System.out.println("Зрители не довольны");
    }

    @Override
    public void fight(Fans fans) {
        System.out.println("Зритеи секстора " + this.sector + " начинают паниковать");
    }

}