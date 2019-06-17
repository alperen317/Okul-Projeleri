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
public class soru2 {
    public static void main(String[] args) {
        
        
        
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("B değeri giriniz.");
        int b= sc.nextInt();
        System.out.println("N değerini giriniz");
        int n = sc.nextInt();
        System.out.println("M değerini giriniz.");
        int m = sc.nextInt();
        
        
        if(b > 0 && m >= 2 && n>=0){
            System.out.println(recursiveModular(b, n, m));
            
        }else{
            System.out.println("Sayıları istenilen şekilde giriniz.");
        }
        
    }
    public static int recursiveModular(int b, int  n, int m){
        if(n == 0){
            return 1;
        }else if(n %2 == 0){
            return (recursiveModular(b, n/2, m) * recursiveModular(b, n/2, m)) %m ;
        }else {
            return (((recursiveModular(b, n / 2, m) * recursiveModular(b, n / 2, m)) % m) * b % m) % m;
        }
        
        
        
    }
   
}
