import java.util.LinkedList;

public class LinkedListFindPosition 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        int index = list.indexOf("Banana");
        System.out.println("Index: " + index);
    }
}
