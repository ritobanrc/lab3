import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList l = new LinkedList();
        l.prepend(4);
        l.prepend(3);
        l.prepend(2);
        l.prepend(1);
        assertEquals("1 2 3 4 ", l.toString());
    }

    @Test
    public void testAppend() {
        LinkedList l = new LinkedList();
        l.append(4);
        l.append(3);
        l.append(2);
        l.append(1);
        assertEquals("4 3 2 1 ", l.toString());
    }
}
