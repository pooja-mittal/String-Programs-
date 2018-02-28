import java.util.Scanner;
class ReverseString
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string ");
		String s=scr.nextLine();
		Reverse(s);
	}
		static String Reverse(String s) {
			int len=s.length();
			String s1="";
			for(int i=len-1; i>=0 ; i--) {
				char c=s.charAt(i);
				s1= s1+c;
			}
			System.out.println(s1);
			return s1;
		}
}

