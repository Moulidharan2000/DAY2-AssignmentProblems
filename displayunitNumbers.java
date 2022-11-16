package Day2Problems;

import java.util.Scanner;

public class displayunitNumbers {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int one, ten, hundred, thousand ;
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		
		if(num <= 9999 && num > 999) {
			ten = (num/100)%10;
			System.out.println("Ten : "+ ten);
			hundred = (num/10)%10;
			System.out.println("Hundred : "+ hundred);
		}
		else {
			System.out.println("The number is invalid");
		}

	}

}
