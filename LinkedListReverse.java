import java.util.LinkedList;
import java.util.Collections;

public class LinkedListReverse 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        Collections.reverse(list);
        System.out.println(list);
    }
}
