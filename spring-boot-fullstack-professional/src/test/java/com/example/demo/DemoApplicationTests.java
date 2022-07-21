package com.example.demo;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
class DemoApplicationTests {

	Calculator underTest = new Calculator();

	@Test
	void itShouldAddNumbers() {
		//given
		int numberOne =  20;
		int numberTwo = 30;

		//when
		int actual = underTest.add(numberOne,numberTwo);
		int expected = numberOne + numberTwo;

		//then
		assertEquals(expected,actual);
	}

	class Calculator {
		int add(int a, int b){
			return a+b;
		}
	}

}
