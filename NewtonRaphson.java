/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.text.DecimalFormat;

/**
 *
 * @author Alperen
 */
public class Newton {
    public static void main(String[] args) {
        double x = 0.1;
        double fx = (600*Math.pow(x, 4)) - (550*(Math.pow(x, 3)) + (200 * Math.pow(x, 2)) - (20*x)- 1);
        
        double ftx = (2400*Math.pow(x, 3)) - 1650*(Math.pow(x, 2)) + (400 * x) - 20;
        
        System.out.println("fx " + fx +"\n "+ "ftx " + ftx);
        double x1 = x - (fx/ftx);
        System.out.println("x1: " + x1);
        
        double x2 = x1 - (fx(x1)/ftx(x1));
        System.out.println("x2: " + x2);
        System.out.println("");
        System.out.println("");
        double res = 0.1;
        for (int i = 0; i < 25; i++) {
            double z = res - (fx(res)/ftx(res));
            res = z;
           // System.out.println(i + "- " + res);
            System.out.printf("%d- %f \n",i, res);
        }
    }
    
    static double fx(double x){
        return (600*Math.pow(x, 4)) - (550*(Math.pow(x, 3)) + (200 * Math.pow(x, 2)) - (20*x)- 1);
    }
    static double ftx(double x){
        return (2400*Math.pow(x, 3)) - 1650*(Math.pow(x, 2)) + (400 * x) - 20;
    }
   
}
