package ru.kpfu.itis.Group11401.Astashev.Task009.Task003;

/**
 * Created by 1 on 21.11.2014.
 */

public class ComplexNumber {
    private double complNambRe;
    private double complNambMn;

    public double getComplNambRe() {
        this.complNambRe = complNambRe;
        return this.complNambRe;
    }

    public double getComplNambMn() {
        this.complNambMn = complNambMn;
        return this.complNambMn;
    }
    public ComplexNumber getComplNamb() {
        ComplexNumber cm = new ComplexNumber();
        return cm;
    }

    public String toString() {
        if (this.complNambMn > 0) {
            return complNambRe + "+" + complNambMn + "*i";
        } else return complNambRe + "-" + (-complNambMn);
    }

    public ComplexNumber() {
        this.complNambMn = this.complNambRe = 0;
    }

    public ComplexNumber(double complNambRe, double complNambMn) {
        this.complNambMn = complNambMn;
        this.complNambRe = complNambRe;
    }

    public ComplexNumber addComplexNamber(ComplexNumber complexNamber) {
        ComplexNumber lol = new ComplexNumber(this.complNambRe + complexNamber.getComplNambRe(), this.complNambMn + complexNamber.getComplNambMn());
        return lol;
    }

    public void addRComplexNamber_1(ComplexNumber complexNamber) {
        ComplexNumber otw = this.addComplexNamber(complexNamber);
        this.complNambRe = otw.getComplNambRe();
        this.complNambMn = otw.getComplNambMn();
    }

    public ComplexNumber subComplexNamber(ComplexNumber complexNamber) {
        ComplexNumber lol = new ComplexNumber(this.complNambRe - complexNamber.getComplNambRe(), this.complNambMn + complexNamber.getComplNambMn());
        return lol;
    }

    public void subComplexNamber_1(ComplexNumber complexNamber) {
        ComplexNumber otw = this.subComplexNamber(complexNamber);
        complNambMn = otw.getComplNambMn();
        this.complNambRe = otw.getComplNambRe();
    }

    public ComplexNumber multComplexNamber(double x) {
        return new ComplexNumber(this.complNambRe * x, this.complNambMn * x);
    }

    public void multComplexNamber_1(double x) {
        ComplexNumber s = this.multComplexNamber(x);
        this.complNambRe = s.getComplNambRe();
        this.complNambMn = s.getComplNambMn();
    }

    public ComplexNumber multComplexNaber(ComplexNumber complexNamber) {
        ComplexNumber multComNamb = new ComplexNumber(this.complNambRe * complexNamber.getComplNambRe() - this.complNambMn * complexNamber.getComplNambMn(), this.complNambMn * complexNamber.getComplNambRe() + this.complNambRe * complexNamber.getComplNambMn());
        return multComNamb;
    }

    public ComplexNumber divComplexNamber(ComplexNumber complexNamber) {
        ComplexNumber lol = new ComplexNumber(this.complNambRe / complexNamber.getComplNambRe(), this.complNambMn / complexNamber.complNambMn);
        return lol;
    }

    public void divComplexNamber_1(ComplexNumber complexNamber) {
        ComplexNumber otw = this.divComplexNamber(complexNamber);
        this.complNambRe = otw.getComplNambRe();
        this.complNambMn = otw.getComplNambMn();
    }

    public double lengthComplNambr() {
        double dop = Math.abs(complNambMn * complNambMn + complNambRe * complNambRe);
        return dop;
    }

    public ComplexNumber powComplNamb(double x) {
        double uio = Math.pow(3, 2);
        ComplexNumber lol = new ComplexNumber(this.complNambRe, this.complNambMn);
        return lol;
    }

    public boolean equalsComplNambr(ComplexNumber complexNamber) {
        if (this.lengthComplNambr() > complexNamber.lengthComplNambr()) {
            return true;

        } else return false;
    }
    public boolean equalsComplNambrWithComplNumber(ComplexNumber complexNamber) {
        if ((this.complNambMn == complexNamber.complNambMn)&&(this.complNambRe == complexNamber.complNambRe) ){
            return true;

        } else return false;
    }
}