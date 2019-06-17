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
public class NewClass2 {
    
    public static int deneme1(int a) {

        int sonuc = (int) Math.pow(a, 3);

        return sonuc;
    }

    public static int deneme2(int a) {

        int sonuc = a + 1;

        return sonuc;
    }

    public static int deneme3(int a) {

        int sonuc = Math.abs(a);

        return sonuc;
    }
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Tanım kümesi boyutunu giriniz");
        int tanımKümesiBoyut = sc.nextInt();

        int[] tanımKümesi = new int[tanımKümesiBoyut];

        for (int i = 0; i < tanımKümesiBoyut; i++) {
            System.out.println("Tanım kümesinin" + i + ". elemanını giriniz.");
            tanımKümesi[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        
    }
}
