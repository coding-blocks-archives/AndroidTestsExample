package com.codingblocks.androidtestsexample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTests {


    @Before
    public void x () {
        //this runs before all tests
    }
    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void onCreate_works() throws Exception {
        final MainActivity mainActivity = (MainActivity) mainActivityRule.getActivity();

        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mainActivity.etKm.setText("0");
                mainActivity.etMin.setText("0");
                mainActivity.btnCalc.performClick();
                assertEquals(25, Float.valueOf(mainActivity.tvFare.getText().toString()), 0.001);
            }
        });
    }
}
