package learnJava;

public class PacticBinary {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6,7,8,9,12,13,14,15};
		int n= arr.length;
		int x=14;
		int result= BinarySearch(arr, x, 0, n-1);
		if (result==-1) {
			System.out.println("Element not found ");
		}
		else {
			System.out.println("Element found on index ::" +result);
		}
		
		
	}
	
	public static int BinarySearch(int arr[], int x, int low, int high) {
		
		while(low<=high) {
			int mid = low+ (high-low)/2;
		if (arr[mid]==x) 
			return mid;	
		if (arr[mid]< x)
			low=mid+1;
		else
			high=mid-1;
		}
		return -1;	
		}
		
			
	}

