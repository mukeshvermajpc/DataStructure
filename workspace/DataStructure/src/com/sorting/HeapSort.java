package com.sorting;
public class HeapSort {
  public void sort(int arr[])
  {
	  int n=arr.length;
	  for(int i=n/2-1;i>=0;i--)
	  {
		  heapify(arr,n,i);
	  }
	  for(int i=n-1;i>=0;i--)
	  {
		  int temp=arr[0];
		  arr[0]=arr[i];
		  arr[i]=temp;
		  heapify(arr,i,0);
	  }
	  
  }
  void heapify(int arr[],int n,int i)
  {
	  int largest=i;
	  int l=2*i+1;
	  int r=2*i+2;
	  if(l<n && arr[l]>arr[largest])
	  {
		  largest=l;
	  }
	  if(r<n && arr[r]>arr[largest])
	  {
		  largest=r;
	  }
	  if(largest !=i)
	  {
		  int temp=arr[i];
		  arr[i]=arr[largest];
		  arr[largest]=temp;
		  heapify(arr,n,largest);
	  }
  }
  void printHeap(int arr[])
  {
	  
	  for(int a:arr)
	  {
		  System.out.print(a+" ");
	  }
	  
  }
  public static void main(String args[])
  {
     HeapSort obj=new HeapSort();
     int arr[]= {12,10,8,90,43,25};
     System.out.println("Before sorting element");
     obj.printHeap(arr);
     obj.sort(arr);
     System.out.println("\nAfter sorting element");
     obj.printHeap(arr);
  }
}
