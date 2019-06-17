/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1.ayrık;

/**
 *
 * @author Alperen
 */
public class Soru1lab3 {
     public static void main(String[] args) {
        int toplam =0;
         for (int i = 1; i <= 6; i++) {
             
             toplam += (2*(Math.pow(3, i)));
         }
         System.out.println(toplam);
   
           
//   int a=2;
//   int r=3;
//   int n=6;
//           
//           
//            int sonuc= metod(a,r,n);


    }
//    public int metod (int a, int r, int n){
//         
//        double ust =  a*(Math.pow(r, n+1))-a;
//        double alt = r-1; 
//        int sonuc = (int) (ust/alt);
//        
//        return sonuc;
//    }
     
}
