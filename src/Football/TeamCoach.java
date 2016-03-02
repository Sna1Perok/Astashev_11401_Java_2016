package Football;

/**
 * Created by 1 on 13.02.2016.
 */

public class TeamCoach implements Coach {
    private String name;
    private String team;
    private int age;
    private int experience;


    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public TeamCoach(String name, String team, int age, int experience) {
        this.age = age;
        this.experience = experience;
        this.name = name;
        this.team = team;
    }


    @Override
    public FootballPlayer replacement(FootballPlayer footballPlayer, FootballPlayer footballPlayer1) {
        if (this.experience < 30) {
            experience--;
            System.out.println("Тренер делает плохую замену игрока  - " + footballPlayer.getName() + " на - " + footballPlayer1.getName());
        }
        if (this.experience > 30 && this.experience < 50) {
            experience++;
            System.out.println("Тренер делает замену которую все уже давно ждали, игрока  - " + footballPlayer.getName() + " на - " + footballPlayer1.getName());
        }
        if (this.experience > 50) {
            experience += 2;
            System.out.println("Тренер делает нужную замену заменуигрока  - " + footballPlayer.getName() + " на - " + footballPlayer1.getName());
        }
        System.out.println("Замена игрока  - " + footballPlayer.getName() + " на - " + footballPlayer1.getName());
        return null;
    }

    @Override
    public void prompt() {
        if (this.age < 40) {
            experience++;
            System.out.println("Тренер" + this.name + "  что-то громко кричит своей команде");
        }
        if (this.age > 40) {
            experience--;
            System.out.println("Тренер" + this.name + " пытается что-то  кричитать своей команде, но его никто не слышит");
        }


    }

    @Override
    public void tolkToTheAssistant(FootballPlayer footballPlayer) {
        System.out.println(" Тренер " + this.name + "разговариват со совим помощником о возможной замене - " + footballPlayer.getName());
    }
}