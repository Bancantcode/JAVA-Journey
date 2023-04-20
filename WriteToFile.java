//Santiago, Bryan Aaron B. | ICT-101

import java.io.FileWriter; // Importing the FileWriter class
import java.io.IOException; // Importing the IOException class for handling errors

class WriteToFile 
{
	public static void main(String[] args) 
	{
 		try 
		{
 			FileWriter fwrite = new FileWriter("C:\\Users\\Banwagon\\OneDrive\\Desktop\\ALL\\JAVA\\BAN_101.txt", true);
 			// writing the content into the File_IO.txt file
 			fwrite.append("Santiago, Bryan Aaron B.\n");
 			fwrite.append("20935473\n");
 			fwrite.append("BSIT With Area Specialization in Web Development\n");
 			fwrite.append("1st Year\n");
 			// Closing the stream
 			fwrite.close();
 			System.out.println("Content is successfully written to the file.");
 		} 
		catch (IOException e) 
		{
 			System.out.println("Unexpected error occurred");
 			e.printStackTrace();
 		}
 
		try 
		{
			FileWriter fwrite2 = new FileWriter("C:\\Users\\Banwagon\\OneDrive\\Desktop\\ALL\\JAVA\\BAN_101.csv", true);
 			// writing the content into the Sample.csv file
			fwrite2.append("Santiago, Bryan Aaron B.\n");
			fwrite2.append("20935473\n");
			fwrite2.append("BSIT With Area Specialization in Web Development\n");
			fwrite2.append("1st Year");
 			// Closing the stream
 			fwrite2.close();
 			System.out.println("Content is successfully written to the file.");
		} 
		catch (IOException e) 
		{
 			System.out.println("Unexpected error occurred");
 			e.printStackTrace();
 		}
	}
}