package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.GradeSystems;


public class TestShowGrade {
	private GradeSystems aTree;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("data/SimpleData.txt");
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testShowGrade_1() {
		aTree.showGrade("962001044");
		String expected = "凌宗廷成績：lab1：    " + "87" + "\n" +
								"\t  lab2：    " + "86" + "\n" + 
								"\t  lab3：    " + "98" + "\n" +
								"\t  midterm exam：    " + "88" + "\n" +
								"\t  final exam：    " + "87" + "\n" +
						"    totoal grade：    " + "88" + "\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testShowGrade_2() {
		aTree.showGrade("962001051");
		String expected = "李威廷成績：lab1：    " + "81" + "\n" +
								"\t  lab2：    " + "98" + "\n" + 
								"\t  lab3：    " + "84" + "\n" +
								"\t  midterm exam：    " + "90" + "\n" +
								"\t  final exam：    " + "93" + "\n" +
						"    totoal grade：    " + "91" + "\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
}
