package CW190216;

/**
 * Created by 1 on 19.02.2016.
 */

public class Vector2d {
    //public static void main(String[] args) {  Scanner in = new Scanner(System.in); }
    double y;
    double x;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2d() {
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void vectorAdd(Vector2d v1) {
        this.x += v1.x;
        this.y += v1.y;
    }

    public boolean equals(Object v) {
     /*  try {
            Vector2d v2 = (Vector2d) v;
            return (x == v2.getX() && y == v2.getX());
        } catch (ClassCastException e) {
            return false;
        }
   */
        if (v instanceof Vector2d) {
            Vector2d v2 = (Vector2d) v;
            return (this.x == v2.getX() && this.y == v2.getY());
        } else {
            return false;
        }
    }
    public void reduceLengthBy(int a) throws ThrowLengthExeption {

            Vector2d v = new Vector2d(3,4);
            if (a<1)
                throw  new ThrowLengthExeption();
                this.y/= a;
                this.x/= a;


    }
}