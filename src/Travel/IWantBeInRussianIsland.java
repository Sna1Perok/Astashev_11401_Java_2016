package Travel;

/**
 * Created by 1 on 12.02.2016.
 */

public class IWantBeInRussianIsland implements WhereYouWantBe {

    int howlongYouWillFlying;


    @Override
    public int howlongYouWillFlying() {
        return howlongYouWillFlying;
    }

    @Override
    public boolean island() {
        return true;
    }

    @Override
    public boolean bigCity() {
        return false;
    }

    @Override
    public boolean Europ() {
        return false;
    }

    @Override
    public boolean Russia() {
        return true;
    }

    @Override
    public boolean USA() {
        return false;
    }
}