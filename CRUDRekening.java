/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package management;

import bank.Rekening;

/**
 *
 * @author Raisha
 */
public interface CRUDRekening {
    void createRekening(Rekening rekening);
    Rekening readRekening(int nomorRekening);
    void updateRekening(Rekening rekening);
    void deleteRekening(int nomorRekening);
}
