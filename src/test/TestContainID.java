package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.GradeSystems;
import main.Grades;


public class TestContainID {
	private GradeSystems aTree;
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("data/SimpleData.txt");
	}
	
	@Test
	public void testContainID_1() {
		Grades actual = aTree.containID("962001044");
		
		assertNotNull(actual);
	}
	
	@Test
	public void testContainID_2() {
		Grades actual = aTree.containID("");
		
		assertNull(actual);
	}
	

}
