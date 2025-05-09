public class q24 {
    public static void main(String[] args) {//counting total number of even number
        int evencount=0;
            for(int i=1;i<=10;i=i+1)
            {
            if(i%2==0)
            {
                evencount=evencount+1;
                System.out.println("even Numbr is : "+i);
            }
        }
        System.out.println("Total Number of Evencount:"+evencount);
    }
    
}
