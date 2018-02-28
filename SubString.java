import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=scr.nextLine();
		s1=s1.toLowerCase();
		System.out.println("enter second string");
		String s2=scr.nextLine();
		s2=s2.toLowerCase();
		for(int i=0; i<s2.length(); i++) {
			for(int j=0; j<s1.length(); j++) {
				if((s2.charAt(i))==(s1.charAt(j))) {
					for(int k=i+1; k<s2.length(); k++) {
						if((s1.charAt(j))==(s1.charAt(k))) {
							System.out.println("substring");
							return;
					}
				} 

				}
					else {
					System.out.println("not substring");
					break;
				}	
			}
				
				
			}
				
				
	}
}	


