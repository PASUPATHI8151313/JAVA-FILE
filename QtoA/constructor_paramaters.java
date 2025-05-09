public class constructor_paramaters {

    constructor_paramaters()//constructor without parameter
	{
		System.out.println("empty constructor");
	}
	constructor_paramaters(int a)//constructor with parameter
	{
		System.out.println(" constructor in value");
	}

	public static void main(String[] args) {
		constructor_paramaters obj1 = new constructor_paramaters(100);//to call constructor with parameter
		System.out.println(obj1);
		constructor_paramaters obj2 = new constructor_paramaters();//to call constructor without parameter
		System.out.println(obj2);
	}
		
    //constructor_paramaters overloading
}
