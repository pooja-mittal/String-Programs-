import java.util.Scanner;

public class StringAddition {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=scr.nextLine();
		char[] ch=s1.toCharArray();
		String temp="";
		int sum=0;
		for(int i=0; i<ch.length; i++) {
				if(ch[i]!=' ') {
					if(ch[i]>=48 && ch[i]<=57) {
						sum +=ch[i]-48;
				  							
					} else
						temp +=ch[i];
				} else {
					temp+=sum+ " "; 
					sum=0;
				}
		} 
		temp +=sum; 	
		System.out.println(temp);

	}

}
