/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yhotie.array;

/**
 *
 * @author usdi.prog
 */
public class Array {

    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        //mengubah nilai array
        arrayString[0] = "Rio";
        arrayString[1] = "Juniyantara";
        arrayString[2] = "Putra";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int[] arrayInt = new int[]{
            12, 3, 4, 5, 6};
        
        long[] arrayLong = {
            12, 33, 44, 55};

        System.out.println(arrayLong[1]);
        
        
        // array dalam rray
        String[][] members = {
            {"rio", "JP"},
            {"daos", "rahmat", "agus"}
        };
        
        System.out.println(members[0][1]);
        System.out.println(members[1][2]);
        

    }
}
