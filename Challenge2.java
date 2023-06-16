package java_course_udemy;

public class Challenge2 {

	public static void main(String[] args) {
		int b=10110001;
		String hex="25AEC45";
		String date="08/01/2001";
		String str=String.valueOf(b);
//		String str=b+"";
		System.out.println(str.matches("[10]*"));
		System.out.println(hex.matches("[0-9A-F]+"));
		System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
	}

}
