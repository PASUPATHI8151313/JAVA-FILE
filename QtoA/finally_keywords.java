

public class finally_keywords {
    public static void main(String[] args) {
		
		 int err = 0;
	 try {
		int a =  10/0;
		err = 0;
		  }
	 catch(Exception e)
	 {
		 err = 1;
	 }
	 finally {
		if(err==1) {                                          //finally keyword use to print the content inside it if error comes or not
			 System.out.println(" Error Found pogram end");//the content will be show in the output
		 }
		else {
			System.out.println("No Error");
		}
	 }
    }
}
