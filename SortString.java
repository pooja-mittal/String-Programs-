import java.util.Scanner;
class SortString
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();	
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			for(int j=i+1; j<s.length(); j++) {
				if(c>s.charAt(j)) {
				s=s.replace(c, s.charAt(j));
				}
			}
			System.out.print(c);	
		}
					
			
	}
}

String temp=' ';

char[] ch=s.tocharArry();
for(int i=0; i<s.length()-1; i++) 
for(int j=0; j<s.length(); j++) {
if(c[i]>c[j])
temp=c[i];
c[

