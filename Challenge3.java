package java_course_udemy;

import java.util.Iterator;

public class Challenge3 {
	public static void main(String args[]) {
		String str1="a!B@C#1$2%3";
		String str2="abc  def ghi jkl";
//		str=str.replaceAll("[^a-zA-Z0-9]", "");
		//remove special chrector from string
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
		//remove extra space from string
		//System.out.println(str2.replaceAll("[^a-zA-Z]", ""));
		System.out.println(str2.replaceAll("\\s+", ""));
		//find number of words in the string
		String words[]=str2.split("\\s+");
		System.out.println(words.length);
	}
}
