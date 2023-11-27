package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {
	//Test Case 1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack(5);
		assertEquals(true,s1.isEmpty());
	}
	
	//Test Case 2
	public void testPushElmToTop(){
		try{
			Stack s = new Stack(5);
			Object elm = 10;
			
			s.push(elm);
			assertEquals(elm,s.top());
		}
		catch (Exception e) {
			fail("Exception should not be thrown");
		}
	}
	
	//Test Case 3
	public void testPushElmofSameType(){
		try {
			Stack s = new Stack(5);
			s.push(1);
			s.push("A");
			fail("Expected an Exception but none was thrown.");
		}
		catch(Exception e){
			assertEquals("All elements in the stack must be of the same type.",e.getMessage());
		}
		
	}

	//Test Case 4
	public void testLastInFirstOut() {
		try {
			Stack s = new Stack(5);
			
			s.push(1);
			s.push(2);
			
			assertEquals(2,s.top());
			
			Object poppedElement1 = s.pop();
			Object poppedElement2 = s.pop();
			
			assertEquals(2, poppedElement1);
			assertEquals(1, poppedElement2);
			assertTrue(s.isEmpty());
		}
		catch(Exception e) {
			fail("Unexpected exception was thrown: " + e.getMessage());
		}
	}
	
	//Test Case 5
	public void testStackCapacityLimit() {
		try {
			Stack s = new Stack(2);
			s.push(1);
			s.push(2);
			s.push(3);
			fail("Expected an Exception but none was thrown.");
		}
		catch (Exception e){
			assertEquals("Stack is full", e.getMessage());
		}
	}
}