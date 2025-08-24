package JunitTesting;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayTesting {

	@BeforeEach
	void init() {
		System.out.println("Hello World");
	}

	SortingArray sr = new SortingArray();

	@Test
	void test() {
		int[] expected = { 2, 4, 6, 8 };
		int[] actual = { 2, 4, 6, 8 };
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		System.out.println("Sorted Array");
	}

	@Test
	void testinySortingArray() {

		/*
		 * try { SortingArray sr=new SortingArray(); int unSortedArray[]=
		 * {1,9,6,7,3,4,8}; //int unSortedArray[]= null; int
		 * sorted[]=sr.sortingArray(unSortedArray);
		 * 
		 * 
		 * for(int n:sorted) { System.out.println(n); } } catch(NullPointerException e)
		 * { System.out.println("There is an exception "); }
		 */
		int unsorted[] = null;
		assertThrows(NullPointerException.class, () -> sr.sortingArray(unsorted));
		System.out.println("testing array");
	}

	@Test
	void testingsortedArray_Performance()

	{
		int unSortedArray[] = { 1, 9, 6 };
		assertTimeout(Duration.ofMillis(30), () -> sr.sortingArray(unSortedArray));
		System.out.println("Testing Performance");
	}

	@AfterEach
	void destriy() {
		System.out.println("After test destrioy");
	}
}
