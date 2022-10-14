import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test 
	public void test() {
        LinkedList testList = new LinkedList();
        testList.prepend(14);
        testList.prepend(15);
        testList.append(17);
        assertEquals("list should be 15, 14, 17", 15, testList.first());

	}
}