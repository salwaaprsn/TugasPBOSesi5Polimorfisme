package tugaspbosalwa;
    
public class BankBCA extends Bank {
    
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah: 4.5%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank BCA");
    }   
}

