package com.sorting;
public class MergeSort{
	void merge(int arr[],int low,int m,int high)
	{
		int n1=m-low+1;
		int n2=high-m;
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(int i=0;i<n1;++i)
		{
			arr1[i]=arr[i+low];
		}
		for(int j=0;j<n2;++j)
		{
			arr2[j]=arr[m+1+j];
		}
		int k=low;
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;
			}
			else
			{
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=arr1[i];
			k++;i++;
		}
		while(j<n2)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
	}
	static void printElement(int arr[])
	{
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
	void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int m=(low+high)/2;
		    sort(arr,low,m);
		    sort(arr,m+1,high);
		    merge(arr, low, m, high);
		}
	}
	public static void main(String args[])
	{
		MergeSort obj=new MergeSort();
		int arr[]= {12,32,11,24,19,42,67,87,56};
		int n=arr.length-1;
		obj.sort(arr, 0, n);
         printElement(arr);
	}
}
