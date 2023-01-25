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

        List<String> ls = ListExamples.merge(l1, l2);
        for(String s : ls) System.out.println(ls);
    }
}
