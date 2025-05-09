import java.util.Scanner;
class q6{
    public static void main(String args[])
    // print loan ys or no using comparing and if else input of income
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your income :");
        int income=scan.nextInt();
        if(income>7000)
        {
            System.out.println("Your Are Eligible for Scholarship ");
        }
        else{
            System.out.println("Not Eligiblr for Scholarship");
        }
        scan.close();
    }
}