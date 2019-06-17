
package lab11;


/**
 *
 * @author Alperen
 */
public class EulerModified {

    static double pi = Math.PI;
    static double h = pi/20;
    static double yx = 1;
    static double m1 = Math.PI;
    static double m2 = 2*Math.PI;
    static double wi = 0;

    public static void main(String[] args) {
        System.out.println("modified euler: ");

        while(m1 < m2) {
            yx = yx + h/2* (y(m1,yx) + y(m1+h, (yx+(h*y(m1,yx)))));
            System.out.println(yx);
            m1 = m1+  h;
        }

    }


    static double yxt (double i) {
        return yx + h * (Math.sin(i)-yx/i);
    }

    static double y (double x, double y) {
        return Math.sin(x) - (y/x);
    }

}
