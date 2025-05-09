public class constructor_inputandprint {
	int price;
	String item;
	constructor_inputandprint(int a,String b)
	{
		price=a;
		item=b;
	}
	
public static void main(String[] args) {
	
	constructor_inputandprint obj1 = new constructor_inputandprint(50,"kitkat");
	constructor_inputandprint obj2 = new constructor_inputandprint(60,"chocobar");
	System.out.println("first item and price");
	System.out.println(obj1.price);
	System.out.println(obj1.item);
	System.out.println("second item and price");
	System.out.println(obj2.price);
	System.out.println(obj2.item);//send input to the constructor and print it 
    }
    

}