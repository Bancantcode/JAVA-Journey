//Write a method that takes in an array of integers and returns true if any of the integers are negative, and false otherwise.

public static boolean hasNegative(int[] arr) 
{
    for (int i : arr) 
    {
        if (i < 0) 
        {
            return true;
        }
    }
    return false;
}
