import java.util.*;

public class HashSetSubset 
{
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);

        boolean isSubset = set1.containsAll(set2);

        System.out.println(isSubset);
    }    
}

// Output: true