
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alperen
 */
public class Ödev22 {

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
    
    
    public static int[][] inverse(int[][] relation, int[] array){
        
        if(isBijection(relation, array)== true){
            
            for (int i = 0; i < relation.length; i++) {
                for (int j = 0; j < relation[i][j]; j++) {
                    
                    int temp = relation[i][j];
                    relation[i][j] = relation[i][relation[0].length-1];
                    relation[i][relation[0].length-1]=temp;
                    
                    
                }
            }
            
            
              
            
            }
        
        else{
            System.out.println("Bijection degildir.");
            
        }    
            
        
        
        
        
        
        return relation;
    }
    
    public static boolean isBijection(int[][] relation, int[]array){
        
        if(isOneToOne(relation)== true && isOnto(relation, array)== true){
            
            return true;
        }
        
        
        
        return false;
    }
    
    
    public static boolean isOnto (int[][] relation, int[]array){
       
        if(relation[1].length >= array.length){
            
            return true;
        }
        
        return false;
    }

    public static boolean isOneToOne(int[][] relation) {

         for (int i = 0; i < relation[1].length; i++) {
            
            
             for (int j = 0; j < i; j++) {
                 if(relation[1][i] == relation[1][j]){
                 
                     return false;         
                    
             }
             }
        }



            return true;
        }
    
    

    public static void main(String[] args) {

        int tanımKümesi[] = {-2, -1, 0, 1, 2};
        
        int GörüntüKümesi[] = new int[5];
        int GörüntüKümesi2[] = new int[5];
        int GörüntüKümesi3[] = new int[5];
        for (int i = 0; i < tanımKümesi.length; i++) {

            GörüntüKümesi[i] = deneme1(tanımKümesi[i]);
            GörüntüKümesi2[i] = deneme2(tanımKümesi[i]);
            GörüntüKümesi3[i] = deneme3(tanımKümesi[i]);
        }

        int kontrol[] = {-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int kontrol2[] = {-1, 0, 1, 2, 3};
        int kontrol3[] = {0, 1, 2};

        int[][] birinci = {tanımKümesi, GörüntüKümesi};
        int[][] ikinci = {tanımKümesi, GörüntüKümesi2};
        int[][] ücüncü = {tanımKümesi, GörüntüKümesi3};
        
        
        
        if (isOnto(birinci, kontrol)== false) {
            System.out.println("1. fonksiyon örten degildir.");
        }
        else{
            System.out.println("1. fonksiyon örten");
        }
        
        if (isOnto(ikinci, kontrol2)== false) {
            System.out.println("2. fonksiyon örten degildir.");
        }
        else{
            System.out.println("2. fonksiyon örten");
        }
        
        if (isOnto(ücüncü, kontrol3)== false) {
            System.out.println("3. fonksiyon örten degildir.");
        }
        else{
            System.out.println("3. fonksiyon örten");
        }
        
        System.out.println("--------------------------------------------------------------------------------------");
        
        
        if (isOneToOne(birinci)== false) {
            System.out.println("1. fonksiyon birebir degildir.");
        }
        else{
            System.out.println("1. fonksiyon birebir");
        }
         if (isOneToOne(ikinci)== false) {
            System.out.println("2. fonksiyon birebir degildir.");
        }
        else{
            System.out.println("2. fonksiyon birebir");
        } 
         if (isOneToOne(ücüncü)== false) {
            System.out.println("3. fonksiyon birebir degildir.");
        }
        else{
            System.out.println("3. fonksiyon birebir");
        }
         
             System.out.println("--------------------------------------------------------------------------------------");
                 if (isBijection(birinci,kontrol)== false) {
            System.out.println("1. fonksiyon bijection degildir.");
        }
        else{
            System.out.println("1. fonksiyon bijection");
        }
         if (isBijection(ikinci,kontrol2)== false) {
             System.out.println("2. fonksiyon bijection degildir.");
        }
        else{
            System.out.println("2. fonksiyon bijection");
        } 
         if (isBijection(ücüncü,kontrol3)== false) {
            System.out.println("3. fonksiyon bijection degildir.");
        }
        else{
            System.out.println("3. fonksiyon bijection");
        }    
         
    }

   

}
