/**
 * Created by 1 on 12.02.2016.
 */

public class RestaurauntInHotel implements Hotel, Restaurant{
    String name;
    String worktime;
    String namerestaurant;
    @Override
    public boolean destoyHotel(String name) {
        return false;
    }

    @Override
    public void renameHotel(String name) {
    }

    @Override
    public boolean worktime(String name) {
        System.out.println("Work time - " + worktime);
        return false;
    }

    @Override
    public boolean rezervation() {
        return true;
    }

    @Override
    public void writeBadOpinion() {
        System.out.println("If you want i can write bad opinion");
    }

    @Override
    public void callTheShef() {
        System.out.println("if you unpleasured you can call the sheff");
    }
}