package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.UI;


public class TestShowWelcomeMsg {
	private UI aUI;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void createUi() {
		aUI = new UI();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testShowWelcomeMsg_1() {
		aUI.showWelcomeMsg("李威廷");
		String expected = "Welcome 李威廷\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testShowWelcomeMsg_2() {
		aUI.showWelcomeMsg("凌宗廷");
		String expected = "Welcome 凌宗廷\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
	}
}
