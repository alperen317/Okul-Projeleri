/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author Alperen
 */
public class RungeKutta {
    
 static double yT(double t, double y){
        return Math.sin(t) - (y/t);
    }

    public static void main(String[] args) {
        double pi = Math.PI;
        double pi2 = 2* Math.PI;
        double h = (pi2-pi)/20;

        System.out.println("pi1: "+pi + " p2: "+pi2 + " h: " + h);

        double k1,k2,k3,k4;
        double w0 = 1.0;
        double i = pi;
        int count = 1;
        System.out.println("Runge-Kutta");
        while(i < pi2) {
            k1 = h * yT( i , w0 );
            k2 = h * yT((i + h/2),(w0+(1/2*k1)));
            k3 = h * yT((i + h/2),(w0+(1/2*k2)));
            k4 = h * yT((i + h/2),(w0+(1/2*k3)));
            w0 += (k1 + (2*k2) + (2*k3) + k4 )/6;
            System.out.println( count + ". İterasyon  "+ w0 );
            i = i+h;
            count++;
        }

    }
}
