package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void Add() {
		//Arrange
		Calculator calc = new Calculator();
		double expectedResult = 20;
		//Act
		double answer = calc.Add(5, 7);
		
		//Assert
		assertEquals(expectedResult, answer);
	}
	
	@Test
	void Subtract() {
		//Arrange
		Calculator calc = new Calculator();
		double expectedResult = 5;
		//Act
		double answer = calc.Subtract(10, 5);
		
		//Assert
		assertEquals(expectedResult, answer);
	}
	@Test
	void Multiply() {
		//Arrange
		Calculator calc = new Calculator();
		double expectedResult = 20;
		//Act
		double answer = calc.Multiply(5, 5);
		
		//Assert
		assertEquals(expectedResult, answer);
	}
	@Test
	void Divide() {
		//Arrange
		Calculator calc = new Calculator();
		double expectedResult = 2;
		//Act
		double answer = calc.Divide(200, 100);
		
		//Assert
		assertEquals(expectedResult, answer);
	}

}
