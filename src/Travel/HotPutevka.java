package Travel;

import java.util.ArrayList;

/**
 * Created by 1 on 12.02.2016.
 */

public class HotPutevka implements Putevka {
   ArrayList<HotPutevka> hotPut;
    int count;
    String path;
    int howLong;
    public HotPutevka(String id, String path, int howLong, int count) {
        this.path = path;
        this.howLong = howLong;
        this.count = count;
    }
    @Override
    public void addPutevka(String id, String path, int count, int longdays) {
        HotPutevka hp1 = new HotPutevka(id,path,count,longdays);
        hotPut.add(hp1);
    }

    @Override
    public void buyPutevka(String id) {
        System.out.println("вы купии путевку");
    }

    @Override
    public void deletePutevka(String id) {
        System.out.println("вы удалили путевку");
    }
}