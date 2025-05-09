    //access modifiers in java

class person{                                         //class
	public String name;
	protected int age;
	private String socialsecuritynumber;
	String address;
	
	
	void disp() {                                     //function to access private access
		System.out.println(socialsecuritynumber);
	}
	
	
	person(String name,int age,String ssn,String address)//constructor
	{
		this.name= name;
		this.age = age;
		this.socialsecuritynumber = ssn;
		this.address = address;
	}
		
		
	
	
}
class employee extends person{                              //class
	employee(String name,int age,String ssn,String address)
	{
		super(name,age,ssn,address);	                 //constructor
	}
	
}
	
	

public class q41 {


	public static void main(String[] args) {
	employee e1 =new employee("john" , 54, "sst" , "chennai");
	System.out.println(e1.name);                         //call  by using obj
	System.out.println(e1.age);
	e1.disp();                                          //call by function
	System.out.println(e1.address);
	}

}
