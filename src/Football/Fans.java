package Football;

/**
 * Created by 1 on 13.02.2016.
 */

public class Fans implements Spectator {
    int count;
    boolean pyrotechnics;
    boolean posters;
    String name;
    public Fans(String name,int count, boolean pyrotechnics, boolean posters) {
        this.count = count;
        this.pyrotechnics = pyrotechnics;
        this.posters = posters;
        this.name = name;
    }

    @Override
    public void shout() {
        System.out.println("Фанаты" + this.name + " кричат что-то не понятное");
    }

    @Override
    public void sign() {
        System.out.println("Фанаты поют +1  к духу команды");

    }

    @Override
    public void cheer() {
        if(posters){
            System.out.println("На трибунах фанатов"+ this.name +" появяются плакаты с символикой клуба");
        }
        System.out.println("Фанаты поддерживают команду, +2 к духу");
    }

    @Override
    public void usetp() {
        if(pyrotechnics){
            System.out.println("На трибунах фанатов"+ this.name +" слышны взрывы пиротехники и видно дымовые шашки");
        }
        System.out.println("Фанаты огорчены, -2 к духу");
    }

    @Override
    public void fight(Fans fans) {
        if(pyrotechnics){
            System.out.println("На трибунах фанатов"+ this.name +" слышны взрывы пиротехники и видно дымовые шашки");
        }
        System.out.println("Фанаты " + this.name + " начинаются драку с фанатами " + fans.name);
    }
}