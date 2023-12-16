package samplePackage;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class InputSearchedFromFile  {
	public static Scanner fin;
	public static Scanner cin;
	public static ArrayList<String> jabber = new ArrayList <String>();
	
	public static void printMenu() {
		System.out.println("1. Print the list of words \n2. Find a word (using binary search - print the number of comparisons it took to find it) \n3. Find a word (using linear search - print the number of comparisons it took to find it) \n4. Print the number of words containing the letter sequence \"he\" \n5. Print the word(s) that occur the most times. \n6. Print unique words \n7. Print the original file \n8. Quit ");
	}
	
	public static void printList() {
		System.out.println(jabber);
	}
	
	public static void biSearch() {
		ArrayList<String> sortJabber = new ArrayList <String>(jabber);
		sortJabber.sort(Comparator.naturalOrder());
		//Collections.sort(sortJabber)
		System.out.println();
	}
	
	public static void linSearch() {
		String word;
		String check;
		System.out.println("What word are you searching for?");
		word = cin.next();
		int pos = 0;
		int count = 0;
		boolean found = false;
		while (pos < jabber.size() && !found) {
			check = jabber.get(pos);
			if (check.equals(word)) {
				found = true;
			}
			else {
				pos++;
			}
			count++;
		}
		if (found) {
			System.out.println(word +" is found as word number "+(pos+1)+" in the file and took "+count+" comparisons to find.");
		}
		else {
			System.out.println("Word not found.");
		}
	}
	
	public static void hePrint() {
		String check;
		int pos = 0;
		int count = 0;
		while (pos < jabber.size()) {
			check = jabber.get(pos);
			if (check.indexOf("he") != -1) {
				count++;
			}
			pos++;
		}
		System.out.println("There are "+count+" words containing \"he\".");
		
	}
	
	public static void mostPrint() {
		String check;
		String largest = "";
		int pos = 0;
		int count = 0;
		while (pos < jabber.size()) {
			int tempCount = 0;
			check = jabber.get(pos);
			for (String i : jabber) {
				if (i.equals(check)) {
					tempCount++;
				}
			}
			if (tempCount > count) {
				largest = check;
				count = tempCount;
			}
			pos++;
		}
		System.out.println(largest);
	}
	
	public static void uniquePrint() {
		String check;
		int pos = 0;
		int count = 0;
		while (pos < jabber.size()) {
			check = jabber.get(pos);
			for (String i : jabber) {
				if (i.equals(check)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(check);
			}
			count=0;
			pos++;
		}
	}
	
	public static void ogPrint() throws FileNotFoundException {
		Scanner fin2 = new Scanner(new File("Jabberwocky.txt"));
		while (fin2.hasNextLine()) {
			System.out.println(fin2.nextLine());
		}
	}
	
	public static void main(String[] args)  throws FileNotFoundException{
		// TODO Auto-generated method stub
		fin = new Scanner(new File("Jabberwocky.txt"));
		cin = new Scanner(System.in);
		int choice = 0;
		while (fin.hasNext()) {
			jabber.add(fin.next());
		}
		
		printMenu();
		choice = cin.nextInt();
		while (choice !=8) {
			switch (choice) {
				case 1:
					printList();
					break;
				case 2:
					biSearch();
					break;
				case 3:
					linSearch();
					break;
				case 4:
					hePrint();
					break;
				case 5:
					mostPrint();
					break;
				case 6:
					uniquePrint();
					break;
				case 7:
					ogPrint();
					break;
				default:
					break;
			}
			printMenu();
			choice = cin.nextInt();
		}
		
		fin.close();
	}

}
