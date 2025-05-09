

interface printable{
	void display();
	
}
interface showable{
	void display();
	
}

class document implements printable,showable {

	@Override
	public void display() {
		System.out.println("the document");
		
		
	}
	
}


public class multiple_inheritance {                          //multiple inheritance  interface and implementation
    public static void main(String[] args) {
        
        document d1 =new document();
        d1.display();
        
    }
}
