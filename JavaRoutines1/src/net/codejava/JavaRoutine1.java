package net.codejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JavaRoutine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number to Perform a Task");
		System.out.println("1: Hello World");
		System.out.println("2: Hello World Cycle");
		System.out.println("3: Hello World Cycle with Intervals");
		System.out.println("4: Hello World Cycle with Variable Spaces");
		System.out.println("5: Find the Character");

		// Enter data using Scanner
		Scanner scanner1 = new Scanner(System.in);

		String option = null;

		option = scanner1.next();
		
		switch(option) {
		  case "1":
		    PrintHelloWorld();
		    break;
		  case "2":
		    PrintHelloCycle();
		    break;
		  case "3":
			PrintHelloCycleWaits();
			break;
		  case "4":
			PrintHelloCycleWaves();
			break;
		  case "5":
			ReturnTheCharacter();
			break;			
		  default:
		    // code block
		}

	}

	static void PrintHelloWorld() {
		System.out.println("Hello World");
	}

	static void PrintHelloCycle() {
		System.out.println("How many iterations?");

		// Enter data using Scanner
		Scanner scanner1 = new Scanner(System.in);		
		String iteration = null;
		iteration = scanner1.next();
		int iterationInt = Integer.parseInt(iteration);

		for (int i = 0; i < iterationInt; i++) {
			System.out.println("Hello World");
		}

	}

	static void PrintHelloCycleWaits() {
		
		System.out.println("How many iterations?");
		// Enter data using Scanner
		Scanner scanner1 = new Scanner(System.in);		
		String iteration = null;
		iteration = scanner1.next();
		int iterationInt = Integer.parseInt(iteration);

		System.out.println("How many seconds wait?");
		String waitTime = null;
		waitTime = scanner1.next();
		int waitTimeInt = Integer.parseInt(waitTime);
		
		for (int i = 0; i < iterationInt; i++) {
			System.out.println("Hello World");
			try {
				TimeUnit.SECONDS.sleep(waitTimeInt);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static void PrintHelloCycleWaves() {
		System.out.println("How many waves?");

		// Enter data using Scanner
		Scanner scanner1 = new Scanner(System.in);	

		String iteration = null;
		iteration = scanner1.next();
		int iterationInt = Integer.parseInt(iteration);

		for (int i = 0; i < iterationInt; i++) {
			PrintTheWaves();
		}
	}

	static void PrintTheWaves() {
		for (int i = 0; i < 8; i++) {
			String spacer = MakeSpacer(i);
			String helloWorld = String.format("Hello%sWorld", spacer);
			System.out.println(helloWorld);
			try {

				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static String MakeSpacer(int cycle) {
		int numberOfSpaces;
		if (cycle < 5) {
			numberOfSpaces = cycle + 1;
		} else {
			numberOfSpaces = 9 - cycle;
		}

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < numberOfSpaces; i++) {
			builder.append(" ");
		}

		return builder.toString();
	}

	static void ReturnTheCharacter()
	{
		String cityList = "Atlanta Baltimore Chicago Detroit Evansvile Fresno";
		int length = cityList.length();
		
		System.out.println(cityList);
		System.out.println("Enter the character index");
		
		// Enter data using Scanner
		Scanner scanner1 = new Scanner(System.in);	
		String stringIndex = null;
		stringIndex = scanner1.next();

		int stringIndexInt = Integer.parseInt(stringIndex);
		
		String char1 = String.valueOf(cityList.charAt(stringIndexInt));
		String returnString = String.format("You returned a %s", char1);
		System.out.println(returnString);
		
	}
	

	
}