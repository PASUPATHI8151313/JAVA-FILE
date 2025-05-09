import java.io.BufferedReader;
import java.io.FileReader;
public class read_file_handling_buffermethod {
    public static void main(String[] args) {
        try{
            FileReader fr= new FileReader("output.txt");//obj to read file
            BufferedReader br = new BufferedReader(fr);

            String line= br.readLine();
            System.out.println(line);
            line= br.readLine();
            System.out.println(line);
           
                     //or
              // while(line!=null)
             //  {
             //   System.out.println(line);           this code to read all the  line by line not by single lines
             //   line= br.readLine();
             //  }
           }
           catch(Exception e)
           {
            System.out.println(e);
           }
    }
}
