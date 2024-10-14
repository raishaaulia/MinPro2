package bank;

public class RekeningBank implements Rekening {
    private int nomorRekening;
    private String pemilikRekening;
    private double saldo;

    private static int penghitungRekening = 1000;

    public RekeningBank(String pemilikRekening, double saldo) {
        this.nomorRekening = penghitungRekening++;
        this.pemilikRekening = pemilikRekening;
        this.saldo = saldo;
    }

    @Override
    public void tampilkanInformasiRekening() {
        System.out.println("Nomor Rekening: " + this.nomorRekening);
        System.out.println("Pemilik Rekening: " + this.pemilikRekening);
        System.out.println("Saldo: Rp" + this.saldo);
    }
    
    @Override
    public int getNomorRekening() {
        return nomorRekening;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
