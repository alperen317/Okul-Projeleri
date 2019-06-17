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
public class dsfdsf {
    
    
   *************************************************************************0
   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Scanner;

/**
 *
 * @author abdurrahman Rajab
 */
public class class3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the number like b > 0 , n >= 2 , m >=0 ");
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("n = ");
        int n = sc.nextInt();
        System.out.println("m = ");
        int m = sc.nextInt();
        if ( b > 0 &&  n >= 2 && m >=0 ) {
            
            System.out.println(recursiveModulaExponentiation(b, n, m));
        }else {
            System.out.println("re check the numbers ");
        }
    }

    public static int recursiveModulaExponentiation(int b, int n, int m) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return (recursiveModulaExponentiation(b, n / 2, m) * recursiveModulaExponentiation(b, n / 2, m)) % m;
        } else {
            return (((recursiveModulaExponentiation(b, n / 2, m) * recursiveModulaExponentiation(b, n / 2, m)) % m) * b % m) % m;
        }

    }
}
*******************************************************************

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author abdurrahman Rajab
 */
public class soru1 {
    
    public static void main(String[] args) {
        String s1 = "welcome to java";
        String s2 = "programming is fun";
        String s3 = "welcome to java 2";
        String s4 = s1+s2;
        System.out.println(s4);
        System.out.println(s1.concat(s2));
        System.out.println(s1.length());
        System.out.println(s1 + 1 + 1 );
        System.out.println(s1 + (1+1));
    }
}
    ********************************** 
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Scanner;

/**
 *
 * @author abdurrahman Rajab
 */
public class soru2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the two number ");

        System.out.println(gcdRecursive(sc.nextInt(), sc.nextInt()));
    }

    public static int gcdRecursive(int a, int b) {
        if (a < b) {
            if (a == 0) {
                return b;
            } else {

                return gcdRecursive(b % a, a);
            }
        } else {
            return gcdRecursive(b, a);

        }

    }

}
************************************************************************
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author abdurrahman Rajab
 */
public class soru4 {

    public static void main(String[] args) {
        
        
        long start = System.currentTimeMillis();
//        System.out.println(recursiveFibbonachi(45));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
        
        start = System.currentTimeMillis();
        System.out.println(Fibbonachi(500));
        end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public static int recursiveFibbonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursiveFibbonachi(n - 1) + recursiveFibbonachi(n - 2);
        }
    }

    public static long Fibbonachi(int n) {
        if (n == 0) {
            return 0;

        } else {
            long x = 0;
            long z = 0;
            long y = 1;
            for (int i = 0; i < n - 1; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            return y;

        }
    }
}
***************************************************
}
