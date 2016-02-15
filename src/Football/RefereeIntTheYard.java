package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class RefereeIntTheYard implements Player, Referi {

    String name;
    int card;
    String team;
    int attackScill;
    int defendScill;
    int position;
    int expirience;
    int age;

    @Override
    public void giveThePass(FootballPlayer fname) {
        if (this.attackScill < 30 && this.defendScill < 30) {
            System.out.println("Игрок " + this.name + " делает пасс своему напарнику по команде " + fname.name + " но к сожаление он проходит");
        }
        if (this.attackScill > 30 && this.attackScill < 50 && this.defendScill > 30 && this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " делает хороший пасс своему напарнику по команде " + fname.name);
        }
        if (this.attackScill > 50 && this.defendScill > 50) {
            System.out.println("Игрок " + this.name + " делает филигранный пасс своему напарнику по команде " + fname.name + " и он выходит 1 на 1");
        }
    }

    @Override
    public void doCanopy() {
        if (this.attackScill < 30 && this.defendScill < 30) {
            System.out.println("Игрок " + this.name + " делает навес своему напарнику по команде, но не понятно куда и зачем");
        }
        if (this.attackScill > 30 && this.attackScill < 50 && this.defendScill > 30 && this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " делает хороший навес своему напарнику по команде ");
        }
        if (this.attackScill > 50 && this.defendScill > 50) {
            System.out.println("Игрок " + this.name + " делает филигранный навес своему напарнику по команде в штрафную зону");
        }
    }

    @Override
    public void toBreakTheRules(MainReferi mainReferi) {
        if (this.defendScill < 50 || this.attackScill < 50) {
            if (this.card < 1) {
                System.out.println("Игрок " + this.name + " идет в жестки подкат " + "и  судья " + mainReferi.name +
                        " показывает желтую карточку");
            } else {
                System.out.println("Игрок " + this.name + " идет в жестки подкат " + "и  судья " + mainReferi.name +
                        " показывает 2ю желтую карточку а затем и красную");
            }
        } else {
            System.out.println("Игрок " + this.name + " балансирует на грани нарушения правил и судья не решается останавить игру");
        }

    }

    @Override
    public void circlePlayer(FootballPlayer footballPlayer) {
        if (this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " пытается обвести игрока " + footballPlayer.name + " но у него к сожалению это не получается");
        } else {
            System.out.println("Игрок " + this.name + " изящно обводит игрока " + footballPlayer.name + " и оставляет его позади");
        }
    }

    @Override
    public void findOffence(FootballPlayer footballPlayer) {
        if (this.expirience < 40 && age < 31) {
            System.out.println("Судья " + this.name + "не  заметил нарушени игрока " + footballPlayer.name);
        }
        if (this.expirience > 40 && age > 30) {
            System.out.println("Судья" + this.name + "  заметил нарушени игрока " + footballPlayer.name);
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
        System.out.println("Судья" + this.name + "  заметил нарушени игрока " + footballPlayer.name);
        footballPlayer.addCard();
    }

    @Override
    public void offside(FootballPlayer footballPlayer,Linesman linesman) {
        System.out.println("Главный судья не фиксирует офсайд, но это делает боковой орбитр " + linesman.name);
        linesman.offside(footballPlayer,linesman);

    }
}