import java.util.Scanner;

class  q1{
    public static void main(String args[])
    //get input for name and age
    {
        Scanner Scan = new  Scanner(System.in);
        String Name = Scan.nextLine();
        int Age= Scan.nextInt();
        System.out.println("my Name is "+Name);
        System.out.println("my Age is "+Age);
        Scan.close();
    }
}