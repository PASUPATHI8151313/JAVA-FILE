
interface a{
    void disp();
}
public class lambda_expression {                      //this is lambda expression  ()->{inside function content};
    public static void main(String[] args) {
        a obj1 = ()->{System.out.println("the lambada expression");};// here used lambda expresion to create a function for the function interface
    obj1.disp();
    }
}
