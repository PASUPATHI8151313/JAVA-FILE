public class this_keyword {
    String clg;
	this_keyword(){
		
	}
	void myname(String clg) 
	{
		this.clg = clg ;
	}
	
public static void main(String[] args) {
	this_keyword c1= new this_keyword();
	c1.myname("kmg");
	System.out.println(c1.clg);//the use and process of this.keyword
	
	
    }
    
}
