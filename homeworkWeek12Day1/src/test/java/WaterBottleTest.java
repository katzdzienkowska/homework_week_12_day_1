import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void hasSetVolume() {
        assertEquals(50, bottle.setVolume(50));
    }

    @Test
    public void hasAddedDrink() {
        bottle.addDrink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void hasEmptiedBottle() {
        bottle.emptyBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void hasFilledBottle() {
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }
}
