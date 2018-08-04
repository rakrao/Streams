package com.stream;

import java.io.FileWriter;
import java.io.IOException; //packages
import java.io.PrintWriter;

public class WriteFile { // class
	private String path;
	private boolean append_to_file = false;

	public WriteFile(String file_path, boolean append_value) // writefile method
	{
		path = file_path;
		append_to_file = append_value;

	}

	public void writeToFile(String textLine) throws IOException // writetofile method
	{
		FileWriter write = new FileWriter(path, append_to_file);
		PrintWriter print_line = new PrintWriter(write);

		print_line.printf("%s" + "%n", textLine);
		print_line.close();
	}
}
