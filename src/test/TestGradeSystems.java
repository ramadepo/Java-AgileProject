package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.GradeSystems;


public class TestGradeSystems {
	private GradeSystems aTree;
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("data/SimpleData.txt");
	}
	
	@Test
	public void testGradeSystems_1() {
		int expected = 87;
		int actual = aTree.aGrade.lab1;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGradeSystems_2() {
		int expected = 98;
		int actual = aTree.right.aGrade.lab2;
		
		assertEquals(expected, actual);
	}

}
