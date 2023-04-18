import java.util.ArrayList;
import java.util.Arrays;

public class ArrayElementsGreaterThanAverage 
{
    public static int[] elementsGreaterThanAverage(int[] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        ArrayList<Integer> greaterThanAverageList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] > average) 
            {
                greaterThanAverageList.add(arr[i]);
            }
        }
        int[] greaterThanAverageArray = new int[greaterThanAverageList.size()];
        for (int i = 0; i < greaterThanAverageArray.length; i++) 
        {
            greaterThanAverageArray[i] = greaterThanAverageList.get(i);
        }
        return greaterThanAverageArray;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = elementsGreaterThanAverage(arr);
        System.out.println(Arrays.toString(result));
    }
}
