
abstract class animal{              //class
	String name;
	animal(String name)             //constructor
	{
		this.name = name;
	}
	
	abstract void makesound();       //function
}
 class dog extends animal{           //class
	 
	 dog(String name)//constructor
	 {
		 super(name);
	 }
	
	void makesound()
	{                 //function
		System.out.println("Bow Bow");
	}
}
class cat extends animal{              //class
	
	cat(String name)                  //constructor
	{
		super(name);
	}
	
	void makesound()                      //function
	{
		System.out.println("meow meow");
	}
}

public class q43 {
    public static void main(String[] args) {
        dog d1 = new dog("Tommy");
		System.out.println(d1.name);
		d1.makesound();
		cat c1 = new cat("Micky");
		System.out.println(c1.name);
		c1.makesound();
    }
    
}
