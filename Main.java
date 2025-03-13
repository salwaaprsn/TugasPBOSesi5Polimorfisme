package tugaspbosalwa;

public class Main {

    public static void main(String[] args) {
       
        Bank bank = new Bank();
        bank.transferUang(1000000, "123456789");
        bank.transferUang(2000000, "987654321", "BNI");
        bank.transferUang(3000000, "112233445", "BCA", "Pembayaran Tagihan");
        bank.sukuBunga();
        
        double biayaTransferBNI = bank.hitungBiayaTransfer("BNI", 1000000);
        System.out.println("Biaya transfer ke BNI: " + biayaTransferBNI);

        double biayaTransferBCA = bank.hitungBiayaTransfer("BCA", 1000000);
        System.out.println("Biaya transfer ke BCA: " + biayaTransferBCA);

        BankBNI bankBNI = new BankBNI();
        bankBNI.transferUang(500000, "123456789", "BNI");
        bankBNI.sukuBunga();

        BankBCA bankBCA = new BankBCA();
        bankBCA.transferUang(750000, "987654321", "BCA");
        bankBCA.sukuBunga();
    }
    
    }