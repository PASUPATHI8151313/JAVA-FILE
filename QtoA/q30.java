import java.util.Scanner;

public interface q30 {
         public static void main(String[] args) {//printing a table by geting one input number from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number for the Table : ");
        int a = scan.nextInt();
      for(int i=1;i<=10;i=i+1)
      {
        System.out.println(i+"x"+a+"x"+i*a);
      }
      scan.close();
    }
}
