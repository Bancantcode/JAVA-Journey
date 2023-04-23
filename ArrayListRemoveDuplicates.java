import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListRemoveDuplicates 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Bob");
        names.add("Eve");
        names.add("Charlie");

        HashSet<String> set = new HashSet<String>(names);
        names.clear();
        names.addAll(set);

        for (String name : names) 
        {
            System.out.println(name);
        }
    }
}
