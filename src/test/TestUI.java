package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.UI;


public class TestUI {
	private UI aUI;

	@Test
	public void testUI_1() {
		aUI = new UI();
		
		assertNotNull(aUI);
	}

}
