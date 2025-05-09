
abstract class vehicle{

	String type;
	
	static String getvehicletype(String type) {
		return  "vehicle type : "+type;
	}
	
	void startengine() {
		System.out.println("Engine Started");
	}
	void drive() {
		
	}
	
}
class car extends vehicle{
	
	
	void drive() {
		System.out.println("The vehicle driven by Using Controls");
		
	}
	
}
class motorcycle extends vehicle{
	void drive() {
		System.out.println("The vehicle driven byUsing Handelbar");
	}
}
	

public class q44 {
    public static void main(String[] args) {
        
		car c1 = new car();
		System.out.println( c1.getvehicletype("Honda"));
		c1.drive();
		motorcycle m1 = new motorcycle();
		System.out.println(m1.getvehicletype("RX 100"));
		m1.drive();
    }
    
}
