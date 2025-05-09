import java.util.Scanner;

public class throw_keyword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		try {
            System.out.print("Enter your age : ");
           int age = scan.nextInt();
           if(age<=18) {
               throw new  ArithmeticException("The age should be above 18");
            }
        }              //throw keyword use to throw an error we created 
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("program end");
	 scan.close();
    }
}
