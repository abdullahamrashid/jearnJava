package learnJava;

public class OddEvenNumber {

	public static void main(String[] args) {
		
	
	int arr[]= {12,23,34,98,8,-23,76,109,2345};
	int max=arr[0];
	int min = arr[0];
	
	for (int i=0; i <arr.length; i++) {
		if (max<arr[i]) {
			max=arr[i];
			
		}
		if (min>arr[i]) {
			min=arr[i];
		}
	
		}
	System.out.println("Smallest Array "+ min + 
			" Largest Array " + max);
		}
	
	


	}
