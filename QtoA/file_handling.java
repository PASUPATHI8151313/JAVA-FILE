import java.io.BufferedWriter;// To create FileWrite
import java.io.FileWriter;

public class file_handling {
    public static void main(String[] args) {
        try {
			FileWriter fw = new FileWriter("New File",true);//file create parom, ,true use to make sure the file is already exist
			fw.write("Hello File");// fw.write use to insert value or newtext fw.append use to add or insert value its not overide the old text
			System.out.println("Text Added");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
}
