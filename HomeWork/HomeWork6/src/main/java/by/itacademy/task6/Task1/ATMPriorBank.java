package by.itacademy.task6.Task1;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class ATMPriorBank extends BaseATM implements BankName, ATMProducer{

    public String screenMenu() {

        return null;
    }

    public String getATMProducer() {
        BankNameAndATMProducer bankNameAndATMProducer = new BankNameAndATMProducer("PriorBank",
                "Belarus, Minsk, LLC Horizon, Kylman 26 - 709 ");



        return bankNameAndATMProducer.getATMProducer();
    }

    public String getBankName() {
        return null;
    }
}
