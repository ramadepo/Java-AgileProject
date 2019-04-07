package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.GradeSystems;


public class TestShowRank {
	private GradeSystems aTree;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("data/SimpleData.txt");
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testShowRank_1() {
		aTree.showRank("962001044");
		String expected = "凌宗廷排名第2\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testShowRank_2() {
		aTree.showRank("962001051");
		String expected = "李威廷排名第1\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
}
