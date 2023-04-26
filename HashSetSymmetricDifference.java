import java.util.*;

public class HashSetSymmetricDifference 
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

        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);

        Set<Integer> tempSet = new HashSet<>(set1);
        tempSet.retainAll(set2);
        symmetricDifference.removeAll(tempSet);

        System.out.println(symmetricDifference); 
    }    
}

// Output: [1, 4]