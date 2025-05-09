public class shop {
    void getoil(int price)
    {
        System.out.println(price);
        System.out.println("take your oil");
    }
    void getchocolate(int price)
    {
        System.out.println(price);
        System.out.println(" take the chocolate");
    }
    public static void main(String[] args) {
        shop obj1 = new shop();
        obj1.getoil(100);
        obj1.getchocolate(50);
    }
    // create a function and parameters and print it
    
}
