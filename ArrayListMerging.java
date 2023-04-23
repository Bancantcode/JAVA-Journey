import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMerging 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList);

        for (int number : mergedList) 
        {
            System.out.println(number);
        }
    }
}
