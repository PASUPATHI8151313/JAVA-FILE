import java.util.InputMismatchException;
import java.util.Scanner;


public class excption_handling {
    public static void main(String[] args) {
        	
	Scanner Scan =new Scanner(System.in);
	try {
		System.out.println("Enter the input for a : ");
		int a = Scan.nextInt();
		System.out.println("Enter the input for b : ");
		int b = Scan.nextInt();
		int c = a/b;
		System.out.println("The value of a/b is "+c);
	}
	catch (InputMismatchException f) {
		System.out.println(f+ " enter the correct input");
	}
	catch(ArithmeticException e )
	{
		System.out.println(e+" Retry Again");
	}
	
Scan.close();
    }
}
