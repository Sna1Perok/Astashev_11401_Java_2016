package Football;

/**
 * Created by 1 on 13.02.2016.
 */

public class Fans implements Spectator {
    private int count;
    private int teamSpirit;
    private boolean pyrotechnics;
    private boolean posters;
    private String name;

    public Fans(String name, int count, boolean pyrotechnics, boolean posters) {
        this.count = count;
        this.pyrotechnics = pyrotechnics;
        this.posters = posters;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public int getTeamSpirit() {
        return teamSpirit;
    }

    public boolean isPyrotechnics() {
        return pyrotechnics;
    }

    public boolean isPosters() {
        return posters;
    }

    public String getName() {
        return name;
    }

    public Fans(String name, int count, boolean pyrotechnics, boolean posters, int teamSpirit) {
        this.count = count;
        this.teamSpirit = teamSpirit;
        this.pyrotechnics = pyrotechnics;
        this.posters = posters;
        this.name = name;
    }

    @Override
    public void shout() {
        System.out.println("Фанаты" + this.name + " кричат что-то не понятное");
        this.teamSpirit++;
    }

    @Override
    public void sign() {
        System.out.println("Фанаты поют +1  к духу команды");
        this.teamSpirit++;
    }

    @Override
    public void cheer() {
        if (posters) {
            System.out.println("На трибунах фанатов " + this.name + " появяются плакаты с символикой клуба");
            this.teamSpirit += 10;
            this.posters = false;
        }
        System.out.println("Фанаты поддерживают команду, +2 к духу");
        this.teamSpirit += 2;
    }

    @Override
    public void usetp() {
        if (pyrotechnics) {
            System.out.println("На трибунах фанатов" + this.name + " слышны взрывы пиротехники и видно дымовые шашки");
            this.teamSpirit -= 1;
            this.pyrotechnics= false;
        }
        System.out.println("Фанаты огорчены, -2 к духу");
        this.teamSpirit -= 3;
    }

    @Override
    public void fight(Fans fans) {
        if (pyrotechnics) {
            System.out.println("На трибунах фанатов" + this.name + " слышны взрывы пиротехники и видно дымовые шашки");
            this.posters = false;
            this.pyrotechnics= false;
        }
        System.out.println("Фанаты " + this.name + " начинаются драку с фанатами " + fans.name);
        this.teamSpirit -= 1;
    }
}