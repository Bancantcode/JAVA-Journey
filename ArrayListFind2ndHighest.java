import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFind2ndHighest 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

        Collections.sort(numbers);

        int secondHighest = numbers.get(numbers.size() - 2);

        System.out.println("Second highest number: " + secondHighest);
    }
}
