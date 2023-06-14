package java_course_udemy;

public class StringMethods {

	public static void main(String[] args) {
		String str1="java";
		String str2="KEERTANA";
		String str3=new String("java");
		
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);//both are stored in different location one in heap other in pool.
		System.out.println(str2.length());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		String str4=str2.repeat(3);//count number of times to repeat
		System.out.println(str4);
		System.out.println(str2.charAt(3));
	}

}
