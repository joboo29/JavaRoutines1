package net.codejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JavaRoutine3 {

	public static void main(String[] args) {
		/*
		 * public List<int> numbers = new List<int>() { 12, 63, 4, 88, 96, 29, 28, 19,
		 * 69, 73, 53, 64, 1, 37, 89, 78, 99, 27, 23, 71, 36, 15, 67, 47, 62, 24, 60,
		 * 18, 42, 86, 31, 61, 57, 74, 66, 17, 72, 56, 8, 81, 34, 33, 49, 70, 92, 93,
		 * 84, 5, 16, 98, 40, 55, 35, 97, 45, 46, 68, 77, 100, 32, 6, 38, 83, 30, 26,
		 * 10, 90, 7, 85, 41, 21, 3, 87, 44, 48, 14, 82, 91, 13, 80, 54, 75, 11, 95, 2,
		 * 50, 65, 94, 52, 22, 20, 43, 59, 9, 76, 79, 58, 25, 39, 51 };
		 */

		int[] numbersa = new int[] { 12, 63, 4, 88, 96, 29, 28, 19, 69,
				73};
		
		// TODO Auto-generated method stub
		System.out.println("Enter a Number to Perform a Task");
		System.out.println("1: Bubble Sort");
		System.out.println("2: QuickSort");
		System.out.println("3: Length of string");

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
			BubbleSort();
			break;
		case "2":
			QuickSort();
			break;
		case "3":
			MergeSort();
			break;
		}

	}

	static void BubbleSort() {
		List<Integer> list = new ArrayList<Integer>();

		int listSize = list.size();
		for (int i = 0; i < (listSize - 2); i++) 
		{
			for (int j = i; j < (listSize - 1); j++) 
			{

			}
		}
		System.out.println(list);
	}

	static void QuickSort() {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> outputlist = QuickSortFunction(list);
		System.out.println(outputlist);
	}
	
	static List<Integer> QuickSortFunction(List<Integer> list)
	{
		int listSize = list.size();
		List<Integer> listLeft = new ArrayList<Integer>();
		List<Integer> listRight = new ArrayList<Integer>();
		
		if (listSize == 3)
		{
			
		}
		else if (listSize == 2)
		{
			
		}
		else if (listSize == 1)
		{
			
		}
		else
		{
			
		}
		List<Integer> outputList = new ArrayList<Integer>();
        return outputList;
	}

	static void MergeSort() {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> outputlist = MergeSortFunction(list);
		System.out.println(outputlist);
	}
	
	static List<Integer> MergeSortFunction(List<Integer> list)
	{
		int listSize = list.size();
		List<Integer> listLeft = new ArrayList<Integer>();
		List<Integer> listRight = new ArrayList<Integer>();
		
		if (listSize == 3)
		{
			
		}
		else if (listSize == 2)
		{
			
		}
		else
		{
			
		}
		
		
		List<Integer> outputList = new ArrayList<Integer>();
        return outputList;
	}
	
	
}
