package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class FootballPlayer implements Player {
    private String name;
    private boolean iHaveABoll;
    private int card;

    private int attackScill;
    private int defendScill;

    public String getName() {
        return name;
    }

    public int getCard() {
        return card;
    }



    public int getAttackScill() {
        return attackScill;
    }

    public int getDefendScill() {
        return defendScill;
    }

    public boolean isiHaveABoll() {
        return iHaveABoll;
    }

    public FootballPlayer(String name, int card, int attackScill, int defendScill, boolean iHaveABoll) {
        this.attackScill = attackScill;
        this.defendScill = defendScill;
        this.name = name;
        this.card = card;
        this.iHaveABoll = iHaveABoll;
        // this.team = team;
    }

    public static void addCard() {

    }


    @Override
    public void giveThePass(FootballPlayer fname) {
        if (this.attackScill < 30 && this.defendScill < 30) {
            System.out.println("Игрок " + this.name + " делает пасс своему напарнику по команде " + fname.name + " но к сожаление он не проходит");
            this.iHaveABoll = false;
        }
        if (this.attackScill > 30 && this.attackScill < 50 && this.defendScill > 30 && this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " делает хороший пасс своему напарнику по команде " + fname.name);
            this.iHaveABoll = false;
            fname.iHaveABoll = true;
        }
        if (this.attackScill > 50 && this.defendScill > 50) {
            System.out.println("Игрок " + this.name + " делает филигранный пасс своему напарнику по команде " + fname.name + " и он выходит 1 на 1");
            this.iHaveABoll = false;
            fname.iHaveABoll = true;
        }
    }

    @Override
    public void doCanopy(FootballPlayer footballPlayer) {
        if (this.attackScill < 30 && this.defendScill < 30) {
            System.out.println("Игрок " + this.name + " делает навес своему напарнику по команде, но не понятно куда и зачем");
            this.iHaveABoll = false;
        }
        if (this.attackScill > 30 && this.attackScill < 50 && this.defendScill > 30 && this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " делает хороший навес своему напарнику по команде ");
            this.iHaveABoll = false;
            footballPlayer.iHaveABoll = true;
        }
        if (this.attackScill > 50 && this.defendScill > 50) {
            System.out.println("Игрок " + this.name + " делает филигранный навес своему напарнику по команде в штрафную зону");
            this.iHaveABoll = false;
            footballPlayer.iHaveABoll = true;
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
            this.iHaveABoll = false;
            footballPlayer.iHaveABoll = true;
            System.out.println("Игрок " + this.name + " пытается обвести игрока " + footballPlayer.name + " но у него к сожалению это не получается");
        } else {
           this.iHaveABoll = true;
            System.out.println("Игрок " + this.name + " изящно обводит игрока " + footballPlayer.name + " и оставляет его позади");
        }
    }
}