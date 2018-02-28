import java.util.Scanner;
import java.util.Arrays;
class Sorting
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string ");
		String s=scr.nextLine();
		String arr[] = s.split(" ");
		int len=arr.length;
		Arrays.sort(arr);
		//System.out.println(Arrays.sort(arr));
		System.out.println(Arrays.toString(arr));
	}
}


		