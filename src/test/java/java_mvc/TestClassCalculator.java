package java_mvc;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.Calculator;

public class TestClassCalculator {
	Calculator bc=new Calculator();

	@Test
	
	public void test_sum() {
		
		assertEquals(10,bc.sum(6, 4));
	}
	@Test
	
public void test_diff() {
		
		assertEquals(10,bc.diff(15, 5));
	}
	@Test

public void test_mul() {
	
	assertEquals(10,bc.MUL(2, 5));
}

}
