package CW190216.mockito;/**
 * Created by 1 on 19.02.2016.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class mockito0_0 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        InputStream is = mock(InputStream.class);
        int s = 0;
        when(is.available()).thenReturn(4).thenReturn(2).thenReturn(31).thenReturn(-10).thenReturn(-1);
        when(is.read()).thenReturn(4).thenReturn(-3).thenReturn(100).thenReturn(-101);
        while (is.available() != -1) {

            s += is.read();
            System.out.println(s);
        }
        System.out.println("that's all");
    }


}