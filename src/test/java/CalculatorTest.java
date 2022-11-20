import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals("Add result is wrong!", 10, calculator.add(5, 5));
    }

    @Test
    public void subtractTest() {
        assertEquals("Subtract result is wrong!", 0, calculator.subtract(5, 5));
    }

    @Test
    public void multiplyTest() {
        assertEquals("Multiply result is wrong!", 25, calculator.multiply(5, 5));
    }

    @Test
    public void divideTest() {
        assertEquals("Divide result is wrong!", 1, calculator.divide(5, 5));
    }
}
