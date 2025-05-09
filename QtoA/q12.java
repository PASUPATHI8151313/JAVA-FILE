import java.util.Scanner;
class q12{
    public static void main(String args[])// loan eligible using nested if 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        int salary=scan.nextInt();
        System.out.print("Enter Your Age: ");
        int age=scan.nextInt();
        if(salary>=20000||age<=25)
        {
            System.out.print("Enter Your Requird loan Amount: ");
            int amount=scan.nextInt();
            if(amount<=50000)
            {
                System.out.print("You Are Eligible For Loan");
            }
            else
            {
                System.out.print("Maximum Loan Amount is 50,000 ");
            }
        }
        else{
            System.out.print("Your Not Eligibe For Loan");
        }
        scan.close();
    }
}