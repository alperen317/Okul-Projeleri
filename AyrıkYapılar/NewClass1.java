/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1.ayrık;

import java.util.Arrays;

/**
 *
 * @author Alperen
 */
public class NewClass1 {
    public static void main(String[] args) {
        int a[]={0,1,2,3,4};
        int deger= Arrays.binarySearch(a, 0);
        int deger2=Arrays.binarySearch(a ,1);
        System.out.println(deger);
        System.out.println(deger2);
    }
}
