
class person{
	String name;
	
	person( String name)
	{
		this.name = name;
		System.out.println(name);
	}
}
class employee extends person{//  super_keyword
	employee(String name)
	{
		super(name);
	}
}
public class super_keyword{
    public static void main(String[] args) {
        
        person p1 = new person("jhon");
		System.out.println(p1);
        employee e1 = new employee("brain");
		System.out.println(e1);
    }
}