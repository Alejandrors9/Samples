package samplePackage;
import java.io.*;
import java.util.Scanner;
public class InputOutputFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner fin = new Scanner(new File("Muffet.txt"));
		PrintWriter outFile = new PrintWriter("outFile.txt");
		int line = 1;
		while (fin.hasNextLine()) {
			outFile.println(line + ". " + fin.nextLine());
			line++;
		}
		outFile.close();
		fin.close();

	}

}
