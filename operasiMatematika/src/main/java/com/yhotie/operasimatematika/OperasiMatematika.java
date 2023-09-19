/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yhotie.operasimatematika;

/**
 *
 * @author usdi.prog
 */
public class OperasiMatematika {

    public static void main(String[] args) {
        int a = 200;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        

        //Augmented Assignments
        int c = 100;

        c += 20;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);
        
        
        /*
        Kode : Unary Operator
        Unary operator adalah sebuah operator dalam pemrograman yang bekerja pada satu operand, yaitu nilai atau variabel tunggal. Operator ini digunakan untuk melakukan operasi tertentu pada operand tunggal tersebut. Unary operator digunakan dalam banyak bahasa pemrograman, seperti C, C++, Java, Python, dan lain-lain.
        */

        int numx = 10;

        numx++;        
        System.out.println(numx);

        numx--;        
        System.out.println(numx);

        
    }
}
