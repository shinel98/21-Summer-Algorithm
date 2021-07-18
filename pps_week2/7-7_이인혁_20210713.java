package week2;

import java.util.*;
import java.io.*;

public class KthNum {

	static int k,n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
				 
		n =Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
				 
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
					 
		}
				 
		quicksort(arr,0,n-1);
			       
		System.out.println(arr[k-1]);	
	}
	
	public static int partition(int[] array, int left, int right) {
		int mid = (left + right) / 2; 
		swap(array, left, mid); 
				 
		int pivot = array[left];
		int i = left, j = right;
				 
		while (i < j) {
			while (pivot < array[j]) { 
				j--;
			}
				 
			while (i < j && pivot >= array[i]) { 
				i++;
			}
			swap(array, i, j); 
		}

		array[left] = array[i];
		array[i] = pivot;
		return i;	
	}
			 
	public static void swap(int[] array, int a, int b) {
		int temp = array[b];
		array[b] = array[a];
		array[a] = temp;
	}
			 
	public static void quicksort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
			 
		int pi = partition(array, left, right);
			    
		if(pi+1 == k) return;
		else if(pi+1<k)
			quicksort(array, pi + 1, right);
		else
			quicksort(array, left, pi - 1);
			    
	}


	
}
