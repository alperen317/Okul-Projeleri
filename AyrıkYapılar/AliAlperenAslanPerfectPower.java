/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1.ayrık;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument;
/**
 *
 * @author Alperen
 */
////






//Ali Alperen ASLAN 1421221025
//Ayrık Yapılar Ödev 1 Perfect Power 2017-2018
//Klavyeden verilen sayıya kadar olan perfect power değerlerini bulur.Bulunan sayıları arrayliste atar ve sıralar.
//Bu arraylist içinde değerleri karşılaştırarak ardışık sayıları bulur ve yazdırır.



public class AliAlperenAslanPerfectPower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Bulmak istediğiniz sayı değerini giriniz.");
//        Scanner sc = new Scanner(System.in);
//        int GelenSayı = sc.nextInt();
        int GelenSayı = 100;
        int sonuc = 0;
        ArrayList<Integer>  sonuclar = new ArrayList<Integer>();
//        
//        iki tane for döngüsüyle sayıları döngü halinde değiştirerek perfect power değerlerini hesaplama için kullandım.
        for (int taban = 1; taban <= 40; taban++) {
            for (int üst = 2; üst <= 40; üst++) {
                sonuc = (int) Math.pow(taban, üst);
                if (sonuc <= GelenSayı && sonuc!=1) {
//                gelen sonuc değerlerini kontrol ettim, küçük ise arrayliste ekledim
                    sonuclar.add(sonuc);

                } else {
                    break;
                }
            }
        }
//////        Arraylisteki elemanları küçükten büyüğe sıraladım
          Collections.sort(sonuclar);
        for (int i = 0; i < sonuclar.size(); i++) {
            System.out.print(sonuclar.get(i)+",");
           
             
        }
         System.out.println("");
        System.out.println("-----------------------------------");
        int don1 = 0;
        int don2=  1;
        int sayac=sonuclar.size();
//        while döngüsünü array büyüklüğünde döndürdüm ve dışardan oluşturduğum iki değer ile array elemanlarını sıra sıra alarak karşılaştırdım.
        while(sayac>0){
        
        int sayı2 = sonuclar.get(don1++);
        int sayı1 = sonuclar.get(don2++);
        if(sayı1-sayı2 == 1){
//           Karşılaştırdığım iki değerin farkı 1 olursa diye şart koydum ve bu şart sağlandığında ekran cıktısı vermesini sağladım.
            System.out.println("Bulunan ardışık sayılar  ---->  "+sayı2+"ve"+sayı1);
            sayac--;
        }
         
            
            sayac--;
        }
     
        
  }
}