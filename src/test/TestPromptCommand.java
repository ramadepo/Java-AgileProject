package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.UI;


public class TestPromptCommand {
	private UI aUI;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private ByteArrayInputStream inContent;
	
	@Before
	public void createUI() {
		aUI = new UI();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testPromptCommand_1() {
		inContent = new ByteArrayInputStream("E".getBytes());
		System.setIn(inContent);
		String result = aUI.promptCommand();
		String expected = "輸入指令\t1) G 顯示成績 (Grade)" + "\n" + 
								"\t2) R 顯示排名 (Rank)" + "\n" + 
								"\t3) W 更新配分 (Weight)" + "\n" + 
								"\t4) E 離開選單 (Exit)" + "\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
		assertEquals("E", result);
	}
	
	@Test
	public void testPromptCommand_2() {
		inContent = new ByteArrayInputStream("R".getBytes());
		System.setIn(inContent);
		String result = aUI.promptCommand();
		String expected = "輸入指令\t1) G 顯示成績 (Grade)" + "\n" + 
								"\t2) R 顯示排名 (Rank)" + "\n" + 
								"\t3) W 更新配分 (Weight)" + "\n" + 
								"\t4) E 離開選單 (Exit)" + "\n";
		String actual = outContent.toString();
		
		assertEquals(expected, actual);
		assertEquals("R", result);
	}
}
