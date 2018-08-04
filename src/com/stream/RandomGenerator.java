//program to understand streams
package com.stream;

import java.io.File;
import java.io.IOException;
import java.util.Random; //packages
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class RandomGenerator {
	public static void main(String[] args) throws IOException { // main
		Random rand = new Random();// object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		String file_path = sc.nextLine(); // accepting input
		WriteFile write_file = new WriteFile(file_path, true);
		for (int i = 0; i < 100; i++) {
			write_file.writeToFile("" + rand.nextInt(50));
			System.out.println("\n");
		}
		Scanner s = new Scanner(new File(file_path));
		Set<Integer> set = new TreeSet<>();
		while (s.hasNextInt()) // while loop
		{
			set.add(s.nextInt());
		}
		s.close();
		set.stream().distinct().sorted().forEach(System.out::println); // printing values
	}
}
