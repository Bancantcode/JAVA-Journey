public class ArraySecondSmallestElement 
{
    public static int secondSmallest(int[] arr) 
    {
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < smallest) 
            {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
            else if (arr[i] < secondSmallest && arr[i] != smallest) 
            {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
