import java.util.*;

public class HashSetDisjoint 
{
    public static void main(String[] args) 
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);

        boolean isDisjoint = Collections.disjoint(set1, set2);

        System.out.println(isDisjoint);
    }    
}

// Output: true