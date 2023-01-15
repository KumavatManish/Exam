package com.arraylist.main;

import java.util.Arrays;

public class LargeSamallArrayDiff {

	public static void main(String[] args) 
	{
     int arr[]= {11,45,74,98,34,24};
     System.out.println("Original Array:");
     System.out.println(Arrays.toString(arr));
     System.out.println("");
     int max=arr[0];
     for(int i=1;i<arr.length;i++)
     {
    	 if(arr[i]>max)
    	 {
    		max=arr[i]; 
    	 }
     }
     System.out.println("Max value of Array: "+max);
     System.out.println("");
     int min=arr[0];
     for(int i=1;i<arr.length;i++)
     {
    	 if(arr[i]<min)
    	 {
    		min=arr[i]; 
    	 }
     }
     System.out.println("");
     System.out.println("Min value of Array: "+min);
     System.out.println(""); 
     System.out.println("Differnce between Largest and Smallest value of element: "+(max-min));

	}

}
