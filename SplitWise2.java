import java.util.Scanner;
class SplitWise2
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string ");
		String s=scr.nextLine();
		String arr[] = s.split(" ");
		String s3="";
		char s2='0';
		int len=arr.length;
		for(int i=0; i<len; i++) {
			String s1=arr[i];
			for(int j=s1.length()-1; j>=0; j--) {
				 s2=s1.charAt(j);
				  s3= s3 + s2;
					
			}
			s3= s3+ " " ;
			
			

		}
		System.out.print(s3);
	}
}