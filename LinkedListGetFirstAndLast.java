import java.util.LinkedList;

public class LinkedListGetFirstAndLast 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        String first = list.getFirst();
        String last = list.getLast();
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
