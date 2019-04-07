package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import main.UI;


public class TestShowFinishMsg {
	private UI aUI;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void createUI() {
		aUI = new UI();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testShowFinishMsg_1() {
		aUI.showFinishMsg();
		String expected = "結束了\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}

}
