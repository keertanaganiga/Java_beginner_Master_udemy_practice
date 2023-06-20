package java_course_udemy;

public class RegularExpressionExample {

	public static void main(String[] args) {
		String str1="k";
		String str2="9";
		String str3= "$";
		
//		System.out.println(str1.matches("[^abc]"));
		//meta charecters
		System.out.println("meta charecters");
		//to check for alphabet or digit
		System.out.println(str1.matches("\\w"));
		//to check for digit
		System.out.println(str2.matches("\\d"));
		//to check for neither digit or alphabet
		System.out.println(str3.matches("\\W"));
		//to check for not digit
		System.out.println(str2.matches("\\D"));
		System.out.println("\n");
		
		//Quantifires
		System.out.println("Quantifires");
		String str4="javaprogram";
		
		String str5="jav";
		String str6="Kac 67 @#";
		//any charecter any number of times
		System.out.println(str4.matches(".*"));
		//check for a-z 0 or more times
		System.out.println(str4.matches("[a-z]*"));
		//exactly 3 letters
		System.out.println(str4.matches("[a-z]{3}"));
		System.out.println(str5.matches("[a-z]{3}"));
		//between the range 3 and 11
		System.out.println(str4.matches("[a-z]{3,11}"));
		System.out.println(str4.matches("[a-z]{3,7}"));
		
		
		System.out.println(str6.matches("[a-z]*\\s[a-z]{5}"));
		System.out.println(str6.matches("[A-Z]{1}[a-z]*\\s\\d{2}\\s[@$!#]{2}"));
	}

}
