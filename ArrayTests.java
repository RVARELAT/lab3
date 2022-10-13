import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3, 5, 7 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 7, 5, 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3};
    assertArrayEquals(new int[]{ 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void averageWithoutLowestEmpty() {
    double[] input1 = {};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 0.0, 0);
  }

  @Test
  public void averageWithoutLowest1() {
    double[] input1 = {1.0};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 0.0, 0);
  }

  @Test
  public void averageWithoutLowest() {
    double[] input1 = {5.0, 4.0, 3.0, 1.0, 1.0};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 4.0, 4);
  }

}
