class home{
    private String name = "dream home"; 
    void disp()
    {
        System.out.println(name);
    }
}// private access modifiers in this methos we unable to acces outside from that  class
public class private_access_modfiers {
    public static void main(String[] args) {
        home h1 = new home();
		h1.disp();
    }
    
}
