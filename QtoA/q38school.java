import java.util.Scanner;
public class q38school {

    String passorfail(int totalmark)
    {
        if(totalmark>=35)
        {
            return"pass";
        }
        else{
            return"fail";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total mark : ");
        int totalmark= scan.nextInt();
        q38school obj1 = new q38school();
        String result = obj1.passorfail(totalmark); 
        System.out.println(result);       
        scan.close();//find pass or fail and print the string output using function and return 
    }
    
}
