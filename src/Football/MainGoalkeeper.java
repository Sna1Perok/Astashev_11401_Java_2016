package Football;

/**
 * Created by 1 on 15.02.2016.
 */

public class MainGoalkeeper implements Goalkeeper {
    int scill;
    int experience;
    String name;
    int age;

    public MainGoalkeeper(int scill, int experience, String name, int age) {
        this.scill = scill;
        this.experience = experience;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean onTheBall(String name, int experience, int age) {
        if (experience > 50) {
            this.vait(this.name);
            this.jump(this.name, this.age);
            System.out.println("Игрок" + this.name + " выжидает немного и делает резкий рывок на игрока!И отбирает мяч");
            return true;
        } else {
            System.out.println("Игрок" + this.name + " делает резкий рывок на игрока! Но к сожалению из-за не достатка опыта" +
                    " у него не получается обмануть игрока");
        }
        return false;
    }

    @Override
    public void vait(String name) {
        System.out.println("Вратарь " + this.name + " выжидает");
    }

    @Override
    public void jump(String name, int age) {
        if (age < 50) {
            System.out.println("Вратарь" + this.name + " делает блистательный прижок к мячу");
        } else {
            System.out.println("Вратарь" + this.name + " делает  прижок к мячу, но резко хватается за спину, кажется, годы берут свое");
        }
    }
}