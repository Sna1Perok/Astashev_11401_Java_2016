package ru.kpfu.itis.Group11401.Astashev.Task010.Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class MainReferee implements Referi {
    private int position;
    private int expirience;
    private String name;
    private int age;

    public int getPosition() {
        return position;
    }

    public int getExpirience() {
        return expirience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MainReferee(int position, int expirience, int age, String name) {
        this.position = position;
        this.age = age;
        this.expirience = expirience;
        this.name = name;
    }

    @Override
    public void findOffence(FootballPlayer footballPlayer) {
        if (this.expirience < 40 && age < 31) {
           this.expirience--;
            System.out.println("Судья " + this.name + "не  заметил нарушени игрока " + footballPlayer.getName());
        }
        if (this.expirience > 40 && age > 30) {
            this.expirience++;
            System.out.println("Судья" + this.name + "  заметил нарушени игрока " + footballPlayer.getName());
            showTheCard(footballPlayer);
            whistle();
        }
    }

    @Override
    public void whistle() {
        this.expirience++;
        System.out.println("Cудья " + this.name + "поднимает свистит и поднимает флажок");
    }

    @Override
    public void showTheCard( FootballPlayer footballPlayer) {
        this.expirience++;
        System.out.println("Судья" + this.name + "  заметил нарушени игрока " + footballPlayer.getName());
        footballPlayer.addCard();
    }

    @Override
    public void offside(FootballPlayer footballPlayer,Linesman linesman) {
        this.expirience++;
        System.out.println("Главный судья не фиксирует офсайд, но это делает боковой орбитр " + linesman.name);
        linesman.offside(footballPlayer,linesman);

    }
}