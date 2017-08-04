package com.codingblocks.androidtestsexample;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.codingblocks.androidtestsexample.MainActivity.calcFare;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityTests {

    @Test
    public void calcFare_works() throws Exception {
        assertEquals("Fare calculated was wrong", 25, calcFare(0, 0), 0.001);
        assertEquals("Fare calculated was wrong", 33, calcFare(3, 0), 0.001);
        assertEquals("Fare calculated was wrong", 38, calcFare(3, 20), 0.001);
    }
}