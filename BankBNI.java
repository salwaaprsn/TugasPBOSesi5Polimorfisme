package tugaspbosalwa;

public class BankBNI extends Bank {
    
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah: 4%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank BNI");
    }   
}
