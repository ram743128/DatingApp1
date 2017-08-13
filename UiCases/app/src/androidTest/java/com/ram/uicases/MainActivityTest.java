package com.ram.uicases;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ram on 8/11/2017.
 */

@RunWith(AndroidJUnit4.class)

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=
            new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void sayHelloTest(){
        onView(withId(R.id.name_et)).perform(typeText("Ram"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        String expectedresult="Hello, Ram";
        onView(withId(R.id.hello_tv)).check(matches(withText(expectedresult)));
    }

}
