
class home{
    public String name = "dream home"; 
    void disp()
    {
        // public access modifiers its makes the private variable to access from anylocation
    }
}

public class public_access_modfiers {
    public static void main(String[] args) {
        home h1 = new home();
		System.out.println(h1.name);
    }
    
}
