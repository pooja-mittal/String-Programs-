import java.util.Scanner;
class Occurrence1
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		int len=s.length();
		int count=0;
		while((s.length())>0)
		{
			char c=s.charAt(0);
			count=s.length()-s.replace(""+c, "").length();
			System.out.println(c+  " " + count);
			s=s.replace("" + c, "");
		}
	}
}