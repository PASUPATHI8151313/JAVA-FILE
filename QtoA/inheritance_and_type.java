class animal{// super class                      //inheritance = single ,multilevel,hierarchical,hybrid
	void dog()
	{
		System.out.println("dog is a domastic animal");//single inheritance = dog , cat,lion
	}
}
class puppy extends animal{//sub class
	void puppy()
	{
		System.out.println("puppy is the baby of  dog");//multilevel inheritance = (dog to puppy),(cat to kitten),(lion to lion cub)
	}
}
class cat{
	void cat() // sub class
	{
		System.out.println(" cat is a domastic animal");//hierarchical inheritance under animal  = dog and cat and lion
	}
}
class kitten extends cat{
	void kitten()
	{
		System.out.println(" kitten ia the baby of cat");//hybrid inheritance all this 3 type mixed 
	}
}
class lion{//sub class
	void lion()
	{
		System.out.println(" lion is a forest animal");
	}
}
class lioncub extends lion{//sub class
	void lioncub()
	{
		System.out.println("lioncub is a forest animal ");
	}
} 
public class inheritance_and_type {
	
public static void main(String[] args) {	
	
	puppy p1 = new puppy();
	kitten k1 = new kitten();
	lioncub t1 = new lioncub();
	p1.dog();
	k1.cat();
	t1.lion();
    }
    

}