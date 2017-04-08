/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author MaryBeth
 *
 */
public class AddOperatorFor2numbers extends OperatorFor2numbers implements Add {
	
	//constructors
	public AddOperatorFor2numbers(float _number1, float _number2) {
		super(_number1, _number2);
	}

	public AddOperatorFor2numbers(int _number1, int _number2) {
		super(_number1, _number2);
	}
	
	//add ints
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	//add floats
	@Override
	public float add(float num1, float num2) {
		return num1+num2;
	}

	//add using private vars
	@Override
	public float add2numbers() {
		return number1+number2;
	}


}
