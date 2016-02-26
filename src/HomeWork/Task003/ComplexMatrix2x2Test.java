package HomeWork.Task003;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by 1 on 24.02.2016.
 */

public class ComplexMatrix2x2Test {
    @Test
    public void MatrixShouldMultWithMatrix() {
        ComplexNumber cn1 = new ComplexNumber(1,2);
        ComplexNumber cn2 = new ComplexNumber(1,2);
        ComplexNumber cn3 = new ComplexNumber(1,2);
        ComplexNumber cn4 = new ComplexNumber(1,2);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        cm.multComplexMatrix2x2(cm);
        ignoreStubs();
    }
    @Test
    public void MatrixShouldMakeRightDet() {
        ComplexNumber cn1 = new ComplexNumber(1,2);
        ComplexNumber cn2 = new ComplexNumber(1,2);
        ComplexNumber cn3 = new ComplexNumber(1,2);
        ComplexNumber cn4 = new ComplexNumber(1,2);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        cm.detComplexMatrix();
        ignoreStubs();

    }

    @Test
    public void MatrixShouldAddWithMatrix() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1,cn2,cn3,cn4);
        cm.addComplexMatrix2x2(cm);
    }

    @Test
    public void MatrixShouldAddedWithMatrixRight() {
        ComplexNumber a11 = new ComplexNumber(1, 2);
        ComplexNumber a12 = new ComplexNumber(1, 2);
        ComplexNumber a21 = new ComplexNumber(1, 2);
        ComplexNumber a22 = new ComplexNumber(1, 2);
        ComplexMatrix2x2 cm = mock(ComplexMatrix2x2.class);
        ComplexMatrix2x2 cm1 = mock(ComplexMatrix2x2.class);
        ComplexMatrix2x2 cm3 = new ComplexMatrix2x2(a11.addComplexNamber(a11), a12.addComplexNamber(a12), a21.addComplexNamber(a21), a22.addComplexNamber(a22));
        when(cm.addComplexMatrix2x2(cm1)).thenReturn(new ComplexMatrix2x2(a11.addComplexNamber(a11), a12.addComplexNamber(a12), a21.addComplexNamber(a21), a22.addComplexNamber(a22)));
        ignoreStubs();
    }

    @Test
    public void MatrixShouldHaveJust1ComplexNumber() {
        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn4);
        when(cn1.equalsComplNambr(cn2)).thenReturn(true);
        when(cn3.equalsComplNambr(cn2)).thenReturn(true);
        when(cn3.equalsComplNambr(cn4)).thenReturn(true);
        boolean bool = false;
        if (cn1.equalsComplNambr(cn2) && cn3.equalsComplNambr(cn2) && cn3.equalsComplNambr(cn4)) {
            bool = true;
        }
        Assert.assertEquals(true, bool);
    }

    @Test
    public void ComplexMatrixShouldBeDefault() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        ComplexNumber cn1 = new ComplexNumber();
        ComplexNumber cn2 = new ComplexNumber();
        ComplexNumber cn3 = new ComplexNumber();
        ComplexNumber cn4 = new ComplexNumber();
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertTrue(cm.equals(cm));
    }


    @Test
    public void GetterShouldBeRightsA11() {
        ComplexNumber cn1 = new ComplexNumber(1.1, 1.1);
        ComplexNumber cn2 = new ComplexNumber(1.2, 1.2);
        ComplexNumber cn3 = new ComplexNumber(1.3, 1.3);
        ComplexNumber cn4 = new ComplexNumber(1.44, 1.4);
        ComplexMatrix2x2 m1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertTrue(m1.getA11().equalsComplNambrWithComplNumber(cn1));
    }

    @Test
    public void GetterShouldBeRightsA12() {
        ComplexNumber cn1 = new ComplexNumber(1.1, 1.1);
        ComplexNumber cn2 = new ComplexNumber(1.2, 1.2);
        ComplexNumber cn3 = new ComplexNumber(1.3, 1.3);
        ComplexNumber cn4 = new ComplexNumber(1.4, 1.4);
        ComplexMatrix2x2 m1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertTrue(m1.getA12().equalsComplNambrWithComplNumber(cn2));
    }

    @Test
    public void GetterShouldBeRightsA21() {
        ComplexNumber cn1 = new ComplexNumber(1.1, 1.1);
        ComplexNumber cn2 = new ComplexNumber(1.2, 1.2);
        ComplexNumber cn3 = new ComplexNumber(1.3, 1.3);
        ComplexNumber cn4 = new ComplexNumber(1.4, 1.43);
        ComplexMatrix2x2 m1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertTrue(m1.getA21().equalsComplNambrWithComplNumber(cn3));
    }

    @Test
    public void GetterShouldBeRightsA22() {
        ComplexNumber cn1 = new ComplexNumber(1.1, 1.1);
        ComplexNumber cn2 = new ComplexNumber(1.2, 1.2);
        ComplexNumber cn3 = new ComplexNumber(1.3, 1.3);
        ComplexNumber cn4 = new ComplexNumber(1.4, 1.4);
        ComplexMatrix2x2 m1 = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        Assert.assertTrue(m1.getA22().equalsComplNambrWithComplNumber(cn4));
    }
}