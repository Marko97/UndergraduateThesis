package com.example.konvertermjernihjedinica;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.OpenLinkAction;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private String testNumber = "5";
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserChoosingDistance()
    {
        Espresso.onView(withId(R.id.duljinaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("0.05")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.duljinaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("500.0")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingWeight()
    {
        Espresso.onView(withId(R.id.masaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("0.05")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.masaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("500.0")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingArea()
    {
        Espresso.onView(withId(R.id.povrsinaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("5.0E-8")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.povrsinaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("5.0E8")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingTemperature()
    {
        Espresso.onView(withId(R.id.temperaturaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(0).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("41.0")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.temperaturaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(0).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("-15.0")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingVolume()
    {
        Espresso.onView(withId(R.id.volumenBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("0.5")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.volumenBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("50.0")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingData()
    {
        Espresso.onView(withId(R.id.dataBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("6.25E8")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.dataBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("4.0E-8")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingSpeed()
    {
        Espresso.onView(withId(R.id.brzinaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("4.345105051408136")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.brzinaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("5.753600823045268")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingFrequency()
    {
        Espresso.onView(withId(R.id.frekvencijaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("5000.0")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.frekvencijaBtn)).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("0.005")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingEnergy()
    {
        Espresso.onView(withId(R.id.energijaBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("0.02092")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.energijaBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("1195.0286806883364")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingFuel()
    {
        Espresso.onView(withId(R.id.gorivoBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(0).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("56.496")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.gorivoBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(0).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("56.49618726636443")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingPressure()
    {
        Espresso.onView(withId(R.id.tlakBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("0.006578929188255613")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.tlakBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("3800.0105008925757")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingAngle()
    {
        Espresso.onView(withId(R.id.kutBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("1.4537037037037037")));
        Espresso.pressBack();

        Espresso.onView(withId(R.id.kutBtn)).perform(scrollTo()).perform(click());
        Espresso.onView(withId(R.id.Spinner1)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());
        Espresso.onView(withId(R.id.firstNumEditText)).perform(typeText(testNumber));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.Spinner2)).perform(click());
        Espresso.onData(allOf(is(instanceOf(String.class)))).atPosition(3).perform(click());
        Espresso.onView(withId(R.id.pretvoriBtn)).perform(click());
        Espresso.onView(withId(R.id.resultTextView)).check(matches(withText("17.197452229299362")));
        Espresso.pressBack();
    }
    @Test
    public void testUserChoosingAboutAuthor()
    {
        Espresso.onView(withId(R.id.oAutoruBtn)).perform(scrollTo()).perform(click());
        Espresso.pressBack();
    }

    @After
    public void tearDown() throws Exception {
    }
}