
class A extends Thread{ // creating a thread in a function by extends thread
	public void run() // thread erutha athula public void run nu tha function start aganum
	{
		for( int i=1;i<10;i++) //how many time print aganum nu solrom
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);//Thread.sleep etha use pane sleeping time set panrom to pause the code 
			} catch (InterruptedException e) {// sleep use pana try/catch use pananum because InterruptedException varum 
				
				System.out.println(e);
			}
		}
	}
}
class B extends Thread{
	public void run()
	{
		for( int i=1;i<10;i++)
		{
			System.out.println("Bye");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
	}
}
public class thread {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
                   //thread start pana automatic ha start function call pananum ethu thread oda default function
        
        a1.setPriority(10);//ethu aintha code ku   more priority value set panrom atuku priority kudukum
        b1.setPriority(5);
        
        a1.start();
        b1.start();
    }
}
