import java.io.FileReader;
public class read_file_handling {
    public static void main(String[] args) {
       try{
        FileReader fr= new FileReader("output.txt");//obj to read file its read one by one letters
        int c= fr.read();//its the letters in number so use int data type 
        System.out.print((char)c);//in output pront the letters number to letters converting in by using (char)
        c= fr.read();
        System.out.print((char)c);
               //or
              // while(c!=-1)
             //  {
             //   System.out.print((char)c);           this code to read all the letters line by line not by single letters
             //   c= fr.read();
             //  }
               fr.close();
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
       
    }
}
