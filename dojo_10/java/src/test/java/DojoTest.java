import dojo10.presenter.AndroidPresenter;
import dojo10.presenter.IOSPresenter;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the dojo.
 */
public class DojoTest {

    @Test
    public void test_congrats_order_paid_off_for_ios_8_10_0() throws IOException {
        IOSPresenter presenter = new IOSPresenter();

        Map congrats = presenter.getCongratsAsJson();

        assertEquals(
                "mlu_offline_payment",
                ((List<Map>)congrats.get("sections")).get(0).get("type")
        );
    }

    @Test
    public void test_congrats_order_paid_off_for_android_7_12_0() throws IOException {
        AndroidPresenter presenter = new AndroidPresenter();

        Map congrats = presenter.getCongratsAsJson();

        assertEquals(
                "offline_payment",
                ((List<Map>)congrats.get("sections")).get(0).get("type")
        );
    }

}
