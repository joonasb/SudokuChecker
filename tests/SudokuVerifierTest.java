import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String d = "256489173374615982981723456593274861712836549468591327635147298127958634849362715";
String e = ".................................................................................";
String semi_e = "...........5....9...4....1.2....3.5....7.....438...2......9.....1.4...6..........";
String negative = "41736982-5632158947958724316825437169791586432346912758289643571573291684164875293";
String R3_test1 = "123123123456456456789789789231231231564564564897897897312312312645645645978978978";
String R4_test = "123456879456789123789123456123456879456789123789123456123456879456789123789123456";

SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test
	public void testCorrectString2() {
		int a = v.verify(d);
		assertEquals("correct string", a, 0);
	}
	
	@Test
	public void testEmptyString() {
		int a = v.verify(e);
		assertEquals("incorrect string", a, 1);
	}
	
	@Test
	public void testEmptyString2() {
		int a = v.verify(semi_e);
		assertEquals("incorrect string", a, 1);
	}
	
	@Test
	public void testNegativeString() {
		int a = v.verify(negative);
		assertEquals("incorrect string", a, -1);
	}
	
	@Test
	public void testR3() {
		int a = v.verify(R3_test1);
		assertEquals("incorrect string", a, -3);
	}
	
	@Test 
	public void testR4() {
		int a = v.verify(R4_test);
		assertEquals("incorrect string", a, -4);
		
	}
}
