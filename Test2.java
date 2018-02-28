import java.util.Scanner;
class Test2
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		for(int i=0; i<s.length(); i++) {
			
			int n=s.charAt(i);
			if (n>=97 && n<=122)
				n=n-32;
				
				System.out.print((char)n);
		}

				
	}
}