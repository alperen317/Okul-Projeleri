/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1.ayrık;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Alperen
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int GelenSayı = sc.nextInt();
        int sonuc = 0;
        TreeSet<Integer> sonuclar = new TreeSet<Integer>();
        for (int taban = 1; taban < 10; taban++) {
            for (int üst = 2; üst < 10; üst++) {
                sonuc = (int) Math.pow(taban, üst);
                if (sonuc <= 100) {
                    sonuclar.add(sonuc);

                } else {
                    break;
                }
            }
        }

        for (Integer integer : sonuclar) {
            System.out.println(integer);
        }
        System.out.println("------------------------------------------");
             
               System.out.println(sonuclar.ceiling(10));
           
    }
}
