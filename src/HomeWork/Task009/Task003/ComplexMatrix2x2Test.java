package ru.kpfu.itis.Group11401.Astashev.Task009.Task003;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.*;

/**
 * Created by 1 on 24.02.2016.
 */

public class ComplexMatrix2x2Test {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
            "ru/kpfu/itis/Group11401/Astashev/Task008/Server/main/java/spring-config.xml"
    );
    @Test
    public void MatrixShouldMultWithMatrix() {
       /*
        ComplexNumber cn1 = new ComplexNumber(1, 2);
        ComplexNumber cn2 = new ComplexNumber(1, 2);
        ComplexNumber cn3 = new ComplexNumber(1, 2);
        ComplexNumber cn4 = new ComplexNumber(1, 2);
        */

        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn1");
        ComplexNumber cn2 = (ComplexNumber) ac.getBean("cn2");
        ComplexNumber cn3 = (ComplexNumber) ac.getBean("cn3");
        ComplexNumber cn4 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        cm.multComplexMatrix2x2(cm);
        ignoreStubs();
    }

    @Test
    public void MatrixShouldMakeRightDet() {
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn1");
        ComplexNumber cn2 = (ComplexNumber) ac.getBean("cn2");
        ComplexNumber cn3 = (ComplexNumber) ac.getBean("cn3");
        ComplexNumber cn4 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        cm.detComplexMatrix();
        ignoreStubs();

    }

    @Test
    public void MatrixShouldAddWithMatrix() {

        ComplexNumber cn1 = mock(ComplexNumber.class);
        ComplexNumber cn2 = mock(ComplexNumber.class);
        ComplexNumber cn3 = mock(ComplexNumber.class);
        ComplexNumber cn4 = mock(ComplexNumber.class);
        ComplexMatrix2x2 cm = new ComplexMatrix2x2(cn1, cn2, cn3, cn4);
        cm.addComplexMatrix2x2(cm);
    }

    @Test
    public void MatrixShouldAddedWithMatrixRight() {
        ComplexNumber a11 = (ComplexNumber) ac.getBean("cn1");
        ComplexNumber a12 = (ComplexNumber) ac.getBean("cn2");
        ComplexNumber a21 = (ComplexNumber) ac.getBean("cn3");
        ComplexNumber a22 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 cm = mock(ComplexMatrix2x2.class);
        ComplexMatrix2x2 cm1 = mock(ComplexMatrix2x2.class);
        ComplexMatrix2x2 cm3 = new ComplexMatrix2x2(a11.addComplexNamber(a11), a12.addComplexNamber(a12), a21.addComplexNamber(a21), a22.addComplexNamber(a22));
        when(cm.addComplexMatrix2x2(cm1)).thenReturn(new ComplexMatrix2x2(a11.addComplexNamber(a11), a12.addComplexNamber(a12), a21.addComplexNamber(a21), a22.addComplexNamber(a22)));
        ignoreStubs();
    }

    @Test
    public void MatrixShouldHaveJust1ComplexNumber() {
        ComplexMatrix2x2 cm = (ComplexMatrix2x2) ac.getBean("cm");
        ComplexMatrix2x2 cm1 = (ComplexMatrix2x2) ac.getBean("cm1");
        Assert.assertTrue(cm1.equals(cm));
    }

    @Test
    public void ComplexMatrixShouldBeDefault() {
        ComplexMatrix2x2 cm = new ComplexMatrix2x2();
        ComplexMatrix2x2 cm1 = (ComplexMatrix2x2) ac.getBean("defoultMatrix") ;
        Assert.assertTrue(cm.equals(cm1));
    }


    @Test
    public void GetterShouldBeRightsA11() {
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn1");
        ComplexMatrix2x2 m1 = (ComplexMatrix2x2) ac.getBean("cm");
        Assert.assertTrue(m1.getA11().equalsComplNambrWithComplNumber(cn1));
    }

    @Test
    public void GetterShouldBeRightsA12() {
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn2");
        ComplexMatrix2x2 m1 = (ComplexMatrix2x2) ac.getBean("cm");
        Assert.assertTrue(m1.getA11().equalsComplNambrWithComplNumber(cn1));
    }

    @Test
    public void GetterShouldBeRightsA21() {
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn3");
        ComplexMatrix2x2 m1 = (ComplexMatrix2x2) ac.getBean("cm");
        Assert.assertTrue(m1.getA11().equalsComplNambrWithComplNumber(cn1));
    }

    @Test
    public void GetterShouldBeRightsA22() {
        ComplexNumber cn1 = (ComplexNumber) ac.getBean("cn4");
        ComplexMatrix2x2 m1 = (ComplexMatrix2x2) ac.getBean("cm");
        Assert.assertTrue(m1.getA11().equalsComplNambrWithComplNumber(cn1));
    }
}