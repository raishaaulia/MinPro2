/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

import bank.RekeningBank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenBank manajemenBank = new ManajemenBank();
        int nomorRekeningTerakhir = 0; 
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        RekeningBank rekeningAwal = new RekeningBank("John Doe", 1000); 
        nomorRekeningTerakhir = rekeningAwal.getNomorRekening();
        manajemenBank.createRekening(rekeningAwal);  // ganti tambahRekening dengan createRekening

        do {
            System.out.println("\n=== Sistem Manajemen Bank ===");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Tampilkan Rekening");
            System.out.println("3. Perbarui Saldo");
            System.out.println("4. Hapus Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pemilik Rekening: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Saldo Awal: ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine(); 
                    nomorRekeningTerakhir++;
                    RekeningBank rekening = new RekeningBank(nama, saldo);
                    manajemenBank.createRekening(rekening); 
                    break;
                case 2:
                    System.out.print("Masukkan Nomor Rekening: ");
                    int nomorRekening = scanner.nextInt();
                    RekeningBank rekeningBank = (RekeningBank) manajemenBank.readRekening(nomorRekening);  
                    if (rekeningBank != null) {
                        rekeningBank.tampilkanInformasiRekening();
                    } else {
                        System.out.println("Rekening tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Nomor Rekening: ");
                    nomorRekening = scanner.nextInt();
                    System.out.print("Masukkan Jumlah Saldo yang Ingin Ditambahkan: ");
                    double saldoBaru = scanner.nextDouble();
                    scanner.nextLine();
                    manajemenBank.perbaruiSaldo(nomorRekening, saldoBaru);
                    break;
                case 4:
                    System.out.print("Masukkan Nomor Rekening: ");
                    nomorRekening = scanner.nextInt();
                    manajemenBank.deleteRekening(nomorRekening);  
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}