/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yhotie.menghitungipk;

import java.util.ArrayList;

/**
 *
 * @author usdi.prog
 */
public class Mahasiswa {

    public String nama;
    public String nim;
    public ArrayList<MataKuliah> mataKuliah;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.mataKuliah = new ArrayList<>();
    }

    public void tambahMatkul(MataKuliah mk) {
        mataKuliah.add(mk);
    }

    public double hitungIPK() {
        // menambah parameter
        double totalNilai = 0.0;
        int totalSks = 0;

        // melakukan perualang untuk menghituang total nilai dan total sks
        // fisika 3.0
        // pbo 2.0
        // robot 4.0
        for (MataKuliah mk : mataKuliah) {
            // menjumlahkan semua nilai
            totalNilai += mk.nilai;

            // menjumlahkan semua sks
            totalSks += mk.sks;
        }

        if (totalSks == 0) {
            return 0.0;
        }

        // hitung ipk
        double totalIpk = totalNilai / totalSks;
        
        return totalIpk;

    }

}
