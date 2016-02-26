package HomeWork.Task003;

/**
 * Created by 1 on 28.11.2014.
 */


public class ComplexMatrix2x2 {
    private ComplexNumber a11;
    private ComplexNumber a12;
    private ComplexNumber a21;
    private ComplexNumber a22;

    public ComplexMatrix2x2() {
        this(new ComplexNumber(), new ComplexNumber(), new ComplexNumber(), new ComplexNumber());
    }

    public ComplexNumber getA11() {
        this.a11 = a11;
        return a11;
    }

    public ComplexNumber getA12() {
        this.a12 = a12;
        return this.a12;
    }

    public ComplexNumber getA21() {
        this.a21 = a21;
        return this.a21;
    }

    public ComplexNumber getA22() {
        this.a22 = a22;
        return this.a22;
    }

    public ComplexMatrix2x2(ComplexNumber complexNamber) {
        this.a11 = this.a12 = this.a22= this.a22 = complexNamber;
    }

    public ComplexMatrix2x2(ComplexNumber complexNamber_1, ComplexNumber complexNamber_2, ComplexNumber complexNamber_3, ComplexNumber complexNamber_4) {
        this.a11 = complexNamber_1;
        this.a12 = complexNamber_2;
        this.a21 = complexNamber_3;
        this.a22 = complexNamber_4;
    }

    public ComplexMatrix2x2 addComplexMatrix2x2(ComplexMatrix2x2 complexMatrix2x2) {
        ComplexNumber cn11 = this.a11.addComplexNamber(complexMatrix2x2.getA11());
        ComplexNumber cn12 = this.a12.addComplexNamber(complexMatrix2x2.getA12());
        ComplexNumber cn21 = this.a21.addComplexNamber(complexMatrix2x2.getA21());// 2 3   4 6
        ComplexNumber cn22 = this.a22.addComplexNamber(complexMatrix2x2.getA22());// 4 5   3 4
        ComplexMatrix2x2 complMat = new ComplexMatrix2x2(cn11, cn12, cn21, cn22);
        return complMat;
    }

    public ComplexMatrix2x2 multComplexMatrix2x2(ComplexMatrix2x2 complexMatrix2x2) {
        ComplexNumber addCn11 = this.a11.multComplexNaber(complexMatrix2x2.getA11()).addComplexNamber(this.a12.multComplexNaber(complexMatrix2x2.getA21()));
        ComplexNumber addCn12 = this.a11.multComplexNaber(complexMatrix2x2.getA21()).addComplexNamber(this.a12.multComplexNaber(complexMatrix2x2.getA22()));
        ComplexNumber addCn21 = this.a21.multComplexNaber(complexMatrix2x2.getA11()).addComplexNamber(this.a22.multComplexNaber(complexMatrix2x2.getA21()));
        ComplexNumber addCn22 = this.a21.multComplexNaber(complexMatrix2x2.getA12()).addComplexNamber(this.a22.multComplexNaber(complexMatrix2x2.getA22()));
        return new ComplexMatrix2x2(addCn11, addCn12, addCn21, addCn22);
    }

    public ComplexNumber detComplexMatrix() {
        ComplexNumber cpNam = this.a11.multComplexNaber(this.a22).subComplexNamber(this.a12.multComplexNaber(this.a21));
        return cpNam;
    }
    public boolean equals(Object v) {
        if (v instanceof ComplexMatrix2x2) {
            ComplexMatrix2x2 v2 = (ComplexMatrix2x2) v;
            return (this.a11 == v2.getA11() && this.a12 == v2.getA12() && this.a21 == v2.getA21() && this.a22 == v2.getA22());
        } else {
            return false;
        }
    }

}