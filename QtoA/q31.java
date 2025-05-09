import java.util.Scanner;
public class q31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the marks : ");//get the inputfor the size of the array,and input for
        //marks and print the middle element in the arrays
        int size=scan.nextInt();
        int[] marks=new int[size];
        for(int i=0;i<=size-1;i=i+1)
        {
            System.out.println("Enter the marks for "+i+":");
            marks[i]=scan.nextInt();
        }
            System.out.print("Enter the Requird  mark :");
            int a = scan.nextInt();
            System.out.println("The Marks of "+a+" is :"+marks[a]);
            scan.close();
    }
    
}
