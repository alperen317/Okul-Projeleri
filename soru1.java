/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("İlk sayıyı giriniz ");
        int a= sc.nextInt();
        System.out.println("İkinci sayıyı giriniz ");
        int b= sc.nextInt();
        
        int gcd  = gcdRecursive (a,b);
        System.out.println(gcd);
    }
    
     public static int gcdRecursive(int a, int b) {
        if (a < b) {
            if (a == 0) {
                return b;
            } else {

                return gcdRecursive(b % a, a);
            }
        } else {
            return gcdRecursive(b, a);

        }

    }
    
    
    
}
