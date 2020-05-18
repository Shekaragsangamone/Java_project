package com.test.java.prctice;

import java.util.*;

public class A6 
{  
	static void elementCount(int inputArray[])
	{
		//Creating a HashMap object with array elements as keys and their count as value

		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();

		//checking every element of array

		for (int arrayElement : inputArray) {

			/*
			 * for(int index=0; index<inputArray.length;index++) { int arrayElement =
			 * inputArray[index];
			 */
			if(hm.containsKey(arrayElement))
			{
				//If element is present in hm, increment count by 1
				hm.put(arrayElement, hm.get(arrayElement)+1);
			}
			else
			{
				//If element is not present in hm,adding this element to hm with value as 1
				hm.put(arrayElement, 1);
			}
		}

		System.out.println("count : "+hm);
	}

	public static void main(String[] args) 
	{    

		int a[]={1,1,2,2,3,3,4,1};
		elementCount(a);

	}    
}
