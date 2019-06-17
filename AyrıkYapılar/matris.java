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
public class matris {
    
    public static boolean durum(int[][] matris, int a, int b ) {
     boolean durum = false;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i != j){
                    if(matris[i][j] != matris[j][i]){
                        
                          durum = false;
                          return durum;
                          
                    }
                    else{
                        durum = true;
                    }
                }
            }
        }
       return durum;
}
    
    public static void main(String[] args) {
        
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("boyut");
        a = sc.nextInt();
        System.out.println("boyut");
        b=sc.nextInt();
        
        int matris[][]= new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Sayı giriniz");
               matris[i][j]=sc.nextInt();
            }
        }
        
        boolean kontrol = durum(matris, a, b);
        
        if(kontrol == true ) {
            System.out.println("simetrik");
        }
        else{
            System.out.println("simetrik değil");
        }
                
    }
    
}
