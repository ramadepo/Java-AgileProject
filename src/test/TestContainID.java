package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.GradeSystems;


public class TestContainID {
	private GradeSystems aTree;
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("data/SimpleData.txt");
	}
	
	@Test
	public void testContainID_1() {
		boolean expected = true;
		boolean actual = aTree.containID("962001044");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testContainID_2() {
		boolean expected = false;
		boolean actual = aTree.containID("");
		
		assertEquals(expected, actual);
	}
	

}
