import java.util.Scanner;
class SplitWise3
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string ");
		String s=scr.nextLine();
		s=s.toLowerCase();
		String arr[]=s.split(" ");
		int len=arr.length;
		int count;
		String s3="";
		for(int i=0; i<len; i++) {
			String s2=arr[i];
			count=0;
			for(int j=((s2.length())-1); j>=0; j--) {
				int x=Math.abs(j-count);
				//System.out.print("j value " + j + " and count value " +  count);
				//System.out.println();
				//System.out.println("x value "+ x);
				char c=s2.charAt(x);
				count++;
				s3=s3+ c;
			}
			s3=s3+ " " ;
			
		}
		System.out.print(s3);
	}
}

		

			