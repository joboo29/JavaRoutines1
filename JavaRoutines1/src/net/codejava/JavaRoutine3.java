package net.codejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class JavaRoutine3 {

	static List<Integer> unsortedList = new ArrayList<>(Arrays.asList(12, 63, 4, 88, 96, 29, 28, 19, 69, 73, 53, 64, 1,
			37, 89, 78, 99, 27, 23, 71, 36, 15, 67, 47, 62, 24, 60, 18, 42, 86, 31, 61, 57, 74, 66, 17, 72, 56, 8, 81,
			34, 33, 49, 70, 92, 93, 84, 5, 16, 98, 40, 55, 35, 97, 45, 46, 68, 77, 100, 32, 6, 38, 83, 30, 26, 10, 90,
			7, 85, 41, 21, 3, 87, 44, 48, 14, 82, 91, 13, 80, 54, 75, 11, 95, 2, 50, 65, 94, 52, 22, 20, 43, 59, 9, 76,
			79, 58, 25, 39, 51));

	public static void main(String[] args) {
		/*
		 * public List<int> numbers = new List<int>() { 12, 63, 4, 88, 96, 29, 28, 19,
		 * 69, 73, 53, 64, 1, 37, 89, 78, 99, 27, 23, 71, 36, 15, 67, 47, 62, 24, 60,
		 * 18, 42, 86, 31, 61, 57, 74, 66, 17, 72, 56, 8, 81, 34, 33, 49, 70, 92, 93,
		 * 84, 5, 16, 98, 40, 55, 35, 97, 45, 46, 68, 77, 100, 32, 6, 38, 83, 30, 26,
		 * 10, 90, 7, 85, 41, 21, 3, 87, 44, 48, 14, 82, 91, 13, 80, 54, 75, 11, 95, 2,
		 * 50, 65, 94, 52, 22, 20, 43, 59, 9, 76, 79, 58, 25, 39, 51 };
		 */

		var x = 2;
		System.out.println(x);

		int[] numbersa = new int[] { 12, 63, 4, 88, 96, 29, 28, 19, 69, 73 };

		System.out.println(unsortedList);

		// TODO Auto-generated method stub
		System.out.println("Enter a Number to Perform a Task");
		System.out.println("1: Bubble Sort");
		System.out.println("2: QuickSort");
		System.out.println("3: Merge Sort");

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
		List<Integer> list = unsortedList;

		int listSize = list.size();
		int temp;

		for (int i = 0; i < (listSize - 1); i++) {
			for (int j = (i + 1); j < listSize; j++) {
				if (list.get(j) < list.get(i)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
	}

	static void QuickSort() {
		List<Integer> outputlist = QuickSortFunction(unsortedList);
		System.out.println(outputlist);
	}
	

	static List<Integer> QuickSortFunction(List<Integer> list) {
		int listSize = list.size();
		List<Integer> listLeft = new ArrayList<Integer>();
		List<Integer> listLeftTmp = new ArrayList<Integer>();
		List<Integer> listRight = new ArrayList<Integer>();
		List<Integer> outputList = new ArrayList<Integer>();
		
        if (listSize == 2) 
        {
            if (list.get(1) < list.get(0))
            {
            	outputList.add(list.get(0));
            	outputList.add(list.get(1));
            }
            else
            {
            	outputList.add(list.get(1));
            	outputList.add(list.get(0));
            }
		} 
        else if (listSize == 1) 
        {
        	    outputList.add(list.get(0));
		} 
        else 
        {
			listLeft = new ArrayList<Integer>();
			listRight = new ArrayList<Integer>();
			for (int i=1; i < listSize; i++)
			{
				if (list.get(i) > list.get(0))
				{
					listRight.add(list.get(i));
				}
				else
				{
					listLeft.add(list.get(i));
				}
			}
				
			if (listLeft.size() > 0)
			{
				listLeftTmp = QuickSortFunction(listLeft);
				outputList.addAll(QuickSortFunction(listLeft));
			}
			outputList.add(list.get(0));
			if (listRight.size() > 0)
			{
				outputList.addAll(QuickSortFunction(listRight));
			}
				
			
		}
        
        //System.out.println(outputList);
		return outputList;
	}

	static void MergeSort() {
		
		List<Integer> outputlist = MergeSortFunction(unsortedList);
		System.out.println(outputlist);
	}

	static List<Integer> MergeSortFunction(List<Integer> list) {
		int listSize = list.size();
		List<Integer> listLeft = new ArrayList<Integer>();
		List<Integer> listRight = new ArrayList<Integer>();
		List<Integer> outputList = new ArrayList<Integer>();
		int leftPointer = 0;
		int rightPointer = 0;
		boolean mergeComplete = false;
		
		if (listSize == 3) {
            if (list.get(0) < list.get(1) && list.get(0) < list.get(2))
            {
            	outputList.add(list.get(0));
            	if (list.get(1) < list.get(2))
            	{
                	outputList.add(list.get(1));
                	outputList.add(list.get(2));
            	}
            	else
            	{
                	outputList.add(list.get(2));
                	outputList.add(list.get(1));
            	}

            }
            else if (list.get(1) < list.get(0) && list.get(1) < list.get(2))
            {
            	outputList.add(list.get(1));
            	if (list.get(0) < list.get(2))
            	{
                	outputList.add(list.get(0));
                	outputList.add(list.get(2));
            	}
            	else
            	{
                	outputList.add(list.get(2));
                	outputList.add(list.get(0));
            	}

            }
            else
            {
            	outputList.add(list.get(2));
            	if (list.get(0) < list.get(1))
            	{
                	outputList.add(list.get(0));
                	outputList.add(list.get(1));
            	}
            	else
            	{
                	outputList.add(list.get(1));
                	outputList.add(list.get(0));
            	}
            }
		} 
		else if (listSize == 2) {
            if (list.get(1) < list.get(0))
            {
            	outputList.add(list.get(1));
            	outputList.add(list.get(0));
            }
            else
            {
            	outputList.add(list.get(0));
            	outputList.add(list.get(1));
            }
		} 
		else {
			int halfwayPoint = listSize/2;
			List<Integer> lt = list.subList(0, halfwayPoint);
			List<Integer> rt = list.subList(halfwayPoint, listSize);
			listLeft = MergeSortFunction(lt);
			listRight = MergeSortFunction(rt);
			
			while(!mergeComplete)
			{
				if (leftPointer == (listLeft.size()))
					{
						outputList.add(listRight.get(rightPointer));
						rightPointer++;
					}
				else if (rightPointer == (listRight.size()))
					{
						outputList.add(listLeft.get(leftPointer));
						leftPointer++;
					}
				else
					{
						if (listLeft.get(leftPointer) < listRight.get(rightPointer))
							{
								outputList.add(listLeft.get(leftPointer));
								leftPointer++;
							}
						else
							{
								outputList.add(listRight.get(rightPointer));
								rightPointer++;
							}
					}
				
				if (leftPointer == (listLeft.size()) && rightPointer == (listRight.size()) )
				{
					mergeComplete = true;
				}
				
			}
			
		}

		return outputList;
	}

}
