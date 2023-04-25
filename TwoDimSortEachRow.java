import java.util.*;

public class TwoDimSortEachRow 
{
    public static void sortRows(int[][] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            Arrays.sort(arr[i]);
        }
    }
}
