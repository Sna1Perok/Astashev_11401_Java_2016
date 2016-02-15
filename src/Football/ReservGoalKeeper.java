package Football;/**
 * Created by 1 on 15.02.2016.
 */

public class ReservGoalKeeper implements Goalkeeper {

    int scill;
    int experience;
    String name;
    int age;
    public  ReservGoalKeeper(int scill,int experience,String name,int age){
        this.scill = scill;
        this.experience = experience;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean onTheBall(String name,int experience,int age) {

        if(experience>50){

            System.out.println("Запасной вратарь " + this.name + " кричит подсказки со скамейки");
            return true;
        }else {
            System.out.println("Запасной вратарь" + this.name + "играет в телефон на скамейке запасных");
        }
        return false;
    }

    @Override
    public void vait(String name) {
        System.out.println("Запасной вратарь " +this.name + "  ничего не делает");
    }

    @Override
    public void jump(String name,int age) {
        if(age<50){
            System.out.println("Запасной вратарь"+ this.name + " разминается на бровке");
        }else {
            System.out.println("Запасной вратарь"+ this.name + " втирает фастум гель в поясницу");
        }

    }
}