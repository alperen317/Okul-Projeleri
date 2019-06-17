/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1.ayrık;

import java.util.ArrayList;

/**
 *
 * @author Alperen
 */
public class Soru2 {
    public static void main(String[] args) {
       int [] u =  {1,2,3,4,5,6,7,8,9,10};
       int [] a =  {1,3,5,7,9};
       int [] b = {1,2,3,5,6};
       String A="";
       String B="";
        for (int i = 0; i < u.length; i++) {
            int sayı = u[i];
            if (isContain(b,sayı) == true) {
                A = A+"1";
            }
            else{
                A = A+"0";
            }
        }
        
        for (int i = 0; i < u.length; i++) {
            int sayı = u[i];
            if (isContain(a,sayı) == true) {
                B = B+"1";
            }
            else{
                B = B+"0";
            }
        }
       
         System.out.println(A);
         System.out.println(B);
         
         int birinci = Integer.parseInt(A,2);
         int ikinci = Integer.parseInt(B,2);
         
         int deger = birinci & ikinci;
         int deger2= birinci | ikinci ;
         
         System.out.println(Integer.toBinaryString(deger));
         System.out.println(Integer.toBinaryString(deger2));
    }
    
     public static boolean isContain(int[] array, int k){
            boolean isContain=false;
            for (int i = 0; i < array.length; i++) {
                int a = array[i];
                if (a == k) {
                    isContain = true;
                    return isContain;
                }
                
         }
   
            
            return false;
        }
}
