import java.util.Scanner;
class q14{
    public static void main(String args[])//ternary operator tp find greater number
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Number 2: ");
        int num2 = scan.nextInt();
        String  result = num1>num2?"Number 1 is Greater: "+num1:"Number 2 is Greater: "+num2;
        System.out.print(result);
        scan.close();
    }
}