import java.util.Scanner;

 class StringAnargam {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s1=scr.nextLine();
		s1=s1.toLowerCase();
		s1=removeSpaces(s1);
		System.out.println("enter second string");
		String s2=scr.nextLine();
		s2=s2.toLowerCase();
		s2=removeSpaces(s2);
		if(s1.length()==s2.length()) {
			s1=stringSorting(s1);
			s2=stringSorting(s2);
			if(s1.equals(s2))
				System.out.println("anargam strings");
			else
				System.out.println("not anargam");
		} else
			System.out.println("not anargam");	
	}
	
	static String removeSpaces(String s) {
		String temp="";
		for(int i=0; i<s.length(); i++) {
			if((s.charAt(i))!=' ')
				temp +=s.charAt(i);
		}
		return temp;
	}

	static String stringSorting(String s) {
		char[] ch=s.toCharArray();
		char temp=' ';
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				s=new String(ch);
			}
		}
		return s;
	}
}
