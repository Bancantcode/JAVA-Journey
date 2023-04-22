import java.util.HashSet;

public class HashSetCommonElements 
{
    static void CommonElements()
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < arr1.length; i++) 
        {
            set1.add(arr1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < arr2.length; i++) 
        {
            set2.add(arr2[i]);
        }
        set1.retainAll(set2);
        System.out.println("Common elements are: " + set1);
    }
    public static void main(String[] args)
    {
        CommonElements();
    }
}

//Common elements are: [3, 4, 5]