import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//finding number devisible by 3 and 5 using forloop and if else
        System.out.println("Enter num a: ");
        int a = scan.nextInt();
        System.out.println("Enter num b: ");
        int b = scan.nextInt();
        {
            for(int i=a;i<=b;i=i+1)
        if(i%3==0&&i%5==0)
        {
         System.out.println("Even Number 1 to 100 is: "+i);
        }
        }
        scan.close();
    }
    
}
