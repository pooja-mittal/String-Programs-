import java.util.Scanner;
class Swapping
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s1=scr.next();
		System.out.println("enter second string");
		String s2=scr.next();
		System.out.println("Before Swpping");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2); 
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println();
		System.out.println("After Swapping");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}
}


