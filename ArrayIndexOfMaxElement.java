public class ArrayIndexOfMaxElement 
{
    public static int findMaxIndex(int[] arr) 
    {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }    
}
