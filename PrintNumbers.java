import java.util.Scanner;
class PrintNumbers
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		int len=s.length();
		for(int i=0; i<len; i++) {
			char c=s.charAt(i);
			if((c>='0') && (c<='9'))
				System.out.print(c);
		}
	}
}