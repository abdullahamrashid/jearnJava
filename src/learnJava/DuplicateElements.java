package learnJava;

public class DuplicateElements {
	
public static void main(String arr[]) {
	
	String name[] = {"Java", "RUby", "Python",  "Java" ,"Python", "Java"};

	for(int i=0; i<name.length; i++)
		for (int j=i+1; j<name.length; j++)
			if (name[i].equals(name[j])) {
				System.out.println(" Duplicate valu is :: " + name[i]);
			}
			
}	
}

