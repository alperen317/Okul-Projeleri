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
public class Soru3 {
    
    public static long recursive(int n){
         if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }
    
    public static long Fibonacci(int n){
        if(n == 0){
            return 0;
        }else{
            long x= 0;
            long y =1;
            long z = 0;
            for (int i = 1; i <= n-1; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            return y;
        }
    }
    
    
     public static void main(String[] args) {
        long baslangıc =System.currentTimeMillis();
         System.out.println(Fibonacci(50));
        long bitis = System.currentTimeMillis();
         System.out.println(bitis-baslangıc);
         
         
         baslangıc = System.currentTimeMillis();
         System.out.println(recursive(50));
         bitis = System.currentTimeMillis();
         System.out.println(bitis-baslangıc);
        
        
    }
}
