import java.util.HashSet;

public class HashSetDistinctChars 
{
    static void DistinctChar()
    {
        String str = "hello world";
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++) 
        {
            set.add(str.charAt(i));
        }
        System.out.println("Number of distinct characters: " + set.size());
    }
    public static void main(String[] args)
    {
        DistinctChar();
    }
}

//8
