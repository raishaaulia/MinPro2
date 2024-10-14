/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

import bank.Rekening;
import bank.RekeningBank;
import java.util.ArrayList;

public class ManajemenBank implements CRUDRekening {

    ArrayList<RekeningBank> daftarRekening = new ArrayList<>();

    @Override
    public void createRekening(Rekening rekening) {
        daftarRekening.add((RekeningBank) rekening);
        System.out.println("Rekening berhasil ditambahkan.");
    }

    @Override
    public Rekening readRekening(int nomorRekening) {
        if (nomorRekening == 0) {
        if (daftarRekening.isEmpty()) {
            System.out.println("Tidak ada rekening yang tersedia.");
        } else {
            System.out.println("Daftar Semua Rekening:");
            for (RekeningBank rekening : daftarRekening) {
                rekening.tampilkanInformasiRekening();
            }
        }
        return null; 
    }
        for (RekeningBank rekening : daftarRekening) {
            if (rekening.getNomorRekening() == nomorRekening) {
                return rekening;
            }
        }
        
        System.out.println("Rekening tidak ditemukan.");
        return null;
    }

    @Override
    public void updateRekening(Rekening rekening) {
        RekeningBank rekeningBank = (RekeningBank) rekening;
        for (int i = 0; i < daftarRekening.size(); i++) {
            if (daftarRekening.get(i).getNomorRekening() == rekeningBank.getNomorRekening()) {
                daftarRekening.set(i, rekeningBank);
                System.out.println("Rekening berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Rekening tidak ditemukan.");
    }

    @Override
    public void deleteRekening(int nomorRekening) {
       RekeningBank rekening = (RekeningBank) readRekening(nomorRekening);
    if (rekening != null) {
        daftarRekening.remove(rekening);
        System.out.println("Rekening dengan nomor " + nomorRekening + " berhasil dihapus.");
    } else {
        System.out.println("Rekening dengan nomor " + nomorRekening + " tidak ditemukan.");
    }
}

    public void perbaruiSaldo(int nomorRekening, double saldoBaru) {
        RekeningBank rekening = (RekeningBank) readRekening(nomorRekening);
        if (rekening != null) {
            rekening.setSaldo(rekening.getSaldo() + saldoBaru);  
            System.out.println("Saldo berhasil diperbarui. Saldo baru: " + rekening.getSaldo());
        } else {
            System.out.println("Rekening dengan nomor " + nomorRekening + " tidak ditemukan.");
        }
}
}