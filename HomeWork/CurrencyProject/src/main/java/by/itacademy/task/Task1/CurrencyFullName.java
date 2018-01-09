package by.itacademy.task.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by daryatratseuskaya on 12/28/17
 */
public class CurrencyFullName {
    private List<CurrencyFullName> fullNames = new ArrayList<>();
    private String fullName;

    public List<CurrencyFullName> getFullNames() {
        return fullNames;
    }

    public void setFullNames(List<CurrencyFullName> fullNames) {
        this.fullNames = fullNames;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public CurrencyFullName(String fullName) {

        this.fullName = fullName;
    }
}
