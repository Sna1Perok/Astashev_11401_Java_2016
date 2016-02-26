package CW190216;/**
 * Created by 1 on 19.02.2016.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Main {
    public static void main(String[] args) {
        Result re = JUnitCore.runClasses(Vector2dTest.class);
        for (Failure f : re.getFailures()) {
            System.out.println(f);
        }
    }
}