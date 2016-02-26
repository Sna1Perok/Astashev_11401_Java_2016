/**
 * Created by 1 on 26.02.2016.
 */

public class Institute {
    private   String name;

    public String getName() {
        return name;
    }

    Institute(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                '}';
    }
}