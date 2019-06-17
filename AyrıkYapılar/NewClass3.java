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