import java.util.Scanner;
class q10{
    public static void main(String args[])// average to improve skill using if else
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Subject 1 Mark:");
        int sub1=scan.nextInt();
        System.out.println("Enter Subject 2 Mark:");
        int sub2=scan.nextInt();
        System.out.println("Enter Subject 3 Mark:");
        int sub3=scan.nextInt();
        System.out.println("Enter Subject 4 Mark:");
        int sub4=scan.nextInt();
        System.out.println("Enter Subject 5 Mark:");
        int sub5=scan.nextInt();
        System.out.println("Enter Number of Subjects:");
        int totalsub=scan.nextInt();
        int totalmark=sub1+sub2+sub3+sub4+sub5;
        int avgmark=totalmark/totalsub;
        System.out.println("The Total Mark is "+totalmark);
        System.out.println("The Average Mark is "+avgmark);
        if(avgmark<35)
        {
            System.out.println("Additional Class is Required");
        }
        else{
            System.out.println("You Are Good to Go");
        }
        scan.close();
    }
}