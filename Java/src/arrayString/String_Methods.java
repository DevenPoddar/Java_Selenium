package arrayString;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String First_Name = "Deven";
		
		String Last_Name = "Poddar";
		
		String Numbers = "78123451";

		
		//1.Basic Methods
		
		System.out.println(Last_Name.length());
		
		System.out.println(Last_Name.charAt(0));
		
		
		System.out.println(Last_Name.substring(6));
		
		System.out.println(Last_Name.concat(" Hi"));
		
		// 2. Comparison Methods
		
		System.out.println(First_Name.equals(Last_Name));              
		System.out.println(First_Name.equalsIgnoreCase(Last_Name));    
		System.out.println(First_Name.compareTo("Jack"));      
		System.out.println(First_Name.compareToIgnoreCase(Last_Name));
		
		
		//3. Searching Methods
		
		System.out.println(First_Name.indexOf("a")); 
		System.out.println(First_Name.lastIndexOf("a")); 
		System.out.println(Last_Name.contains(" Poddar"));   
		System.out.println(Last_Name.startsWith("Dev")); 
		System.out.println(Last_Name.endsWith("dar"));
		
		//4. Case
		
		System.out.println(First_Name.toLowerCase());
		System.out.println(First_Name.toUpperCase());
		System.out.println(Last_Name.toLowerCase());
		System.out.println(Last_Name.toUpperCase());
		
		//5. Trim and replace
		
		System.out.println(First_Name.trim());             
		System.out.println(Last_Name.replace('a', '@'));    
		System.out.println(Last_Name.replace("Deven", "Hello")); 
		
		
		//6. Conversion
		
		char[] chars = First_Name.toCharArray();  // ['1','2','3','4']
		System.out.println(String.valueOf(100)); // "100"
		byte[] bytes = Numbers.getBytes();
	}
}
