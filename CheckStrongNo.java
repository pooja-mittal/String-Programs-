import java.util.Scanner;

 class CheckStrongNum {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter number");
		int n=scr.nextInt();
		int x=n;
		int sum=0;
		while(x>0) {
		x=x%10;
		int n1=calFactorial(x);
		sum +=n1;
		
		}
		System.out.println("sum " + sum);
		if(n==sum)
		System.out.println("string no");
		else
		System.out.println("not strong no");	
	}



	static int calFactorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact =fact*n;
		}
		return fact;	
	}

}