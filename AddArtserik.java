import java.util.Scanner;

public class AddArtserik {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=scr.nextLine();
		s1=s1.toLowerCase();
		String temp="";
		for(int i=0; i<s1.length(); i++) {
			if((s1.charAt(i))=='a'){
				temp +="*"+s1.charAt(i);
				
			} 
			
			else {
				temp +=s1.charAt(i);
				
			}
			
		}
			System.out.print(temp);
	}
}	