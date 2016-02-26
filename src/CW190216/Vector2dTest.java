package CW190216;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by 1 on 19.02.2016.
 */

public class Vector2dTest {
    @Test
    public void MethodShouldHaveMethodLength() {
        //Assert.fail();
        try {
            Method m = Vector2d.class.getMethod("length");
        } catch (NoSuchMethodException e) {
            //   Assert.fail(e.getMessage());
        }
    }

    @Test
    public void defaultVectorShouldHaveZeroLength() {
        //Assert.fail();
        Vector2d v = new Vector2d();
        Assert.assertEquals(0, v.length(), 1e-9);
    }

    @Test
    public void vectorShouldHaveCorrectLength() {
        Vector2d v = new Vector2d(3, 4);
        Assert.assertEquals(5, v.length(), 1e-9);
    }

    @Test
    public void ConstrucrSouldSaveParamInAttribute() {
        Vector2d v = new Vector2d(3, 4);
        Assert.assertTrue(3 == v.getX() && 4 == v.getY());
    }

    @Test
    public void vectorShouldAdded() {
        Vector2d v = new Vector2d(3, 4);
        Vector2d v1 = new Vector2d(3, 4);
         v.vectorAdd(v1);
        Assert.assertTrue(6 == v.getX() && 8 == v.getY());
    }

    @Test
    public void sumOfVector2dShouldAdeed() {
        Vector2d v1 = new Vector2d(3, 4);
        Vector2d v2 = new Vector2d(3, 4);
        v1.vectorAdd(v2);
        Vector2d v4 = new Vector2d(6, 8);
        Assert.assertTrue(v1.equals( v4));
    }

    @Test
    public void equalsShouldReturnTrueOnSameVectors() {
        Vector2d v1 = new Vector2d(3, 4);
        Vector2d v2 = new Vector2d(3, 4);
        Assert.assertTrue(v1.equals(v2));
    }
    @Test
    public void equalsShouldReturnTrueOnSameVectorss() {
        Vector2d v1 = new Vector2d(3, 4);
        Vector2d v2 = new Vector2d(3, 5);
        Assert.assertFalse(v1.equals(v2));
    }
    @Test
    public void equalsShouldReturnTrueOnSameVectorsss() {
        Vector2d v1 = new Vector2d(3, 4);
       int v2  = 10;
        Assert.assertFalse(v1.equals(v2));
    }

    @Test(expected =  ThrowLengthExeption.class)
    public void methodShouldMakeExeption()throws ThrowLengthExeption{
        Vector2d v = new Vector2d(1,2);
        v.reduceLengthBy(0);
    }
    @Test
    public void addVectordAndVectorMock() {
        Vector2d v = new Vector2d(2, 3);
        Vector2d v1 = mock(Vector2d.class);
        when(v1.getX()).thenReturn(2.0);
        when(v1.getY()).thenReturn(3.0);
        v.vectorAdd(v1);
        Assert.assertTrue(v.equals(v1));
    }
}