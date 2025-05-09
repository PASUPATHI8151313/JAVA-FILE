import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {// getinput  array and print it by using forloop
        Scanner scan = new Scanner(System.in);
      int[]score = new int[10];   
      for(int i=0;i<10;i=i+1)
      {
        System.out.println("Enter the scors "+i);
        score[i]=scan.nextInt();
      }
      for(int i=0;i<10;i=i+1)
      {
      System.out.println(score[i]);
      }
      scan.close();
    }
  
}