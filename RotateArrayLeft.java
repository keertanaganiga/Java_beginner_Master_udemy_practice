package java_course_udemy;

public class RotateArrayLeft {

	public static void main(String[] args) {
		int A[]= {12,35,2,1,23,56,11,26};
		int temp=A[0];
		for(int i=1;i<A.length;i++)
		{
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}

}
