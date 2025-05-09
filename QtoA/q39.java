class animal{
	String name;
	int age;
	
	void makesound() {
		System.out.println("animal makes sound");//creating class and inheritance typrs
	}
}
class dog extends animal{
	 String breed;
	 @Override
	void makesound() {
		System.out.println(" dog barks");
	}

void fetch() {
	System.out.println("dog is fetching");
  }
}
class cat extends animal{
	String color;
	@Override
	void makesound() {
		System.out.println("cat meows");
	}
	void climb() {
		System.out.println("cat is climbing");
	}
}

public class q39 {
    public static void main(String[] args) {
        dog d1 = new dog();
	d1.name = "timmy";
	d1.age = 3;
	d1.breed = "gold";
	d1.makesound();
	d1.fetch();
	
	cat c1 = new cat();
	c1.name = "tommy";
	c1.age = 3;
	c1.color = "black";
	c1.makesound();
	c1.climb();
	
    }
    
}
