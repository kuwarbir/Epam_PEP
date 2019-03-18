package epam_pep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTest {

	@Test
	void test() {
		SimpleInterest test=new SimpleInterest();
		double si=test.si(5,5,5);
		assertEquals(1.25,si);
		
		double ci=test.ci(10, 10,2);
		assertEquals(121.00000000000001,ci);
		
		
	}

}
