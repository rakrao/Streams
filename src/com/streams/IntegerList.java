package com.streams;

import java.util.ArrayList; //packages
import java.util.function.Predicate;

public class IntegerList { // class
	public static void main(String[] args) { // main function
		ArrayList<Integer> intList = new ArrayList<>(); // creating array list
		for (int i = 0; i < 10; i++) {
			intList.add(1 + (int) (Math.random() * 1000));

			Predicate<Integer> isEven = number -> number % 2 == 0;
			Predicate<Integer> isOdd = number -> number % 2 != 0;
			Predicate<Integer> isDivisibleBySix = number -> number % 6 == 0; // using predicate
			Predicate<Integer> isLessThanTwelve = number -> number < 120;
			Predicate<Integer> isGreaterThanFifty = number -> number > 50;

			System.out.println("Integers in the list are:");
			intList.stream().forEach(System.out::println);

			System.out.println("Even numbers from the list are:");
			intList.stream().filter(isEven).forEach(System.out::println); // printing values using streams

			System.out.println("Odd numbers from the list are:");
			intList.stream().filter(isOdd).forEach(System.out::println);

			System.out.println("Number divisible by six are:");
			intList.stream().filter(isDivisibleBySix).forEach(System.out::println);

			System.out.println("Numbers less than 12 are:");
			intList.stream().filter(isLessThanTwelve).forEach(System.out::println);

			System.out.println("Numbers greater than 50 are:");
			intList.stream().filter(isGreaterThanFifty).forEach(System.out::println);
		}
	}
}
