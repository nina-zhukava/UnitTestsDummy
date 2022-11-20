import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddCheckerTest {

    @Test
    public void evenNumberTest() {
        assertTrue("Wrong result returned!", EvenOddChecker.check(2));
    }
    @Test
    public void oddNumberTest() {
        assertFalse("Wrong result returned!", EvenOddChecker.check(1));
    }
}
