import java.util.Scanner;
class CountOccurrence1
{	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		int count=1;
		String temp="";
		int i=0;
		char[] ch=s.toCharArray();
		while(ch.length>0) {
			count=1;
			temp=null;
			temp =""+ch[i];
			char c=ch[i];
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					temp +=ch[j];
					count++;
				}
			}
				
			i++;
		System.out.println(temp + " "  + count);
		}
	}
}	