import java.util.ArrayList;

public class ArrayListLongestString 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        String longestString = "";
        for (String name : names) 
        {
            if (name.length() > longestString.length()) 
            {
                longestString = name;
            }
        }
        System.out.println("Longest string: " + longestString);
    }
}
