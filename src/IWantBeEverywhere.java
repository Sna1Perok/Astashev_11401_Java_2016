/**
 * Created by 1 on 12.02.2016.
 */

public class IWantBeEverywhere implements WhereYouWantBe {

    int howlongYouWillFlying;

    @Override
    public int howlongYouWillFlying() {
        return 0;
    }

    @Override
    public boolean island() {
        System.out.println("i want to going to island");
        return true;
    }

    @Override
    public boolean bigCity() {
        System.out.println("i want to flying to big city");
        return true;
    }

    @Override
    public boolean Europ() {
        System.out.println("i want to flying to Europe");
        return true;
    }

    @Override
    public boolean Russia() {
        System.out.println("i want to flying to Russia");
        return true;
    }

    @Override
    public boolean USA() {
        System.out.println("i want to flying to USA");
        return true;
    }
}