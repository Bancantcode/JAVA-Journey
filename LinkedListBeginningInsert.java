import java.util.LinkedList;

public class LinkedListBeginningInsert 
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Grape");
        System.out.println(list);
    }
}
