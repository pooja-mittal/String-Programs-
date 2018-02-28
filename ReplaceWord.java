import java.util.Scanner;
public class ReplaceWord {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=sr.nextLine();
		sr.close();
		s=s.toLowerCase();
		String s2="";
		String[] arr=s.split(" ");
		
		for(int i=0;i<arr.length/2;i++)
		{
			if(i%2==0) {
			String temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			}
		}
		String output="";
		for(int i=0;i<arr.length;i++)
		{
			output+=arr[i]+" ";
		}
		System.out.println(output);
		}

}
