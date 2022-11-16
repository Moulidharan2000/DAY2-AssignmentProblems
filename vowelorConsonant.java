package Day2Problems;

import java.util.Scanner;

public class vowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vowel=false;;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Letter : ");
		char ch = s.next().charAt(0);
		
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : vowel = true;
		}
		if(vowel == true) {
			System.out.println(ch +" is a Vowel");
		}
		else {
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
				System.out.println(ch +" is a Consonant");
			else 
				System.out.println("Input is not an Alphabet");
		}

	}

}
