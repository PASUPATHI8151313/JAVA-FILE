abstract  class vehicle{
	abstract void speed();
	void brand(){
		System.out.println("xya");
	}
}
class bike extends vehicle{
	void speed()
	{
		System.out.println("65km/h");
	}
}
class car extends vehicle{
	void speed()
	{
		System.out.println("70km/h");//abstract use to make all child clsses to override the parnt classes
	}
}

public class abstract_{
    public static void main(String[] args) {
        
    }
}