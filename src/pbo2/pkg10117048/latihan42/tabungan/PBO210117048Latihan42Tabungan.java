/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini tentang cara mengurangi jumlah uang yang
 *                     diambil dari saldo awal tabungan dengan OO.
 */
public class PBO210117048Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        System.out.println("=======Program Penarikan Uang========");
        System.out.print("Masukkan Saldo Awal : " );
        Scanner scn = new Scanner(System.in);
        int saldo = scn.nextInt();
        
        System.out.print("Jumlah Uang Yang diambil : " );
        int ambil = scn.nextInt();
        
        Tabungan tbg = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang : " +tbg.ambilUang(ambil));
        
    }
    
}
