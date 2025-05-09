import java.io.BufferedWriter;//To create BufferedWriter
import java.io.FileWriter;// To create FileWrite

public class buffer_handling {
    public static void main(String[] args) {
        try {                             //using try catch defaultly to manage the erroe in the FileWriting
			FileWriter fw = new FileWriter("New File",true);//creating  FileWriter
			BufferedWriter bw = new BufferedWriter(fw);//  crating BufferdWriter
			bw.append("Hello File");//insrting value
			bw.newLine();//to make la txt to the nxtlne
			bw.write("Good");//2nd line value
			bw.close();// closing the FileWriter
			System.out.println("Text Added");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
}
