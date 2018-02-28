import java.util.Scanner;
class CountOccurrence2
{	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		int count=1;
		String temp="";
		char[] ch=s.toCharArray();
		int j=0;
		for(int i=0; i<ch.length; i++) {
			count=1;
			temp=null;
			temp =""+ch[i];
			char c=ch[i];
			for(j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					temp +=ch[j];
					count++;
				} 
			}
			for(int k=j; k>=; k--) {
				if(ch[k]!=ch[j])
				count++;
				
			
		System.out.println(ch[i] + " "  + count);
		}
	}
}	
		