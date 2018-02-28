import java.util.Scanner;
class SplitWise4
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one date in dd/mm/yy format ");
		String s=scr.nextLine();
		String arr[]=s.split("/");
		int len=arr.length;
		for(int i=0; i<len; i++) {
			if(i==0) {
				System.out.print("date ");
			System.out.println(arr[i]);
			} else if(i==1)
			{
				System.out.print("Month ");
				System.out.println(arr[i]);
			} else if(i==2) {
				System.out.print("year ");
				System.out.println(arr[i]);
			}
		}
	}
}