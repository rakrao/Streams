package com.lambda;

import java.net.StandardSocketOptions; //packages

public class LambdaTestClass {
	public static void main(String[] args) { // main function
		LambdaExpression lambda = new LambdaExpression(); // object
		performOperation op;
		performOperation op1;
		op = lambda.checkEvenOdd();
		int ret = lambda.checker(op, 124);
		System.out.println((ret == 0) ? "Even" : "Odd"); // checking even or odd

		op1 = lambda.checkPalindrome();
		int ret1 = lambda.checker(op1, 123);
		System.out.println((ret1 == 0) ? "Palindrome" : "Not palindrome"); // checking palindrome
		op = lambda.checkPrime();
		int re2 = lambda.checker(op1, 243);
		System.out.println((ret1 == 0) ? "Prime" : "Not prime"); // checking prime
	}
}
