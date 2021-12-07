package learnJava;

public class StringManupulation {

	

	private static final String WordUtils = null;
	public static void main(String[] args) {
		
		
		String given= "My Name is Abdullah al Mamunur Rashid";
		String initials = "";
		for (String sfound : given.split(" ")) {
		  initials+=sfound.charAt(0);
		}
		System.out.println(initials);
		//String name = "My Name";
		//String initials = WordUtils.initials(name);
		//System.out.println(initials); 
		
		String[] test= given.split(" ");
		System.out.println(given.replace("to", "From"));
		String [] words = given. split(" ", 7);
		for (String word : words)
		System. out. println(word);
		System.out.println(given.substring(15));
		
	//	for (int i=0; i<=test.length; i++) {
			 //System.out.println( test[i]);
		 
		}
		
		String str = "Hey this is Ram";
		String [] words1 = str. split(" ", 9);{
		for (String word : words1)
		System. out. println(word);

	}

}
