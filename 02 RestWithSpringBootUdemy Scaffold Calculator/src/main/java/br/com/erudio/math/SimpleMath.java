package br.com.erudio.math;

public class SimpleMath {
	
	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double subtract(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double multiply(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double divide(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public Double average(Double firstNumber, Double secondNumber) {
		return sum(firstNumber,secondNumber)/2;
	}
	
	public Double squareroot(Double number) {
		return (Double)Math.sqrt(number);
	}
}
