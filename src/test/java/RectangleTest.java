import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void lengthSetTest() {
        Rectangle rectangle = new Rectangle(1,2);
        rectangle.setLength(5);
        assertEquals("New length was not set!",5, rectangle.getLength(),0);
    }
    @Test
    public void lengthGetTest() {
        Rectangle rectangle = new Rectangle(1,2);
        assertEquals("Didn't get the length!",1, rectangle.getLength(),0);
    }
    @Test
    public void widthSetTest() {
        Rectangle rectangle = new Rectangle(1,2);
        rectangle.setWidth(5);
        assertEquals("New width was not set!",5, rectangle.getWidth(),0);
    }
    @Test
    public void widthGetTest() {
        Rectangle rectangle = new Rectangle(1,2);
        assertEquals("Didn't get the width!",2, rectangle.getWidth(),0);
    }
    @Test
    public void getAreaTest() {
        Rectangle rectangle = new Rectangle(1,7);
        assertEquals("Didn't get the area!",7, rectangle.getArea(),0);
    }
}
