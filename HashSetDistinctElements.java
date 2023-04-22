import java.util.HashSet;

public class HashSetDistinctElements
{
    static void DistinctElement()
    {
        int[] array = {1, 2, 3, 4, 2, 5, 3};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++)
        {
            set.add(array[i]);
        }
        System.out.println("The Distinct elements are: " + set);

    }
    public static void main(String[] args)
    {
        DistinctElement();
    }
}

//The Distinct elements are: [1, 2, 3, 4, 5]