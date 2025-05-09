import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//get input and print it using  while loop
        System.out.println("Enter number for a :");
        int a = scan.nextInt();
        System.out.println("Enter number for b :");
        int b = scan.nextInt();
        int i=a;
        while(i<=b)
        {
            System.out.println("the number is : "+i);
            i=i+1;
        }
        scan.close();
    }
    
}
