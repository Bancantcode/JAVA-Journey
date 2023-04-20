// Importing the FileWriter class
import java.io.FileWriter;

// Importing the IOException class for handling errors
import java.io.IOException;

class Write
{
	public static void main(String[] args) 
	{
 		try 
		{
 			FileWriter fwrite = new FileWriter("C:\\Users\\Banwagon\\OneDrive\\Desktop\\ALL\\JAVA\\BAN_101.txt", true);
 			// writing the content into the File_IO.txt file
 
 			fwrite.write("Santiago, Bryan Aaron B.\n");
 			fwrite.write("20935473\n");
 			fwrite.write("BSIT With Area Specialization in Web Development\n");
 			fwrite.write("1st Year\n");
 			// Closing the stream
 			fwrite.close();
 			System.out.println("Content is successfully written to the file.");
 		} 
		catch (IOException e) 
		{
 			System.out.println("Unexpected error occurred");
 			e.printStackTrace();
 		}
	}
}