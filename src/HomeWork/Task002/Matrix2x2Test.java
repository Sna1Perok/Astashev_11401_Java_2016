package HomeWork.Task002;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 1 on 23.02.2016.
 */

public class Matrix2x2Test {

    @Test
    public void MatrixShouldHaveRealNumber() {
        Matrix2x2 m1 = new Matrix2x2(2.0, 1.2, 2.2, 2.2);
        double a11 = 2.0;
        double a12 = 1.2;
        double a21 = 2.2;
        double a22 = 2.2;
        Matrix2x2 m2 = new Matrix2x2(a11, a12, a21, a22);
        Assert.assertTrue(m1.equals(m2));
    }

    @Test
    public void Matrix2x2ShouldHaveJust1Number() {
        Matrix2x2 m = new Matrix2x2(1.1);
        double a11 = 1.1;
        double a12 = 1.1;
        double a21 = 1.1;
        double a22 = 1.1;
        Matrix2x2 m2 = new Matrix2x2(a11, a12, a21, a22);
        Assert.assertTrue(m.equals(m2));
    }
    @Test
    public void Matrix2x2ShouldHaveDefaultMatrix() {
        Matrix2x2 m = new Matrix2x2();
        double a11 = 0;
        double a12 = 0;
        double a21 = 0;
        double a22 = 0;
        Matrix2x2 m2 = new Matrix2x2(a11,a12,a21,a22);

        Assert.assertTrue(m.equals(m2));
    }

    @Test
    public void Matrix2x2WithMasDouble() {
        double[][] mas = new double[][]{{1.1, 1.2}, {1.3, 1.4}};
        Matrix2x2 m = new Matrix2x2(mas[0][0], mas[0][1], mas[1][0], mas[1][1]);
        Matrix2x2 m2 = new Matrix2x2(mas);
        Assert.assertTrue(m.equals(m2));
    }

    @Test
    public void Matrix2x2ShouldAddedMatrix2x2() {
        Matrix2x2 m1 = new Matrix2x2(1, 1, 1, 1);
        Matrix2x2 m2 = new Matrix2x2(2, 2, 2, 2);
        m1 = m1.addMatrix(m1);
        Assert.assertTrue(m1.equals(m2));
    }

    @Test
    public void Matrix2x2ShouldAddedMatrix2x2Void() {
        Matrix2x2 m1 = new Matrix2x2(1, 1, 1, 1);
        Matrix2x2 m2 = new Matrix2x2(2, 2, 2, 2);
        m1.aadMatrix_1(m1);
        Assert.assertTrue(m1.equals(m2));
    }

    @Test
    public void Matrix2x2ShouldSubMatrix2x2() {
        Matrix2x2 m1 = new Matrix2x2(1, 1, 1, 1);
        Matrix2x2 m2 = new Matrix2x2(2, 2, 2, 2);
        m2 = m2.sub2x2(m1);
        Assert.assertTrue(m1.equals(m2));
    }

    @Test
    public void Matrix2x2ShouldSubMatrix2x2Void() {
        Matrix2x2 m1 = new Matrix2x2(1, 1, 1, 1);
        Matrix2x2 m2 = new Matrix2x2(2, 2, 2, 2);
        m2.subM2x2_1(m1);
        Assert.assertTrue(m1.equals(m2));
    }

    @Test
    public void Matrix2x2ShouldMultOnNumber() {
        Matrix2x2 m1 = new Matrix2x2(1, 1, 1, 1);
        Matrix2x2 m2 = new Matrix2x2(2, 2, 2, 2);
        m1 = m1.multNumber(2);
        Assert.assertTrue(m1.equals(m2));
    }
    @Test
    public void Matrix2x2ShouldMultOnNumberVoid() {
        Matrix2x2 m1 = new Matrix2x2(1, 1, 1, 1);
        Matrix2x2 m2 = new Matrix2x2(2, 2, 2, 2);
        m1.muilNamber_1(2);
        Assert.assertTrue(m1.equals(m2));
    }

    @Test
    public void Matrix2x2ShouldMultOnMatrix2x2() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);
        Matrix2x2 m3 = new Matrix2x2(8, 5, 20, 14);
        m1 = m1.multMatrix(m2);
        Assert.assertTrue(m1.equals(m3));
    }

    @Test
    public void Matrix2x2ShouldMultOnMatrix2x2Void() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);
        Matrix2x2 m3 = new Matrix2x2(8, 5, 20, 14);
        m1.multMateix(m2);
        Assert.assertTrue(m1.equals(m3));
    }

    @Test
    public void Matrix2x2ShouldDoTransp() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m3 = new Matrix2x2(1, 3, 2, 4);
        m1.transpM2x2();
        Assert.assertTrue(m1.equals(m3));
    }
    @Test
    public void Matrix2x2ShouldDontRightEquals() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m3 = new Matrix2x2(1, 3, 2, 4);
        Assert.assertEquals(false, m1.equals(m3));
    }

   @Test
    public void Matrix2x2ShouldHavetoString() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        String s = "1.0 2.0 3.0 4.0";
        //s = m1.toString();
        Assert.assertEquals("1.0 2.0 3.0 4.0", m1.toString());
    }

    @Test
    public void Matrix2x2ShouldDoDet() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Assert.assertEquals(-2, m1.detM2x2(), 1e-9);
    }

    @Test
    public void GetterShouldBeRightsA11() {
        Matrix2x2 m1 = new Matrix2x2(1.1, 1.2, 1.3, 1.4);
        Assert.assertEquals(1.1, m1.getMatr1(), 1e-9);
    }

    @Test
    public void GetterShouldBeRightsA12() {
        Matrix2x2 m1 = new Matrix2x2(1.1, 1.2, 1.3, 1.4);
        Assert.assertEquals(1.2, m1.getMatr2(), 1e-9);
    }

    @Test
    public void GetterShouldBeRightsA21() {
        Matrix2x2 m1 = new Matrix2x2(1.1, 1.2, 1.3, 1.4);
        Assert.assertEquals(1.3, m1.getMatr3(), 1e-9);
    }

    @Test
    public void GetterShouldBeRightsA22() {
        Matrix2x2 m1 = new Matrix2x2(1.1, 1.2, 1.3, 1.4);
        Assert.assertEquals(1.4, m1.getMatr4(), 1e-9);
    }


}