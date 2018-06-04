package com.wyy.impl;

import com.wyy.interfaces.Operator;

public class OperatorImpl implements Operator{

	@Override
	public int add(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

	@Override
	public int sub(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 - number2;
	}


	@Override
	public int mul(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 * number2;
	}


	@Override
	public double div(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 / (double) number2;
	}


}
