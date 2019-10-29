/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan60.akatsuki;

/**
 *
 * @author syifa
 * Nama  : Muhamad Syifa Amruloh
 * Kelas : IF11K
 * NIM   : 10118910
 * 
 * Description : Program Ini Menampilkan Anggota Akatsuki Berdasarkan Asal desa mereka menggunakan konsep Objek,inheritence
 * , Polymorphisme
 */
public class PBO11K10118910Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Program Anggota Akatsuki Berdasarkan Desa ===");
        Akatsuki akat = new Akatsuki();
        akat.Anggota();
        akat.Desa();
        akat.Rinengan();
        
        Konoha kon = new Konoha();
        kon.Anggota();
        kon.Desa();
        kon.Sharingan();
        
        Sunagakure sun = new Sunagakure();
        sun.Anggota();
        sun.Desa();
        
        Iwagakure iwa = new Iwagakure();
        iwa.Anggota();
        iwa.Desa();
        iwa.HidanTeknik();
        
        Kirigakure kiri = new Kirigakure();
        kiri.Anggota();
        kiri.Desa();
        kiri.KisameTeknik();
        
        Takigakure taki = new Takigakure();
        taki.Anggota();
        taki.Desa();
        taki.Kakuzu_teknik();
    }
    
}
