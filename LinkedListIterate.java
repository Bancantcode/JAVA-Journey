import java.util.LinkedList;

public class LinkedListIterate 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        for(String element : list) {
            System.out.println(element);
        }
    }
}
