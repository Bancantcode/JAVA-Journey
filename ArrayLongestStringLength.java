public class ArrayLongestStringLength
{
    public static int longestStringLength(String[] arr) 
    {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i].length() > maxLength) 
            {
                maxLength = arr[i].length();
            }
        }
        return maxLength;
    }
}
