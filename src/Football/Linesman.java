package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class Linesman implements Referi {
    int position;
    int expirience;
    String name;
    int age;

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

    public Linesman(int position, int expirience, int age, String name) {
        this.position = position;
        this.age = age;
        this.expirience = expirience;
        this.name = name;
    }

    @Override
    public void findOffence(FootballPlayer footballPlayer) {
        if (this.expirience < 40) {
            this.expirience--;
            System.out.println("Боковой не арбитр заметил нарушени игрока " + footballPlayer.getName());
        }
        if (this.expirience > 40) {
            this.expirience++;
            System.out.println("Боковой арбитр заметил нарушени игрока " + footballPlayer.getName());
            whistle();
        }

    }

    @Override
    public void whistle() {
        System.out.println("Боковой арбит поднимает свистит и поднимает флажок");
        this.expirience++;
    }

    @Override
    public void showTheCard( FootballPlayer name) {
        this.expirience++;
        System.out.println("Боковой арбитр не может показать карточку игруко");
    }

    @Override
    public void offside(FootballPlayer footballPlayer,Linesman linesman) {
        if (this.expirience < 40) {
            this.expirience--;
            System.out.println("Боковой не арбитр заметил офсайда игрока " + footballPlayer.getName());
        }
        if (this.expirience > 40) {
            this.expirience++;
            System.out.println("Боковой арбитр заметил офсайд игрока " + footballPlayer.getName());
        }
        whistle();

    }
}