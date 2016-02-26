package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class MainReferi implements Referi {
    int position;
    int expirience;
    String name;
    int age;

    public MainReferi(int position, int expirience, int age, String name) {
        this.position = position;
        this.age = age;
        this.expirience = expirience;
        this.name = name;
    }

    @Override
    public void findOffence(FootballPlayer footballPlayer) {
        if (this.expirience < 40 && age < 31) {
            System.out.println("Судья " + this.name + "не  заметил нарушени игрока " + footballPlayer.getName());
        }
        if (this.expirience > 40 && age > 30) {
            System.out.println("Судья" + this.name + "  заметил нарушени игрока " + footballPlayer.getName());
            showTheCard(footballPlayer);
            whistle();
        }
    }

    @Override
    public void whistle() {
        System.out.println("Cудья " + this.name + "поднимает свистит и поднимает флажок");
    }

    @Override
    public void showTheCard( FootballPlayer footballPlayer) {
        System.out.println("Судья" + this.name + "  заметил нарушени игрока " + footballPlayer.getName());
        footballPlayer.addCard();
    }

    @Override
    public void offside(FootballPlayer footballPlayer,Linesman linesman) {
        System.out.println("Главный судья не фиксирует офсайд, но это делает боковой орбитр " + linesman.name);
        linesman.offside(footballPlayer,linesman);

    }
}