import java.util.Scanner;
class q13{
    public static void main(String args[])// ternary operator for rain
    {
        Scanner scan = new Scanner(System.in);
        boolean rain = true;
        String  result = rain?"take an umbrella":"enjoy the rain";
        System.out.print(result);
        scan.close();
    }
}