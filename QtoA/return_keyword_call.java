public class return_keyword_call {
    int add(int a,int b)
    {
        int rem = a+b;
        return rem;
    }
    int sub(int a,int b)
    {
        int rem = a-b;
        return rem;
    }
    int mul(int a,int b)
    {
        int rem = a*b;
        return rem;
    }
    int div(int a,int b)
    {
        int rem = a/b;
        return rem;
    }
    public static void main(String[] args) {
        return_keyword_call obj1 = new return_keyword_call();
        int add = obj1.add(10,20); 
        int sub = obj1.sub(50,100); 
        int mul = obj1.mul(10,7); 
        int div = obj1.div(10,2); 
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
    
}//return a int by creating a function and insert value to the function  and get back the vale and print it
