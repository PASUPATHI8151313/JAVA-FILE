import java.util.Scanner;
class q8{
    public static void main(String args[])
    //finding even number using if else and comparision  
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=scan.nextInt();
        if(num%2==0)
        {
            System.out.print("The Entered Number is a Even Number :"+num);
        }
        else{
            System.out.print("The Entered Number is a Odd Number :"+num);
        }
        scan.close();
    }
}