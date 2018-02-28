import java.util.Scanner;
class FirstLast
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string ");
		String s=scr.nextLine();
		String arr[] = s.split(" ");
		int len=arr.length;
		String s2="";
		for(int i=0; i<len ;i++) {
			String s1=arr[i];
			 s2=s1.charAt(s1.length()-1)+s1.substring(1,s1.length()-1)+s1.charAt(0);
			s2=s2+ " ";
			System.out.print(s2);
		}
		
	}
}