import java.util.*;

public class HashSetRemoveDuplicates 
{
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list); 
    }    
}

// Output: [1, 2, 3, 4]