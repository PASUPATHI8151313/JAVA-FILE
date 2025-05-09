class div{
	void sub() throws Exception
	{
		int a = 10/0;
		
	}
}

public class throws_keywords {
    public static void main(String[] args) {
        div d1 = new div();                  // throws keyword 
		try {
		d1.sub();
	}
		catch(Exception e) {
			System.out.println(e);
		}
    }
}
