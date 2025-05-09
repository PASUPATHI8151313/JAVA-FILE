import java.util.Scanner;

class  q3{
    public static void main(String args[])
    //get input for a,b,c and ddivide d by e
   {
     Scanner Scan=new Scanner(System.in);
     int a=Scan.nextInt();
     int b=Scan.nextInt();
     int c=Scan.nextInt();
     int d=a*b*c;
     int e=a+b+c;
     System.out.print(d/e);
     Scan.close();
    }
}