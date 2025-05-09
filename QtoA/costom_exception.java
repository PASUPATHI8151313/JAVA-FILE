import java.util.Scanner;

class notvalidexception extends Exception
{
	public notvalidexception(String s) {
		super(s);
	}
}
public class costom_exception {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
		try {
			System.out.println("Enter your age : ");
			int age  = Scan.nextInt();
			if(age<20) {
				throw new notvalidexception("your age shold be above 20");
			}
		}
		catch(notvalidexception e) {
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Scan.close();
    }
}
