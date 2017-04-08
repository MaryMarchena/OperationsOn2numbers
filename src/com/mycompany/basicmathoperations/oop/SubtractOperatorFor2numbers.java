/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author MaryBeth
 *
 */
public class SubtractOperatorFor2numbers extends OperatorFor2numbers implements Subtract {

	//constructors
		public SubtractOperatorFor2numbers(float _number1, float _number2) {
			super(_number1, _number2);
		}

		public SubtractOperatorFor2numbers(int _number1, int _number2) {
			super(_number1, _number2);
		}
	
	
	//subtract ints
	public int subtract(int num1, int num2) {
		return num1-num2;
	}

	//subtract floats
	public float subtract(float num1, float num2) {
		return num1-num2;
	}

	//subtract using private vars
	@Override
	public float subtract2numbers() {
		return number1-number2;
	}

}
