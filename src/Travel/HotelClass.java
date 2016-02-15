package Travel;

/**
 * Created by 1 on 12.02.2016.
 */

class HotelClass implements Hotel {
    public HotelClass(String name, int age, String worktime, int stars) {
        this.name = name;
        this.age = age;
        this.worktime = worktime;
        this.stars = stars;
    }
    String name;
    int age;
    String worktime;
    int stars;

    @Override
    public boolean destoyHotel(String name) {
        System.out.println("Travel.Hotel" + name + " was destroy");
        return true;
    }

    @Override
    public void renameHotel(String name) {
        this.name = name;
        System.out.println(name + " - new name");
    }

    @Override
    public boolean worktime(String time) {
        this.worktime = time;
        System.out.println("work time " + worktime);
        return false;
    }
}