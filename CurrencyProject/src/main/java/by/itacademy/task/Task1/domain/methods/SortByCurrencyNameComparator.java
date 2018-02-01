package by.itacademy.task.Task1.domain.methods;

import java.util.Comparator;

import by.itacademy.task.Task1.domain.entity.Currency;

/**
 * Created by daryatratseuskaya on 2/1/18
 */
public class SortByCurrencyNameComparator implements Comparator<Currency> {
    @Override
    public int compare(Currency o1, Currency o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        return str1.compareTo(str2);
    }



}
