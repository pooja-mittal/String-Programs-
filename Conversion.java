import java.util.Scanner;
class Conversion
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		int len=s.length();
		for(int i=0; i<len; i++) {
			char c=s.charAt(i);
			if((c>='A') && (c<='Z')) {
				c=Character.toLowerCase(c);
				System.out.print(c);
			}
			else {
				c=Character.toUpperCase(c);
				System.out.print(c);
			}
		}
	}
}