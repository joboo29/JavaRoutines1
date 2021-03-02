package net.codejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class JavaRoutine2 {

	/*
	 * 1. Hypotenuse 2. Fibonacci 3. Length of string 4. Burgers, Fries, Drinks 5.
	 * Find the number
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number to Perform a Task");
		System.out.println("1: Hypotenuse");
		System.out.println("2: Fibonacci");
		System.out.println("3: Length of string");
		System.out.println("4: Burgers, Fries, Drinks, Tacos");
		System.out.println("5: Find the Number");

		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String option = null;
		try {
			option = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		switch (option) {
		case "1":
			PrintHypotenuse();
			break;
		case "2":
			PrintFibonacci();
			break;
		case "3":
			PrintLengthOfString();
			break;
		case "4":
			PrintBurgers();
			break;
		case "5":
			RetrieveNumber();
			break;
		default:
			// code block
		}

	}

	static void PrintHypotenuse() {
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Side A");
		// Reading data using readLine
		String sideA = null;
		try {
			sideA = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int sideAint = Integer.parseInt(sideA);

		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Side B");
		// Reading data using readLine
		String sideB = null;
		try {
			sideB = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int sideBint = Integer.parseInt(sideB);

		int hypotenuseSquared = (sideAint * sideAint) + (sideBint * sideBint);
		double hyp = (double) hypotenuseSquared;
		double hypotenuse = Math.pow(hyp, 0.5);
		DecimalFormat df2 = new DecimalFormat("#.##");
		String output = "The output is " + df2.format(hypotenuse);
		System.out.println(output);
	}

	static void PrintFibonacci() {
		System.out.println("How many iterations?");
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String iteration = null;
		try {
			iteration = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int iterationInt = Integer.parseInt(iteration);

		for (int i = 0; i < iterationInt; i++) {
			int value = GetFibonacci(i);
			System.out.println(String.valueOf(value));
		}
	}

	static int GetFibonacci(int input) {
		if (input == 0) {
			return 0;
		} else if (input == 1) {
			return 1;
		} else {
			return GetFibonacci(input - 1) + GetFibonacci(input - 2);
		}
	}

	static void PrintLengthOfString() {
		System.out.println("Enter a string");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputString = null;
		try {
			inputString = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int length = inputString.length();
		System.out.println("Length:" + String.valueOf(length));
	}

	static void PrintBurgers() {
		int budget = 1000;
		
		double hyp = (double) budget/100;
		DecimalFormat df2 = new DecimalFormat("#.00"); 
		String output = "The output is " + df2.format(hyp); System.out.println(output);
		System.out.println(output);
		System.out.println("You have a " + budget + " dollars");
		
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
		 
		int burgerCount = 0;
		int friesCount = 0;
		int sodaCount = 0;
		
		int burgerPrice = 325;
		int friesPrice = 185;
		int sodaPrice = 150;
		
		int cost;
		int itemCount;
		
		String option = null;
		
		while(budget < 2000)
		{
			System.out.println("Enter a Number to Make a Purchase");
			System.out.println("1: Burger - Current Count is " + burgerCount);
			System.out.println("2: Fries - Current Count is " + friesCount);
			System.out.println("3: Soda - Current Coun4t is " + sodaCount);
			
		   if (budget == 100)
		   {
			   break;
		   }
		   
			// Reading data using readLine

			try {
				option = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (option == "1") {
				System.out.println("How Many Burgers Would You Like");
				// Reading data using readLine
				String input = null;
				try {
					input = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				itemCount = Integer.parseInt(input);
				cost = itemCount * 325;
				if (cost < budget)
				{
					System.out.println("Sorry. Out of Budget");
				}
				else
				{
					budget = budget - cost;
					burgerCount = burgerCount + itemCount;
				}
			}
			if (option == "2") {
				System.out.println("How Many Fries Would You Like");
				// Reading data using readLine
				String input = null;
				try {
					input = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				itemCount = Integer.parseInt(input);
				cost = itemCount * 185;
				if (cost < budget)
				{
					System.out.println("Sorry. Out of Budget");
				}
				else
				{
					budget = budget - cost;
					friesCount = friesCount + itemCount;
				}
			}
			if (option == "3") {
				System.out.println("How Many Sodas Would You Like");
				// Reading data using readLine
				String input = null;
				try {
					input = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				itemCount = Integer.parseInt(input);
				cost = itemCount * 150;
				if (cost < budget)
				{
					System.out.println("Sorry. Out of Budget");
				}
				else
				{
					budget = budget - cost;
					sodaCount = sodaCount + itemCount;
				}
			}
		   
		}
		

		FoodItem burger = new FoodItem("Burger", 325, 0);
		FoodItem fries = new FoodItem("Fries", 185, 0);
		FoodItem soda = new FoodItem("Soda", 150, 0);


		if (!(budget < 150))
		{
			System.out.println("Enter a Number to Make a Purchase");
			System.out.println("1: Burger");
			System.out.println("2: Fries");
			System.out.println("3: Soda");
		}
		else
		{
		   // Tally
			System.out.println("Enter a Number to Make a Purchase");
			String burgerMessage = String.format("%s Burgers", String.valueOf(burgerCount));
			System.out.println(burgerMessage);
			String friesMessage = String.format("%s Fries", String.valueOf(friesCount));
			System.out.println(friesMessage);
			String sodaMessage = String.format("%s Sodas", String.valueOf(sodaCount));
			System.out.println(sodaMessage);
		}
		









	}

	static String getMoneyString(int money)
	{
		/*
		 * int hypotenuseSquared = (sideAint * sideAint) + (sideBint * sideBint); double
		 * hyp = (double) hypotenuseSquared; double hypotenuse = Math.pow(hyp, 0.5);
		 * DecimalFormat df2 = new DecimalFormat("#.##"); String output =
		 * "The output is " + df2.format(hypotenuse); System.out.println(output);
		 */
		return "";
	}
			
	
	static void RetrieveNumber() {
		
		int min = 1;
		int max = 100;
		// Generate random double value from 50 to 100
		System.out.println("Random value in double from " + min + " to " + max + ":");
		double random_double = Math.random() * (max - min + 1) + min;
		int randomInteger = (int) random_double;
		System.out.println(random_double);

		while(true)
		{
		   if (min == 100)
		   {
			   break;
		   }
		}
		
		int quadrant;
		int phase = 0;
		int lowerBound = 1;
		int upperBound = 100;
		String message = String.format("What is the number betwen %s and %s", String.valueOf(lowerBound), String.valueOf(upperBound));
		System.out.println("What is the number?");
		

	}

}
