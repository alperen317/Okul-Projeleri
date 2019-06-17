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
public class fdgdfgdfg {
        public static void main(String[] args) {
        int a,b,c;
        double diskriminant,kok1,kok2;
        Scanner oku=new Scanner(System.in);
        System.out.println("a için bir deger gir-->");
        a=oku.nextInt();
        System.out.println("b icin bir deger gir-->");
        b=oku.nextInt();
        System.out.println("c icin bire deger gir-->");
        c=oku.nextInt();
        diskriminant=Math.pow(b, 2)-(4*a*c);
        if(diskriminant>0){
        kok1=((-1*b)+Math.sqrt(diskriminant))/(2*a);
        kok2=((-1*b)-Math.sqrt(diskriminant))/(2*a);
        System.out.println("kok1 yani x1--> "+kok1);
         System.out.println("x2--> "+kok2);
         }
        else if(diskriminant==0){
            kok1=kok2=(-1*b)/(2*a);
            System.out.println("x1=x2=--> "+kok1);
        }
        else {
            System.out.println("Denkleminizin real koku yok");
        }
    }
}
