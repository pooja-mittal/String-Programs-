import java.util.Scanner;
class Panargam1
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one string");
		String s=scr.nextLine();
		s=s.toLowerCase();
		int count=0;
		while((s.length())>0) {	
			char c=s.charAt(0);
		if(c>='a' && c<='z') {
		count++; 		
		}