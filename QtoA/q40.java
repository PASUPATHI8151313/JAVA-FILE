class vehicle{
	String brand;
	int year;
	void startengine() {
		
	}
}
class car extends vehicle{
	String fuel_type;
	@Override
	void startengine() {
	System.out.println("car engine starts");
	}
	void drive() {
		System.out.println("car is driving");
	}
}
class truck extends vehicle{
	int loadcapacity;
	@Override
	void startengine() {
		System.out.println("truck engine starts");
	}
	void haul() {
		System.out.println("truck is hauling");
	}
}

public class q40 {//inheritance
    public static void main(String[] args) {
        car c1 = new car();
		c1.brand = "honda";
		c1.year = 2015;
		c1.fuel_type = "petrol";
		c1.drive();
	
		
		truck t1 = new truck();
		t1.brand = "benz";
		t1.year = 2025;
		t1.loadcapacity = 10000000;
		t1.haul();
    }
    
}
