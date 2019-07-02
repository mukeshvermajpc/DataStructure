package com.sorting;
public class QuickSort {
	int partition(int arr[],int low,int high )
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	static void printQuick(int arr[])
	{
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
	}
    public void sort(int arr[],int low,int high)
    {
    	if(low<high)
    	{
    		int pi=partition(arr,low,high);
    		System.out.println(pi);
    		sort(arr,low,pi-1);
    		sort(arr,pi+1,high);
    	}
    	
    }
    public static void main(String args[])
    {
    	int arr[]= {12,8,23,21,15,45,87,34};
    	QuickSort obj=new QuickSort();
    	int n=arr.length-1;
    	obj.sort(arr, 0, n);
    	printQuick(arr);
    	
    	
    	
    	
    	
    }
}
