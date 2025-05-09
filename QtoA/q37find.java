import java.util.Scanner;
public class q37find {

    void evenorodd(int num1)
    {
        if(num1%2==0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println(" Odd Number");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        q37find obj1 = new q37find();
        obj1.evenorodd(number);
        scan.close();
    }
    // find odd or even in function and print it
}

