/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Alperen
 */
public class NewClass {
    public static void main(String[] args) {
        double x=0.1;
        double fx = (600*Math.pow(x, 4)) - (550*(Math.pow(x, 3)) + (200 * Math.pow(x, 2)) - (20*x)- 1);
        double sonuc = fx;
        double x1 = 0.55;
        double fx2 = (600*Math.pow(x1, 4)) - (550*(Math.pow(x1, 3)) + (200 * Math.pow(x1, 2)) - (20*x1)- 1);
        
        System.out.println(fx2);
    }
}
