package by.itacademy.task.Task1.domain.methods;

import by.itacademy.task.Task1.domain.entity.Currency;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by daryatratseuskaya on 1/30/18
 */
public class SearchRatesTest {

   SearchRates searchRates;

    @Before
    public void before() {

        searchRates = new SearchRates();
    }

    @After
    public void after() {
        searchRates = null;
    }
    @Test
    public void setSearchRates(){

        List<Currency> currencies = new ArrayList<>();
        Currency usd = new Currency();
        usd.setName("USD");
        currencies.add(usd);

//        boolean result = searchRates.searchSmth(currencies);
    }


}