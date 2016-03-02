package Football;

/**
 * Created by 1 on 12.02.2016.
 */

public class RefereeIntTheYard implements Player, Referi {

    private String name;
    private int card;
    private String team;
    private int attackScill;
    private int defendScill;
    private int position;
    private int expirience;
    private int age;
    private boolean iHaveABoll;

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

    public int getPosition() {
        return position;
    }

    public int getExpirience() {
        return expirience;
    }

    public int getAge() {
        return age;
    }

    public boolean isiHaveABoll() {
        return iHaveABoll;
    }

    public RefereeIntTheYard(boolean iHaveABoll, int age, int expirience, int position, int defendScill, int attackScill, String name, int card) {
        this.iHaveABoll = iHaveABoll;
        this.age = age;
        this.expirience = expirience;
        this.position = position;
        this.defendScill = defendScill;
        this.attackScill = attackScill;
        this.name = name;
        this.card = card;
    }

    @Override
    public void giveThePass(FootballPlayer footballPlayer) {
        if (this.attackScill < 30 && this.defendScill < 30) {
            this.iHaveABoll = false;
            System.out.println("Игрок " + this.name + " делает пасс своему напарнику по команде " + footballPlayer.getName() + " но к сожаление он не проходит");
        }
        if (this.attackScill > 30 && this.attackScill < 50 && this.defendScill > 30 && this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " делает хороший пасс своему напарнику по команде " + footballPlayer.getName());
            footballPlayer.setiHaveABoll(true);
            this.iHaveABoll = false;
        }
        if (this.attackScill > 50 && this.defendScill > 50) {
            System.out.println("Игрок " + this.name + " делает филигранный пасс своему напарнику по команде " + footballPlayer.getName() + " и он выходит 1 на 1");
            footballPlayer.setiHaveABoll(true);
            this.iHaveABoll = false;
        }
    }

    @Override
    public void doCanopy(FootballPlayer footballPlayer) {
        if (this.attackScill < 30 && this.defendScill < 30) {
            this.iHaveABoll = false;
            System.out.println("Игрок " + this.name + " делает навес своему напарнику по команде, но не понятно куда и зачем");
        }
        if (this.attackScill > 30 && this.attackScill < 50 && this.defendScill > 30 && this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " делает хороший навес своему напарнику по команде ");
            footballPlayer.setiHaveABoll(true);
            this.iHaveABoll = false;
        }
        if (this.attackScill > 50 && this.defendScill > 50) {
            footballPlayer.setiHaveABoll(true);
            this.iHaveABoll = false;
            System.out.println("Игрок " + this.name + " делает филигранный навес своему напарнику по команде в штрафную зону");
        }
    }

    @Override
    public void toBreakTheRules(MainReferi mainReferi) {
        if (this.defendScill < 50 || this.attackScill < 50) {
            if (this.card < 1) {
                this.expirience--;
                System.out.println("Игрок " + this.name + " идет в жестки подкат " + "и  судья " + mainReferi.getName() +
                        " показывает желтую карточку");
            } else {
                this.expirience--;
                System.out.println("Игрок " + this.name + " идет в жестки подкат " + "и  судья " + mainReferi.getName() +
                        " показывает 2ю желтую карточку а затем и красную");
            }
        } else {
            this.expirience--;
            System.out.println("Игрок " + this.name + " балансирует на грани нарушения правил и судья не решается останавить игру");
        }

    }

    @Override
    public void circlePlayer(FootballPlayer footballPlayer) {
        if (this.defendScill < 50) {
            System.out.println("Игрок " + this.name + " пытается обвести игрока " + footballPlayer.getName() + " но у него к сожалению это не получается");
            this.iHaveABoll = false;

        } else {
            this.iHaveABoll = true;
            System.out.println("Игрок " + this.name + " изящно обводит игрока " + footballPlayer.getName() + " и оставляет его позади");
        }
    }

    @Override
    public void findOffence(FootballPlayer footballPlayer) {
        if (this.expirience < 40 && age < 31) {
            this.expirience++;
            System.out.println("Судья " + this.name + "не  заметил нарушени игрока " + footballPlayer.getName());
        }
        if (this.expirience > 40 && age > 30) {
            this.expirience += 2;
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
    public void showTheCard(FootballPlayer footballPlayer) {

        System.out.println("Судья" + this.name + "  заметил нарушени игрока " + footballPlayer.getName());
        footballPlayer.addCard();
    }

    @Override
    public void offside(FootballPlayer footballPlayer, Linesman linesman) {
        System.out.println("Главный судья не фиксирует офсайд, но это делает боковой орбитр " + linesman.name);
        linesman.offside(footballPlayer, linesman);

    }
}