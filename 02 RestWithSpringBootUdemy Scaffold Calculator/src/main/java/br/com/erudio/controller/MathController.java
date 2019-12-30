package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverter;

@RestController
public class MathController {

	SimpleMath simpleMath = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable(value="numberOne") String numberOne,@PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));		
	}

	@RequestMapping(value="/subtract/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtract(@PathVariable(value="numberOne") String numberOne,@PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.subtract(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));		
	}
	
	@RequestMapping(value="/multiply/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiply(@PathVariable(value="numberOne") String numberOne,@PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.multiply(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));		
	}
	
	@RequestMapping(value="/divide/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double divide(@PathVariable(value="numberOne") String numberOne,@PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		} else if (NumberConverter.convertToDouble(numberTwo) == 0D) {
			throw new UnsupportedMathOperationException("Division by Zero!");
		}
		return simpleMath.divide(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));		
	}
	
	@RequestMapping(value="/average/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(@PathVariable(value="numberOne") String numberOne,@PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.average(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));		
	}
	
	@RequestMapping(value="/squareroot/{number}", method=RequestMethod.GET)
	public Double squareroot(@PathVariable(value="number") String number) throws Exception {
		if (!NumberConverter.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.squareroot(NumberConverter.convertToDouble(number));		
	}		
	
}
