import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
    double eps = 1e-6;

    @Test 
    public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
    }


    @Test
    public void testReversed() {
        int[] input1 = { };
        assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    }

    @Test
    public void testReversed2() {
        int[] input1 = { 1, 2, 3, 4 };
        assertArrayEquals(new int[]{ 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
    }

    @Test 
    public void testReverseInPlace2() {
        int[] input1 = { 1, 2, 3, 4 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input1);
    }

    @Test
    public void testArrayWithoutLowest() {
        double r = ArrayExamples.averageWithoutLowest(new double[]{1, 1, 2, 3, 4});
        assert(Math.abs(3.0 - r) < eps);
    }

}
