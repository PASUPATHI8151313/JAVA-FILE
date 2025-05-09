import java.util.Scanner;
class q11{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Traffic Light Color: ");
        //trafic light using if else if
        String Color=scan.nextLine();
        
        if(Color.equals ("red"))
        {
            System.out.println("Stop");
        }
        else if(Color.equals ("yellow"))
        {
            System.out.println("Get Ready");
        }
        else if(Color.equals ("green"))
        {
            System.out.println("Go");
        }
         else {
            System.out.print("Invalid");
        }
        scan.close();
    }
}