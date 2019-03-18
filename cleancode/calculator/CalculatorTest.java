package epam_pep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void test() {
		Calculator test=new Calculator();
		int add=test.multiply(5, 5);
		assertEquals(25,add);
		
		int multi=test.add(5, 5);
		assertEquals(10,multi);
		double div=test.add(5, 5);
		assertEquals(10,div);
		
	}

}