 import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {//get input for a array 
       int[]score = new int[5]; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score 1  ");
        score[0]=scan.nextInt(); 
        System.out.println("Enter score 2  ");
        score[1]=scan.nextInt(); 
        System.out.println("Enter score 3  ");
        score[2]=scan.nextInt(); 
        System.out.println("Enter score 4  ");
        score[3]=scan.nextInt();
        System.out.println("Enter score 5  "); 
        score[4]=scan.nextInt();
        System.out.println(score[0]+score[1]+score[2]+score[3]+ score[4]);
        scan.close();
    }
 
}