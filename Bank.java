package tugaspbosalwa;

public class Bank {
    
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan berita: " + berita);
    }
    
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    public double hitungBiayaTransfer(String bankTujuan, int jumlah) {
        // Biaya transfer default
        double biaya = 0;
        if (bankTujuan.equals("BNI")) {
            biaya = jumlah * 0.01; 
        } else if (bankTujuan.equals("BCA")) {
            biaya = jumlah * 0.015; 
        } else {
            biaya = jumlah * 0.02; 
        }
        return biaya;
    }

    
}
