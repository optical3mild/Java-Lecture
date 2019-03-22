package oc_190322.ex01_calculator;

public class MyCalc implements Calculator {
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	@Override
	public int subtract(int x, int y) {
		return x-y;
	}
	@Override
	public int multiply(int x, int y) {
		return x*y;
	}
}
