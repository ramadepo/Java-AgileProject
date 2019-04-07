package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.UI;


public class TestPromptID {
	private UI aUI;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private ByteArrayInputStream inContent;
	
	@Before
	public void createUI() {
		aUI = new UI();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testPromptID_1() {
		inContent = new ByteArrayInputStream("Q".getBytes());
		System.setIn(inContent);
		String result = aUI.promptID();
		String expected = "輸入ID或 Q (結束使用)？\t";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
		assertEquals("Q", result);
	}
	
	@Test
	public void testPromptID_2() {
		inContent = new ByteArrayInputStream("962001044".getBytes());
		System.setIn(inContent);
		String result = aUI.promptID();
		String expected = "輸入ID或 Q (結束使用)？\t";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
		assertEquals("962001044", result);
	}
	
}
