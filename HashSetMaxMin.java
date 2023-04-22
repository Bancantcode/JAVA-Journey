import java.util.HashSet;

public class HashSetMaxMin 
{
    static void MaxMin() 
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : set) 
        {
            if(num > max) 
            {
                max = num;
            }
            if(num < min) 
            {
                min = num;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
    public static void main(String[] args)
    {
        MaxMin();
    }
}

//Maximum element: 5
//Minimum element: 1
