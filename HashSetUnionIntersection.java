import java.util.HashSet;

public class HashSetUnionIntersection 
{
    static void SetOperator()
    {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        // Union
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of sets: " + union);
        // Intersection
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of sets: " + intersection);
    }
    public static void main(String[] args)
    {
        SetOperator();
    }
}

//Union of sets: [1, 2, 3, 4]
//Intersection of sets: [2, 3]