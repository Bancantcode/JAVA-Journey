//Santiago, Bryan Aaron B. | ICT-101

import java.io.File; // Importing the File class
import java.io.FileNotFoundException; // Importing FileNotFoundException class for handling errors
import java.util.Scanner; // Importing the Scanner class for reading text files

class ReadFromFile 
{
	public static void main(String[] args) 
	{
 		try 
		{
 			// Create f1 object of the file to read data
 			File f1 = new File("C:\\Users\\Banwagon\\OneDrive\\Desktop\\ALL\\JAVA\\BAN_101.txt");
 			Scanner dataReader = new Scanner(f1);
 			while (dataReader.hasNextLine()) 
			{
 				String fileData = dataReader.nextLine();
 				System.out.println(fileData); 
			}
 			dataReader.close();
 		} 
		catch (FileNotFoundException exception) 
		{
 			System.out.println("Unexcpected error occurred!");
 			exception.printStackTrace(); 
		}
	}
}