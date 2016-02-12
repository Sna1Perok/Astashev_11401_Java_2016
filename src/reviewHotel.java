import java.util.ArrayList;

/**
 * Created by 1 on 12.02.2016.
 */

public class reviewHotel implements review {
    ArrayList<String> reviewHotel;


    @Override
    public ArrayList<String> getReview() {
        return reviewHotel;
    }

    @Override
    public boolean addreview(String review) {
        if(reviewHotel.add(review)){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean deletereview(String review) {

        return false;
    }
}