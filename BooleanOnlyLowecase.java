//Write a method that takes in a string and returns true if the string contains only lowercase letters, and false otherwise.

public static boolean containsOnlyLowerCase(String str) 
{
    for (int i = 0; i < str.length(); i++) 
    {
        if (!Character.isLowerCase(str.charAt(i))) 
        {
            return false;
        }
    }
    return true;
}
