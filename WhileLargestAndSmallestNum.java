public class WhileLargestAndSmallestNum 
{
    public static void main(String[] args) 
    {
        int[] arr = {3, 6, 2, 8, 1, 9, 5};
        int i = 0;
        int largest = arr[0];
        int smallest = arr[0];
        while(i < arr.length)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
            i++;
        }
        System.out.println("Largest number in the array is: "+largest);
        System.out.println("Smallest number in the array is: "+smallest);

    }   
}
