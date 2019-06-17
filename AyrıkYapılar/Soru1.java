/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1.ayrık;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Soru1 {
    public static void main(String[] args) {
        
        int [] u = new int[20];
        for (int i = 0; i < 20; i++) {
            u[i] = i;
            System.out.println(u[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("A kümesinin boyutunu giriniz ");
        int asize = sc.nextInt();
        int [] a = new int[asize];
        System.out.println("B kümesinin boyutunu giriniz. ");
        
        int bsize = sc.nextInt();
        int [] b = new int[bsize];
        for (int i = 0; i < asize; i++) {
            System.out.println("A kümesinin "+i+".elemanını giriniz. ");
            int sayı = sc.nextInt();
           boolean durum =  isContain(a, sayı);
              if ( durum == false ) {
                a[i]=sayı;
            }
              else{
                  System.out.println("Aynı değer girildi");
                  i--;
              }
             
        }
          for (int i = 0; i < bsize; i++) {
            System.out.println("B kümesinin "+i+".elemanını giriniz. ");
            int sayı = sc.nextInt();
           boolean durum =  isContain(b, sayı);
              if ( durum == false ) {
                b[i]=sayı;
            }
              else{
                  System.out.println("Aynı değer girildi");
                  i--;
              }
             
        }
          System.out.println("------------------------------------------");
           for (int i = 0; i < asize; i++) {
               System.out.println(a[i]);
        }
           for (int i = 0; i < bsize; i++) {
               System.out.println(b[i]);
        }
           System.out.println("--------------------------------------------");
           
          for (int i = 0; i < asize; i++) {
              int sayı = a[i];
              if (isContain(b, sayı) == true ) {
                  System.out.println("Kesişim");
                  System.out.println(sayı);
              }
        }
          System.out.println("----------------------------------------");
          System.out.println("Birleşim");
          for (int i = 0; i < asize; i++) {
              int sayı = a[i];
             if(isContain(a, sayı) == true){
                 System.out.println(sayı);
             }
             else{
                 System.out.println(sayı);
                 
             }
        }
          System.out.println("-----------------------------------------");
          System.out.println("A-Fark-B");
          for (int i = 0; i < asize; i++) {
            int sayı = a[i];
            boolean durum  = isContain(b, sayı);
              if (durum == false) {
                  System.out.println(sayı);
              }
        }
          System.out.println("-------------------------------------------");
          System.out.println("Complement");
           for (int i = 0; i < asize; i++) {
            int sayı = a[i];
            boolean durum  = isContain(u, sayı);
              if (durum == false) {
                  System.out.println(sayı);
              }
        }
          
       
        
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
