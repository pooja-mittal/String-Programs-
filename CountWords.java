import java.util.Scanner;
class CountWords
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string ");
		String s=scr.nextLine();
		String a[] = s.split(" ");
		int len=a.length;
		//System.out.println(len);
		int count=0;
		for(int i=0; i<len; i++) {
			System.out.println(a[i]);
			count++;
	}
	System.out.println("total words " + count);
}
}