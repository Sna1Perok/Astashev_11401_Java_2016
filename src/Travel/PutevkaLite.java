package Travel;

/**
 * Created by 1 on 12.02.2016.
 */

public class PutevkaLite implements Putevka {
    String path;
    int howlong;
    int count;

    public PutevkaLite(String path, int howLong, int count) {
        this.path = path;
        this.howlong = howLong;
        this.count = count;
    }


    @Override
    public void addPutevka(String id, String path, int count, int longdays) {

    }

    @Override
    public void buyPutevka(String id) {

    }

    @Override
    public void deletePutevka(String id) {

    }
}