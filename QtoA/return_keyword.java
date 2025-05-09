public class return_keyword {
    int chocolate(int amount)
    {
        int chocolate_price = 100;
        int rem = chocolate_price-amount;
        return rem;
    }
public static void main(String[] args) {
    return_keyword obj1 = new return_keyword();
    int rem = obj1.chocolate(150);
    System.out.println(rem);   
}
    // return in function
}
