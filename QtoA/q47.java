
import java.util.Scanner;


class InvalidAgeException extends Exception{
     
           
	public InvalidAgeException (String message){
		super(message);
	}
}

class AgeValidator{
	void checkage(int age) {
	try {
		if(age<=0||age>=150) {
			throw new InvalidAgeException ("Enter The Valid Age");
		}
		else {
			System.out.println(age+"   Age valid");
		}
	}
	catch(Exception e){
		System.out.println(e);
		
	}
	
	}
}
public class q47 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age  = scan.nextInt();
		AgeValidator a1 = new AgeValidator();
		a1.checkage(age);
        scan.close();
    }
}
