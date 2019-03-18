package epam_pep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class ConstructionTest {
Scanner sc=new Scanner(System.in);
	@Test
	void test() {
		ConstructionCost test=new ConstructionCost();
		
		int r=ConstructionCost.cost("standard");
		assertEquals(1200,r);
	}
	

}
