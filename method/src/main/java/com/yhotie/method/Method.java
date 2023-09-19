/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yhotie.method;

/**
 *
 * @author usdi.prog
 */
public class Method {

    public static void main(String[] args) {
        SayHello("hai");

        int a = 200;
        int b = 300;
        int c = sum(a, b);
        System.out.println("total : " + c);

        // variabel argument function
        sayCongrats("rio", 23, 45, 56, 78,100,122);

    }

    static void SayHello(String word) {
        System.out.println("anda mengatakan : " + word);
    }

    // function return data
    static int sum(int value1, int value2) {
        int total = value1 + value2;
        return total;
    }

    //Kode : Dengan Variable Argument
    static void sayCongrats(String name, int... scores) {
        int total = 0;
        for (var score : scores) {
            total += total;
        }

        int finalValue = total / scores.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus");
        } else {
            System.out.println(name + ", Anda Tidak Ïlulus");

        }
    }
}
