package by.itacademy.task7.Task1;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public abstract class BaseATM {

    private String bankName;
    private String ATMProducer;

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
    public boolean screenMenu(){

        return true;
    }

}
