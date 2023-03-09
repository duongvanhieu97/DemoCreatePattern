package Factory;

public class BankFactory {
    public Bank getBankName(String type) {
        if ("TPBank".equals(type)) {
            return new TPBank();
        } else {
            return new VietComBank();
        }
    }
}
