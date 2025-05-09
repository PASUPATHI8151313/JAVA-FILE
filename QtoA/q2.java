import java.util.Scanner;

class  q2{
    public static void main(String args[])
    //get input for name,age,address
    {
        Scanner Scan = new Scanner(System.in);
        String Name = Scan.nextLine();
        int Age= Scan.nextInt();
        Scan.nextLine();
        String Address= Scan.nextLine(); 
        System.out.println("my Name is "+Name);
        System.out.println("my Age is "+Age);
        System.out.println("my Adress is "+Address);
        Scan.close();
    }
}