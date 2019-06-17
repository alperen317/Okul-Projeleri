/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1.ayrık;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class AyrıkÖdev2 {

    public static boolean isOneToOne(int[][] dizi) {
       boolean oneToOne = true;
        
        int sutun = 1;
        int[] goruntuKumesi = new int[dizi.length];

        for (int satır = 0; satır < dizi.length; satır++) {
            int dgr = dizi[satır][sutun];
            goruntuKumesi[satır] = dgr;

        }
        for (int satır = 0; satır < dizi.length; satır++) {
            int a=++satır;
            if (dizi[satır][1]==dizi[a][1]) {
                
                oneToOne = false;
                return oneToOne;
            }
            
        }
        return oneToOne;
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

        //
        int[][] dizi = new int[tanımKümesiBoyut][2];
        // ornekbir
        for (int satır = 0; satır < 5; satır++) {
            int sutun = 0;

            dizi[satır][sutun] = tanımKümesi[satır];
            int sonuc = deneme1(tanımKümesi[satır]);

            dizi[satır][++sutun] = sonuc;

        }
        // örnekiki
        int[][] dizi2 = new int[tanımKümesiBoyut][2];
        for (int satır = 0; satır < 5; satır++) {
            int sutun = 0;

            dizi2[satır][sutun] = tanımKümesi[satır];
            int sonuc = deneme2(tanımKümesi[satır]);

            dizi2[satır][++sutun] = sonuc;

        }
        //orneküç
        int[][] dizi3 = new int[tanımKümesiBoyut][2];
        for (int satır = 0; satır < 5; satır++) {
            int sutun = 0;

            dizi3[satır][sutun] = tanımKümesi[satır];
            int sonuc = deneme3(tanımKümesi[satır]);

            dizi3[satır][++sutun] = sonuc;

        }

        for (int satır = 0; satır < 5; satır++) {

            System.out.println(dizi[satır][0] + "    " + dizi[satır][1]);

        }

        System.out.println("--------------------------------------------------");

        for (int satır = 0; satır < 5; satır++) {

            System.out.println(dizi2[satır][0] + "    " + dizi2[satır][1]);

        }

        System.out.println("--------------------------------------------------");
        for (int satır = 0; satır < 5; satır++) {

            System.out.println(dizi3[satır][0] + "    " + dizi3[satır][1]);

        }
        System.out.println("--------------------------------------------------");
        if (isOneToOne(dizi) == true) {
            System.out.println("Birinci örnek birebir.");
        }
        else{
            System.out.println("Birinci örnek birebir değildir.");
        }
        System.out.println("--------------------------------------------------");
        if (isOneToOne(dizi2) == true) {
            System.out.println("ikinci örnek birebir.");
        }
        else{
            System.out.println("İkinci örnek birebir değildir.");
        }
        System.out.println("--------------------------------------------------");
        if (isOneToOne(dizi3) == true) {
            System.out.println("ücüncü örnek birebir.");
        }
        
        else {
            System.out.println("Ücüncü örnek birebir değildir");
        }

    }

}
