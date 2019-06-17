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
public class KirisYontemi {
    public static void main(String[] args) {
        double x0 = 0.1;
        double x1 = 0.6;
        
        double res;
        for (int i = 2; i < 10; i++) {
            res = x1 - ((fx(x1)*(x1-x0))/(fx(x1)-fx(x0)));
            //System.out.println("restult" + i +" " + res);
            System.out.printf("%d. %f \n ",i-1 , res);

            x0 = x1;
            x1 = res;
        }
    }
    
     static double fx(double x){
        return (600*Math.pow(x, 4)) - (550*(Math.pow(x, 3)) + (200 * Math.pow(x, 2)) - (20*x)- 1);
    }
   
}
