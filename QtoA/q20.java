import java.util.Scanner;
public class q20 {
    public static void main(String[] args) { //get input an print number using forloop
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num a: ");
        int a = scan.nextInt();
        System.out.println("Enter num b: ");
        int b = scan.nextInt();
        {
            for(int i=a;i<=b;i=i+1)
            System.out.println(i);
        }
        scan.close();
    }
}
