import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetSortedSet 
{
    static void SortedSet() 
    {
        Set<String> set = new HashSet<>();
        set.add("banana");
        set.add("apple");
        set.add("orange");
        set.add("pear");
        TreeSet<String> sortedSet = new TreeSet<>(set);
        System.out.println("Set of strings in alphabetical order: " + sortedSet);
    }
    public static void main(String[] args)
    {
        SortedSet();
    }
}

//Set of strings in alphabetical order: [apple, banana, orange, pear]