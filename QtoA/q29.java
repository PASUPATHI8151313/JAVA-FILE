import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {//get input scores and print it using forloop
          Scanner scan = new Scanner(System.in);
        int[] scores=new int[10];
        scores[0]=scan.nextInt();
        scores[1]=scan.nextInt();
        scores[2]=scan.nextInt();
        scores[3]=scan.nextInt();
        scores[4]=scan.nextInt();
        scores[5]=scan.nextInt();
        scores[6]=scan.nextInt();
        scores[7]=scan.nextInt();
        scores[8]=scan.nextInt();
        scores[9]=scan.nextInt();
        for(int i=0;i<=9;i=i+1)
        {
            System.out.println("SCORES : "+scores[i]);
        }
        scan.close();
    }
    
}
