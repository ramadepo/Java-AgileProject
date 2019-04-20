package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.GradeSystems;
import main.Grades;


public class TestGradeSystems {
	private GradeSystems aTree;
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("data/SimpleData.txt");
	}
	
	@Test
	public void testGradeSystems_1() {
		Grades aGrade = aTree.containID("962001044");
		double expected = 87;
		double actual = aGrade.lab1;
		
		assertEquals(expected, actual, 0.00001);
	}
	
	@Test
	public void testGradeSystems_2() {
		Grades aGrade = aTree.containID("962001051");
		double expected = 98;
		double actual = aGrade.lab2;
		
		assertEquals(expected, actual,0.00001);
	}

}
