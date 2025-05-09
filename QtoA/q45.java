

interface readable{
	void read();
	
}
interface writable{
	void write();
	
}
interface storable{
	void store();
}

class classed implements readable,writable,storable {

	@Override
	public void store() {
		System.out.println("store");
		
	}

	@Override
	public void write() {
		System.out.println("write");
		
	}

	@Override
	public void read() {                               //multiple inheritance  interface and implementation
		System.out.println("read");
		
	}
	
}
public class q45 {
    public static void main(String[] args) {
        classed c1 = new  classed();
        c1.read();
        c1.write();
        c1.store();
           
       
    }
}
