/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yhotie.menghitungipk;

/**
 *
 * @author usdi.prog
 */
public class Menghitungipk {

    public static void main(String[] args) {
        
        Mahasiswa mahasiswa = new Mahasiswa("Daus", "f019");
        
        mahasiswa.tambahMatkul(new MataKuliah("fisika",9.6,2));
        mahasiswa.tambahMatkul(new MataKuliah("pbo",8.3,3));
        mahasiswa.tambahMatkul(new MataKuliah("robot",8.0,3));
        
        double ipkMahasiswa = mahasiswa.hitungIPK();
        
        for(MataKuliah mtk: mahasiswa.mataKuliah){
            System.out.println("nama matkul: "+ mtk.namaMatakuliah);
            System.out.println("sks matkul: "+ mtk.sks);
            System.out.println("nilai matkul: "+ mtk.nilai);
            System.out.println("==========================");
        }
        
        System.out.println("Nama: "+mahasiswa.nama);
        System.out.println("Nim: "+mahasiswa.nim);
        System.out.println("total IPK:" + ipkMahasiswa);
        
    }
}
