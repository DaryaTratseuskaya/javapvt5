package by.itacademy.task.Task1.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Root {

    private String bankName;
    private String bankLocation;
    private Date date;
    private int baseCurrencyId;
    private List<Currency> currency = new ArrayList<>();


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public void setBaseCurrencyId(int baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public List<Currency> getCurrency() {
        return currency;
    }

    public void setCurrency(List<Currency> currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Root root = (Root) o;

        if (baseCurrencyId != root.baseCurrencyId) return false;
        if (bankName != null ? !bankName.equals(root.bankName) : root.bankName != null) return false;
        if (bankLocation != null ? !bankLocation.equals(root.bankLocation) : root.bankLocation != null) return false;
        if (date != null ? !date.equals(root.date) : root.date != null) return false;
        return currency != null ? currency.equals(root.currency) : root.currency == null;
    }

    @Override
    public int hashCode() {
        int result = bankName != null ? bankName.hashCode() : 0;
        result = 31 * result + (bankLocation != null ? bankLocation.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + baseCurrencyId;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Root{" +
                "bankName='" + bankName + '\'' +
                ", bankLocation='" + bankLocation + '\'' +
                ", date=" + date +
                ", baseCurrencyId=" + baseCurrencyId +
                ", currency=" + currency +
                '}';
    }
}
