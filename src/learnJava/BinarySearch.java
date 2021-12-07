package learnJava;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr [] = { 3,4,5,7,8,13,15,27,98};
		int n =arr.length;
		int x=98;
	int result	=Binary(arr, x, 0, n-1);
	
	if (result==-1)
	{
		System.out.println(" Element is not found ");
	}
	else {
		System.out.println( " Element found on index : " + result);
	}
		

	}
	
	public static int Binary(int arr[], int x, int low, int high) {
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			if (arr[mid]==x)
				return mid;
			if (arr[mid]<x)
				low= mid+ 1;
			else 
				high = mid -1;
			
		}
		
		
		
		return -1 ;
		
	}

}
