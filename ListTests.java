import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


class NopChecker implements StringChecker { 
    public boolean checkString(String s) {
        return true;
    }
}

public class ListTests {
    @Test
    public void testFilterNop() {
        String[] arr = new String[]{"foo", "bar", "baz"};
        List<String> l = new ArrayList(Arrays.asList(arr));
        assertArrayEquals(arr, ListExamples.filter(l, new NopChecker()).toArray());
    }

    @Test
    public void testMerge() {
        String[] arr1 = new String[]{"a", "b", "c"};
        List<String> l1 = new ArrayList(Arrays.asList(arr1));

        String[] arr2 = new String[]{"x", "y", "z"};
        List<String> l2 = new ArrayList(Arrays.asList(arr2));

        List<String> ls1 = ListExamples.merge(l1, l1);
        String[] target1 = new String[]{"a", "a", "b", "b", "c", "c"};
        for(int i = 0; i < target1.length; i++) {
            System.out.print(ls1.get(i) + " ");
            assertEquals(target1[i], ls1.get(i));
        }
        System.out.println();

        List<String> ls2 = ListExamples.merge(l1, l2);
        String[] target2 = new String[]{"a", "b", "c", "x", "y", "z"};
        for(int i = 0; i < target2.length; i++) {
            System.out.print(ls2.get(i) + " ");
            assertEquals(target2[i], ls2.get(i));
        }
    }
}
