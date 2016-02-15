package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class FootballPlayer implements Player {
    String name;
    int card;
    String team;
    int attackScill;
    int defendScill;

    public FootballPlayer(String name, int card, int attackScill, int defendScill) {
        this.attackScill = attackScill;
        this.defendScill = defendScill;
        this.name = name;
        this.card = card;
        // this.team = team;
    }

    public static void addCard() {

    }


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
            mainReferi.findOffence(this);
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
}