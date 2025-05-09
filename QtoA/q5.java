import java.util.Scanner;
class q5{
    public static void main(String args[])
    //print pass or fail using if else and comaparing methon
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your mark :");
        int mark=scan.nextInt();
        if(mark>=35)
        {
            System.out.println("Your Are Pass");
        }
        else{
            System.out.println("Your Are Fail");
        }
        scan.close();
    }
}