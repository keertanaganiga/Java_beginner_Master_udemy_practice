package java_course_udemy;


//program is given string in which separate username and 
//domain name in the gmail and check wheather domain name is equal to "gmail"

public class Challenge1 {

	public static void main(String[] args) {
		String str= "programmer@gmail.com";
		System.out.println(str.matches(".*gmail.*"));
		int index=str.indexOf("@");
		String username=str.substring(0, index);
		String domain=str.substring(index+1, str.length());
		System.out.println("Username: "+(str.substring(0, index)));
		System.out.println("Domain: "+(str.substring(index+1, str.length())));
		System.out.println(domain.startsWith("gmail"));
	}

}
