import java.util.Scanner;
class CountVowels
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		int count=0;
		int len=s.length();
		for(int i=0; i<len; i++) {
			char c=s.charAt(i);
			if((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
				count++;
			}
			System.out.println("total vowels in the " + s + " " + count);
	}
}


