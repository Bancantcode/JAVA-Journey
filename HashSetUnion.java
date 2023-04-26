import java.util.*;

public class HashSetUnion 
{
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union); 
    }
}

// Output: [1, 2, 3, 4]