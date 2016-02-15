package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class Linesman implements Referi {
    int position;
    int expirience;
    String name;
    int age;

    public Linesman(int position, int expirience, int age, String name) {
        this.position = position;
        this.age = age;
        this.expirience = expirience;
        this.name = name;
    }

    @Override
    public void findOffence(FootballPlayer footballPlayer) {
        if (this.expirience < 40) {
            System.out.println("Боковой не арбитр заметил нарушени игрока " + footballPlayer.name);
        }
        if (this.expirience > 40) {
            System.out.println("Боковой арбитр заметил нарушени игрока " + footballPlayer.name);
            whistle();

        }

    }

    @Override
    public void whistle() {
        System.out.println("Боковой арбит поднимает свистит и поднимает флажок");
        flag();
    }

    @Override
    public void showTheCard( FootballPlayer name) {
        System.out.println("Боковой арбитр не может показать карточку игруко");
    }

    @Override
    public void offside(FootballPlayer footballPlayer,Linesman linesman) {
        if (this.expirience < 40) {
            System.out.println("Боковой не арбитр заметил офсайда игрока " + footballPlayer.name);
        }
        if (this.expirience > 40) {
            System.out.println("Боковой арбитр заметил офсайд игрока " + footballPlayer.name);
        }
        whistle();

    }

    private void flag() {
        if (this.age < 70) {
            System.out.println("боковой арбитр поднимает флажок");
        }
        System.out.println("боковой арбитр поднимает флажок, но по непонятным причинам не в ту сторону, вполне вероятно из-за его возраста");
    }

}