//Santiago, Bryan Aaron B. | ICT-101


import java.io.File; // Importing File class
import java.io.IOException; // Importing the IOException class for handling errors

class CreateFile 
{
	public static void main(String args[]) 
	{
		try 
 		{ 
			// Creating an object of a file
   			File f0 = new File("C:\\Users\\Banwagon\\OneDrive\\Desktop\\ALL\\JAVA\\BAN_101.txt");
   			if (f0.createNewFile()) 
   			{
      				System.out.println("File " + f0.getName() + " is created successfully.");
   			} 
   			else
   			{
     				System.out.println("File already exists in the directory.");
   			}
 		} 
		catch (IOException exception) 
   		{
     			System.out.println("An unexpected error is occurred.");
     			exception.printStackTrace();
   		}

		try
  		{ 
			File f1 = new File("C:\\Users\\Banwagon\\OneDrive\\Desktop\\ALL\\JAVA\\BAN_101.csv");
    			if (f1.createNewFile()) 
   			{ 
     				System.out.println("File " + f1.getName() + " is created successfully.");
   			} 
   			else 
    			{
     				System.out.println("File already exists in the directory.");
    			}
   		}
		catch (IOException exception) 
    		{
     			System.out.println("An unexpected error is occurred.");
     			exception.printStackTrace();
    		}
	}
}