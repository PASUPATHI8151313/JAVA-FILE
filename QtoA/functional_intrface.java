
interface a{
    void disp();
}

public class functional_intrface {
    
    public static void main(String[] args) {
        a obj1 = new a(){
            public void disp()
            {
                System.out.println(" the functional interface");
            }

        };
        obj1.disp();
    }
}
