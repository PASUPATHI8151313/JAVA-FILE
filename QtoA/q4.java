import java.util.Scanner;
class q4{
    public static void main(String args[])
    //get input for name department and print mark in double
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("my name is ");
        String name=Scan.nextLine();
        System.out.println("my score is ");
        double score=Scan.nextDouble();
        Scan.nextLine();
        System.out.println("my department is");
        String department=Scan.nextLine();
        System.out.println("my name is "+name);
        System.out.println("my score is "+ score/10 +"/10");
        System.out.println("my department is "+department);
        Scan.close();
    }
}