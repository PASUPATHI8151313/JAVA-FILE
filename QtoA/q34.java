import java.util.Random;

public class q34 {
    
    public static void main(String[] args) {// printing random number using while loop and random scanner 
        Random rand = new Random();
        int newnum=0;
        while(newnum!=5){
            newnum = rand.nextInt(101);
            System.out.println(newnum);
        }
    }
}
    

