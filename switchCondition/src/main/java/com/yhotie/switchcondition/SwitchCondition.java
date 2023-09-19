/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yhotie.switchcondition;

/**
 *
 * @author usdi.prog
 */
public class SwitchCondition {

    public static void main(String[] args) {
        int nilai = 'D';
        switch(nilai){
            case 'A':
                System.out.println("Sangat Bagus!");
                break;
            case 'B':
            case 'C':
                System.out.println("Nilai Bagus!");
                break;
            default:
                System.out.println("Salah!");

        }   
    }
}
