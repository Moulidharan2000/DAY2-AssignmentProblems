package Day2Problems;

import java.util.Scanner;

public class reversInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();
		int rev = 0;
		for(;num!=0; num/=10) {
			int temp = num%10;
			rev = rev*10 + temp;
		}
		System.out.println("Reversed Number : "+rev);
		

	}

}
