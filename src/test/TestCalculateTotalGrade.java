package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import main.Grades;


public class TestCalculateTotalGrade {
	private Grades aGrade;
	
	@Before
	public void createGrade() {
		aGrade = new Grades("李威廷", 81, 98, 84, 90, 93);
	}
	
	@Test
	public void testCalculateTotalGrade_1() {
		double expected, actual;
		double[] weights = {0.1, 0.1, 0.1, 0.3, 0.4};
		
		expected = 90.5;
		actual = aGrade.calculateTotalGrade(weights);
		
		assertEquals(expected, actual, 0.00001);
	}
	@Test
	public void testCalculateTotalGrade_2() {
		double expected, actual;
		double[] weights = {0.2, 0.2, 0.2, 0.2, 0.2};
		
		expected = 89.2;
		actual = aGrade.calculateTotalGrade(weights);
		
		assertEquals(expected, actual, 0.00001);
	}
	@Test
	public void testCalculateTotalGrade_3() {
		double expected, actual;
		double[] weights = {0.1, 0.0, 0.1, 0.4, 0.4};
		
		expected = 89.7;
		actual = aGrade.calculateTotalGrade(weights);
		
		assertEquals(expected, actual, 0.00001);
	}
}