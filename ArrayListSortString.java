import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortString 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        Collections.sort(names);

        for (String name : names) 
        {
            System.out.println(name);
        }
    }
}
