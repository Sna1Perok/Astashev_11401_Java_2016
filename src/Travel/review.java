package Travel;

import java.util.ArrayList;

/**
 * Created by 1 on 12.02.2016.
 */

interface review {

    ArrayList<String> getReview();

    boolean addreview(String review);

    boolean deletereview(String review);
}