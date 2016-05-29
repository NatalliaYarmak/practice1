package practice1;

import java.util.Scanner;

public class WorkWithTextFiles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please, enter parameters:");
		System.out.println("1) file name - mandatory parameter,");
		System.out.println("2) number of lines - optional parameter.");
		System.out.println("Whitespace is a delimiter.");
		String line = scanner.nextLine();
		String [] params = line.split(" ");
		String filePath = params[0];
		int lineNumber = 10;
		if (params.length > 1)
			try{
				lineNumber = Integer.parseInt(params[1]);
			}  catch (NumberFormatException e) {
				System.out.println("Number of lines cannot be parsed. Default value will used.");
			}
		scanner.close();
		System.out.println(filePath);
		System.out.println(lineNumber);
	}
}
