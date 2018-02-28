import java.util.Scanner;
class Panargam
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		int count=0;
		String s1="abcdefghijklmnopqrstuvwxyz";
		char[] ch=s1.toCharArray();
		for(int i=0; i<s1.length(); i++) {
			for(int j=0; j<s.length(); j++) {
				if(ch[i]==s.charAt(j)) {
					ch[i]='@';
					break;
				}
			}
		}
		String s2=new String(ch);
			for(int i=0; i<s2.length(); i++) {
				if((s2.charAt(i))!='@') {
				break;
				}
			else
				count++;
			
			}
			if(count==26) 
				System.out.println("panargam");
				else
				System.out.println("not");

		
	}
}




//don't use inbuilt tolowercase method
if(ch[i]==s.charAt(j)) {
	ch[i]='@';
else
continue;
for(int i=0; i<ch.length(); i++) {
	if((ch.charAt(i))!='@') {
		
				System.out.println("not");
			break; //System.out.exit(0);