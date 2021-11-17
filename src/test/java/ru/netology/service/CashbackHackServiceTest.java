package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
  public void shouldRemain() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 900;

        int actual = cash.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainMin() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 1;

        int actual = cash.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainMax() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 999;

        int actual = cash.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain1000() {
        CashbackHackService cash = new CashbackHackService();
        int amount = 1000;

        int actual = cash.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}