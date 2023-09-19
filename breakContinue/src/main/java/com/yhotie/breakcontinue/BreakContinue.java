/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yhotie.breakcontinue;

/**
 *
 * @author usdi.prog
 */
public class BreakContinue {

    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("data Ganjil: " + counter);
        }
    }
}
