//static keyword in java
class counter{                                            //class
	static int count=0;
	int instancenumber=0;
	
	counter()                                              //constructor
	{
		count=count+1;
		instancenumber = instancenumber+1;
	}
	void disp() {                                           //function
		System.out.println("Instance Number : "+instancenumber);
		System.out.println("static count : "+count);
	}
}
	

public class q42 {
    public static void main(String[] args) {
        counter c1 = new counter();
		c1.disp();                               //object 1
		counter c2 = new counter();
		c2.disp();                               //object2
		counter c3 = new counter();
		c3.disp();                               //object3
		
    }
    
}
