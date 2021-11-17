package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
  public void shouldCalculateCashbackHackService() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 900;

        int actual = cash.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashbackHackServiceMinAmount() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 1;

        int actual = cash.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashbackHackServiceBelowBorder() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 999;

        int actual = cash.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashbackHackServiceBoundaryValue() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 1000;

        int actual = cash.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateCashbackHackServiceAboveBorder() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 1001;

        int actual = cash.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}