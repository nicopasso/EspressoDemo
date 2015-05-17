package it.nicopasso.espressodemo;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by niccolo on 17/05/15.
 */
public class SimpleNameTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public SimpleNameTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testEnterName() {
        onView(withId(R.id.name_edit)).perform(typeText("Ciccio"));
        onView(withId(R.id.next_button)).perform(click());
        onView(withId(R.id.name_text)).check(matches(withText("Hello Ciccio")));
    }

}
