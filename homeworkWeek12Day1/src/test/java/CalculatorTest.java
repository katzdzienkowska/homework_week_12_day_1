import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(255, calculator.add(200, 55));
    }

    @Test
    public void canSubtract() {
        assertEquals(33, calculator.subtract(48, 15));
    }

    @Test
    public void canMultiply() {
        assertEquals(150, calculator.multiply(50, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(4.84375, calculator.divide(15.5, 3.2), 0.01);
    }
}
