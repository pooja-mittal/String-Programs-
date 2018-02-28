import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		boolean b=isPalindrome(s);
		if(b)
			System.out.println("plaindrome");
		else
			System.out.println("not palindrome");
	}

	static boolean isPalindrome(String s)
	{
		int len=s.length();
		for(int i=0; i<len/2; i++) {
			if((s.charAt(i))!=(s.charAt(len-1-i))) {
				//System.out.println("not plaindrome");
				return false;
			}
		}
		//System.out.println("palindrome");
		return true;
	}
}