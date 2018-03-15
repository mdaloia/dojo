package dojo10;

import dojo10.model.AndroidCongratsModel;
import dojo10.model.IOSCongratsModel;
import dojo10.presenter.AndroidPresenter;
import dojo10.presenter.IOSPresenter;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the dojo.
 */
public class DojoTest {

    @Test
    public void test_congrats_order_paid_off_for_ios_8_10_0() throws IOException {
        IOSCongratsModel expectedCongrats = new IOSCongratsModel();
        expectedCongrats.setType("offline_payment");

        IOSPresenter presenter = new IOSPresenter();

        IOSCongratsModel congrats = (IOSCongratsModel) presenter.getViewModel();

        assertEquals(expectedCongrats, congrats);
    }

    @Test
    public void test_congrats_order_paid_off_for_android_7_12_0() throws IOException {
        AndroidCongratsModel expectedCongrats = new AndroidCongratsModel();
        expectedCongrats.setType("offline_payment");

        AndroidPresenter presenter = new AndroidPresenter();

        AndroidCongratsModel congrats = (AndroidCongratsModel) presenter.getViewModel();

        assertEquals(expectedCongrats, congrats);
    }


}
