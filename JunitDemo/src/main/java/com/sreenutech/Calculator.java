package com.sreenutech;

public class Calculator {

	public int add(int a, int b) {

		if (a > b) {

			return a + b;

		} else {
			return a;
		}
	}

	public int sub(int a, int b) {

		int res = a - b;

		return res;
	}

	public int mul(int a, int b) {

		int res = a * b;

		return res;
	}

}
