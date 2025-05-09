public class calinfun  {

    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        calinfun obj1 = new calinfun();
        obj1.add(10, 30);
        obj1.sub(10, 30);
        obj1.mul(10, 30);
        obj1.div(10,30);
    }
}// add ,sub,mul,div using function and class and print the output