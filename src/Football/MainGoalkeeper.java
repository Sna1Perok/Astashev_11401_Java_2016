package Football;

/**
 * Created by 1 on 15.02.2016.
 */

public class MainGoalkeeper implements Goalkeeper {
    private int scill;
    private int experience;
    private String name;
    private int age;

    public int getScill() {
        return scill;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

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
            this.experience++;
            return true;
        } else {
            System.out.println("Игрок" + this.name + " делает резкий рывок на игрока! Но к сожалению из-за не достатка опыта" +
                    " у него не получается обмануть игрока");
            this.experience --;
        }
        return false;
    }

    @Override
    public void vait(String name) {
        this.experience++;
        System.out.println("Вратарь " + this.name + " выжидает");
    }

    @Override
    public void jump(String name, int age) {
        if (age < 50) {
            System.out.println("Вратарь" + this.name + " делает блистательный прижок к мячу");
            this.experience++;
        } else {
            System.out.println("Вратарь" + this.name + " делает  прижок к мячу, но резко хватается за спину, кажется, годы берут свое");
            this.experience--;
        }
    }
}