package is.ru;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@Test
  	public void testEmptyString(){
  		assertEquals(0, Calculator.add(""));
  	}
  	@Test
  	public void testOneNumber(){
    	assertEquals(1, Calculator.add("1"));
  	}
	@Test
    public void testTwoNumber(){
        assertEquals(3, Calculator.add("1,2"));
    }
	@Test
	public void testMultipleNumbers(){
	    assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testTwoNumberNewLineDeliminator(){
	    assertEquals(3, Calculator.add("1\n2"));
	}
	@Test
	public void testMultipleDeliminators(){
	    assertEquals(6, Calculator.add("1,2\n3"));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		Calculator.add("1,-1");
	}
}
