package by.itacademy.task13.Task3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daryatratseuskaya on 1/9/18
 */
public class ATMPriorBankTest {

    ATMPriorBank atmPriorBank;

    @Before
    public void before() {
        atmPriorBank = new ATMPriorBank();
    }

    @After
    public void after() {
        atmPriorBank = null;

    }

    @Test
    public void addCash() throws Exception {

        boolean result = atmPriorBank.addCash(-100);
        assertTrue("Warn.Incorrect amount.",true);

    }

    @Test
    public void addCash1() throws Exception {

        boolean result = atmPriorBank.addCash(3590);
        assertTrue(true);

    }

    @Test
    public void takeCash() throws Exception {
        int result = atmPriorBank.takeCash(2270);
        assertTrue(true);
    }


}