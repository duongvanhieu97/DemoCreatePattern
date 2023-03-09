package Factory;

public class Demo {
    public static void main(String[] args) {
        BankFactory bank = new BankFactory();
        Bank b1 = bank.getBankName("TPBank");
        System.out.println("Tên Ngân Hàng " + b1.getBankName());
        Bank b2 = bank.getBankName("VietComBank");
        System.out.println("Tên Ngân Hàng " + b2.getBankName());
    }
}
