package by.itacademy.task6.Task1;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class BankNameAndATMProducer {

    private String bankName;
    private String ATMProducer;

    public BankNameAndATMProducer(String bankName, String ATMProducer) {
        this.bankName = bankName;
        this.ATMProducer = ATMProducer;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getATMProducer() {
        return ATMProducer;
    }

    public void setATMProducer(String ATMProducer) {
        this.ATMProducer = ATMProducer;
    }
}
