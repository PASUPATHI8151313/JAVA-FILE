
import java.util.Scanner;
class dvisionexample{
	void dividenumbers(int num, int deno) {
		try {
			int  result= num/deno;
			System.out.println(" The divided number is :"+result);
		}
		catch(ArithmeticException e)
		{
				System.out.println(e+"    cannot divide by zero");
			
		}
	}                                         //try and catch method
}
public class q46 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value for num : ");
		int num = scan.nextInt();
		System.out.println("Enter the value for deno : ");
		int deno = scan.nextInt();



		dvisionexample d1 = new dvisionexample();
		d1.dividenumbers(num, deno);
        scan.close();
    }
}
