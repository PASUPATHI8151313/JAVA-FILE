import  java.util.Scanner;
class q7{
    public static void main(String args[])
    // finding num is divisible by 3 and 5 using if else and comparision
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = scan.nextInt();
        if(num%3==0&&num%5==0){
            System.out.print("The Number is Divisible By 3 and 5");
        }
        else{
            System.out.print("The Number is Not Divisible By 3 and 5");
        }
        scan.close();
    }
}