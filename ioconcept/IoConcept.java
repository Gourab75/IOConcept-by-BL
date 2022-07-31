package org.bridgelabz.ioconcept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IoConcept {
	public static void main(String[] args) throws IOException {
		// abc.txt < IO > java program
		// read
		// FileReader,BufferedReader
		// FileWriter,BufferedWriter, PrintWriter
		// Stream Based Writer and Reader

		FileWriter fileWriter = new FileWriter("abc.txt", false);
		/**
		 * this writer is basically used to write into the external file. Inside
		 * FileWriter Parameters, we are passing the path reference of external file
		 * (path should be proper) if FileWriter unable to find the file with given path
		 * reference, then it will create a new file at that directory
		 */

		fileWriter.write("Avinash\n");
		fileWriter.write((char) 98);
		fileWriter.write("\n");
		fileWriter.write('A');
		fileWriter.write("\n");
		fileWriter.write('$');
		fileWriter.write("\n");
		fileWriter.write(new char[] { 'a', 'b' });
		System.out.println((char) 98);

		/**
		 * it is basically used to update all the requested
		 */
		fileWriter.flush();
		fileWriter.close();

		FileReader reader = new FileReader("abc.txt"); // it should be present
		/**
		 * if FileReader unable to find the file st path reference, then it will throw
		 * an exception as FileNotFoundException. it can read the lines of file
		 * character by character E.g ; adagdfadghfadh
		 *
		 */

		System.out.println((int) 'A');
		while (reader.ready()) {
			System.out.print((char) reader.read());
		}

		System.out.println();

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.txt", true));
		/**
		 * writer into their constructor
		 */

		bufferedWriter.write("Avinash");
		bufferedWriter.newLine();
		bufferedWriter.write('A');
		bufferedWriter.newLine();
		bufferedWriter.write(new char[] { 'q', 'w', 'e' });
		bufferedWriter.newLine();
		bufferedWriter.write("Avinash");
		bufferedWriter.newLine();

		bufferedWriter.flush();
		bufferedWriter.close();

		BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));

		System.out.println("============= Buffered reader =============");
		while (bufferedReader.ready()) {
			System.out.println(bufferedReader.readLine());
		}

		System.out.println("============= Print Writer =============");
		PrintWriter writer = new PrintWriter(new FileWriter("abc.txt"), true);
		writer.write("Avinash\n");
		writer.println("avinash");
		writer.println(100.99);
		writer.println('A');
		writer.println(90909);
		writer.close();

		System.out.println();
		// Scanner scanner = new Scanner(System.in); // console
		Scanner scanner = new Scanner(new File("abc.txt")); // console
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}
}
