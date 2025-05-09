import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {//get input and print ot using forloop in array
        
          Scanner scan = new Scanner(System.in);
        int[] marks  = new int[5];
        for (int i=0;i<=4;i=i+1)
        {
            System.out.println("Enter The Marks Are : "+i);
            marks[i]=scan.nextInt();
        }
        for(int i=0;i<=4;i=i+1)
        {
            System.out.println("The Marks Are "+i+" is : "+marks[i]);
        }
        scan.close();
    }
    
}
