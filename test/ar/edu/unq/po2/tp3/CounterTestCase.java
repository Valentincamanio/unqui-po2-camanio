package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CounterTestCase {

	private Counter counter;

	@BeforeEach
	public void setUp() {
		counter= new Counter();
		counter.addNumber(1);
		counter.addNumber(7);
		counter.addNumber(2);

	}
	
	@Test
	public void test1() {
		assertEquals(1, counter.getEvenOcurrences());	
	}
	
	@Test
	public void test2() {
		assertEquals(2, counter.getOddOcurrences());
	}
	
	@Test
	public void test3() {
		assertEquals(3, counter.getMultiplesOcurrences(1));
	}
	
}