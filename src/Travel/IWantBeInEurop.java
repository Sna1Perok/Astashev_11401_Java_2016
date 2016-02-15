package Travel;

/**
 * Created by 1 on 12.02.2016.
 */

public class IWantBeInEurop implements WhereYouWantBe {

    int howlongYouWillFlying;


    @Override
    public int howlongYouWillFlying() {
        return howlongYouWillFlying;
    }

    @Override
    public boolean island() {
        return false;
    }

    @Override
    public boolean bigCity() {
        return false;
    }

    @Override
    public boolean Europ() {
        return true;
    }

    @Override
    public boolean Russia() {
        return false;
    }

    @Override
    public boolean USA() {
        return false;
    }
}