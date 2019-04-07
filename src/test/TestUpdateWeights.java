package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.GradeSystems;


public class TestUpdateWeights {
	private GradeSystems aTree;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private ByteArrayInputStream inContent;
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("data/SimpleData.txt");
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void test_UpdateWeights_1() {
		inContent = new ByteArrayInputStream("20\n20\n20\n20\n20\nY\n".getBytes());
		System.setIn(inContent);
		aTree.updateWeights();
		String expected = "舊配分" + "\n" + 
							"lab1\t10%" + "\n" +
							"lab2\t10%" + "\n" +
							"lab3\t10%" + "\n" +
							"midterm exam\t30%" + "\n" +
							"final exam\t40%" + "\n" +
							"輸入新配分" + "\n" +
							"lab1\t" +
							"lab2\t" +
							"lab3\t" +
							"midterm exam\t" +
							"final exam\t" +
							"請確認新配分" + "\n" +
							"lab1\t20%" + "\n" +
							"lab2\t20%" + "\n" +
							"lab3\t20%" + "\n" +
							"midterm exam\t20%" + "\n" +
							"final exam\t20%" + "\n" +
							"以上正確嗎? Y (Yes) 或 N (No)\t";
		String actual = outContent.toString();							
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_UpdateWeights_2() {
		inContent = new ByteArrayInputStream("0\n10\n10\n40\n40\nY\n".getBytes());
		System.setIn(inContent);
		aTree.updateWeights();
		String expected = "舊配分" + "\n" + 
							"lab1\t10%" + "\n" +
							"lab2\t10%" + "\n" +
							"lab3\t10%" + "\n" +
							"midterm exam\t30%" + "\n" +
							"final exam\t40%" + "\n" +
							"輸入新配分" + "\n" +
							"lab1\t" +
							"lab2\t" +
							"lab3\t" +
							"midterm exam\t" +
							"final exam\t" +
							"請確認新配分" + "\n" +
							"lab1\t0%" + "\n" +
							"lab2\t10%" + "\n" +
							"lab3\t10%" + "\n" +
							"midterm exam\t40%" + "\n" +
							"final exam\t40%" + "\n" +
							"以上正確嗎? Y (Yes) 或 N (No)\t";
		String actual = outContent.toString();							
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_UpdateWeights_3() {
		inContent = new ByteArrayInputStream("30\n30\n10\n15\n15\nY\n".getBytes());
		System.setIn(inContent);
		aTree.updateWeights();
		String expected = "舊配分" + "\n" + 
							"lab1\t10%" + "\n" +
							"lab2\t10%" + "\n" +
							"lab3\t10%" + "\n" +
							"midterm exam\t30%" + "\n" +
							"final exam\t40%" + "\n" +
							"輸入新配分" + "\n" +
							"lab1\t" +
							"lab2\t" +
							"lab3\t" +
							"midterm exam\t" +
							"final exam\t" +
							"請確認新配分" + "\n" +
							"lab1\t30%" + "\n" +
							"lab2\t30%" + "\n" +
							"lab3\t10%" + "\n" +
							"midterm exam\t15%" + "\n" +
							"final exam\t15%" + "\n" +
							"以上正確嗎? Y (Yes) 或 N (No)\t";
		String actual = outContent.toString();							
		
		assertEquals(expected, actual);
	}
}
