package HomeWork.Task002;

/**
 * Created by 1 on 23.02.2016.
 */

public class Matrix2x2 {
    double matr1;
    double matr2;
    double matr3;
    double matr4;

    public Matrix2x2() {
    }

    public double getMatr1() {
        return matr1;
    }

    public double getMatr2() {
        return matr2;
    }

    public double getMatr3() {
        return matr3;
    }

    public double getMatr4() {
        return matr4;
    }

    public Matrix2x2(double a11, double a12, double a21, double a22) {
        this.matr1 = a11;
        this.matr2 = a12;
        this.matr3 = a21;
        this.matr4 = a22;
    }

    public Matrix2x2(double a11) {
        this.matr1 = this.matr2 = this.matr3 = this.matr4 = a11;
    }

    public Matrix2x2(double[][] mas) {
        this.matr1 = mas[0][0];
        this.matr2 =  mas[0][1];
        this.matr3 =  mas[1][0];
        this.matr4 =  mas[1][1];
    }

    public Matrix2x2 addMatrix(Matrix2x2 matrix2x2) {
        Matrix2x2 m = new Matrix2x2(this.matr1 + matrix2x2.matr1, this.matr2 + matrix2x2.matr2, this.matr3 + matrix2x2.matr3, this.matr4 + matrix2x2.matr4);
        return m;
    }

    public void aadMatrix_1(Matrix2x2 matrix2x2) {
        Matrix2x2 otw = addMatrix(matrix2x2);
        this.matr1 = otw.getMatr1();
        this.matr2 = otw.getMatr2();
        this.matr3 = otw.getMatr3();
        this.matr4 = otw.getMatr4();

    }
    public Matrix2x2 sub2x2(Matrix2x2 matrix2x2) {
        Matrix2x2 m = new Matrix2x2(this.matr1 - matrix2x2.matr1, this.matr2 - matrix2x2.matr2, this.matr3 - matrix2x2.matr3, this.matr4 - matrix2x2.matr4);
        return m;
    }

    public void subM2x2_1(Matrix2x2 matrix2x2) {
        Matrix2x2 otw = sub2x2(matrix2x2);
        this.matr1 = otw.getMatr1();
        this.matr2 = otw.getMatr2();
        this.matr3 = otw.getMatr3();
        this.matr4 = otw.getMatr4();
    }
    public Matrix2x2 multNumber(double x) {
        Matrix2x2 matrix2x2 = new Matrix2x2(this.matr1 * x, this.matr2 * x, this.matr3 * x, this.matr4 * x);
        return matrix2x2;
    }
    public void muilNamber_1(double x) {
        Matrix2x2 otw = multNumber(x);
        this.matr1 = otw.getMatr1();
        this.matr2 = otw.getMatr2();
        this.matr3 = otw.getMatr3();
        this.matr4 = otw.getMatr4();
    }

    public Matrix2x2 multMatrix(Matrix2x2 matrix2x2) {
        Matrix2x2 lol = new Matrix2x2(this.matr1 * matrix2x2.matr1 + this.matr2 * matrix2x2.matr3, this.matr1 * matrix2x2.matr2 + this.matr2 * matrix2x2.matr4, this.matr3 * matrix2x2.matr1 + this.matr4 * matrix2x2.matr3, this.matr1 += this.matr3 * matrix2x2.matr2 + this.matr4 * matrix2x2.matr4);
        return lol;
    }

    public void multMateix(Matrix2x2 matrix2x2) {
        Matrix2x2 otw = multMatrix(matrix2x2);
        this.matr1 = otw.getMatr1();
        this.matr2 = otw.getMatr2();
        this.matr4 = otw.getMatr4();
        this.matr3 = otw.getMatr3();
    }
    public double detM2x2() {
        double otw = this.matr1 * this.matr4 - this.matr2 * this.matr3;
        return otw;
    }
    public String toString() {
        return this.matr1 + " " + this.matr2 + " "
                + this.matr3 + " " + this.matr4;
    }
    public void transpM2x2() {
        Matrix2x2 otw = new Matrix2x2(this.matr1, this.matr3, this.matr2, this.matr4);
        this.matr1 = otw.getMatr1();
        this.matr2 = otw.getMatr2();
        this.matr3 = otw.getMatr3();
        this.matr4 = otw.getMatr4();
    }

    public boolean equals(Object v) {
        if (v instanceof Matrix2x2) {
            Matrix2x2 v2 = (Matrix2x2) v;
            return (this.matr1 == v2.getMatr1() && this.matr2 == v2.getMatr2() && this.matr3 == v2.getMatr3() && this.matr4 == v2.getMatr4());
        } else {
            return false;
        }
    }

}