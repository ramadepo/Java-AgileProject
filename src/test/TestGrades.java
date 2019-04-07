package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Grades;


public class TestGrades {
	private Grades aGrade;

	@Test
	public void testGrades_1() {
		aGrade = new Grades("李威廷", 81, 98, 84, 90, 93);
		
		assertNotNull(aGrade);
	}

}
