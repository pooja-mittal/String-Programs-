import java.util.Scanner;
public class RemoveSpaces1{

	public static void main(String[] args) {

		Scanner sr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=sr.nextLine();
		s=s.toLowerCase();
		sr.close();
		int count=0;
		char[] ch=s.toCharArray();
		String temp = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				
				count++;
			}
			if(count==1)
			temp +=s.charAt(i); 
				
		}
		for(int i=0; i<s.length(); i++) {
			System.out.println(temp);
		}
	}


}