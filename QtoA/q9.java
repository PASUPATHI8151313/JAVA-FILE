import java.util.Scanner;
class q9{
    public static void main(String args[])// if else using to find education level
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter mark:");
        int mark=scan.nextInt();
        if(mark<50)
        {
            System.out.print("You Need To Improve");
        }
        else if(mark>=50 || mark<=70)
        {
            System.out.print("Good Job");
        }
        else{
            System.out.print("Excllent Preformance");
        }
        scan.close();
    }
}