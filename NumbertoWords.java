package Day2Problems;
import java.util.Scanner;

public class NumbertoWords {
	public static void main (String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.print("Enter single digit number : ");
		  String[] array = {"Zero","One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine"};
		  int a=scan.nextInt();
		  if(a<10){
		    while (a!=0) {            
		     System.out.println("The number is : "+array[a]);
		     a=scan.nextInt();  
		    }
		  }
		  else{
		        System.out.println("This number is invalid Enter a single digit number "); 
		  }
	}

}
