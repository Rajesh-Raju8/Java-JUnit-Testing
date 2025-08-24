package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString reverse=new ReverseString();
	@Test
	void testReverseString() {
		
		assertEquals("gnimmargorp avaJ",reverse.reverseString("Java programming"),"Test case is Failed ,Try again");
		
		
	}
	@Test
	void testingString()
	{
		String str="Hello";
		assertTrue(str.length()>=0,"The test case if failed");
		assertTrue(str.equals("Hello"));
		assertEquals(5,str.length());
		assertTrue(str.isEmpty());
		
	}
	@Test
	void TestingEmpytString()
	{
		String str1="";
		assertEquals(0,str1.equals(str1));
		
	}

}
