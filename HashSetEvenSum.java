import java.util.HashSet;

public class HashSetEvenSum
{
    static void EvenSum() 
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        int sum = 0;
        for(int num : set) 
        {
            if(num % 2 == 0) 
            {
                sum += num;
            }
        }
        System.out.println("Sum of even integers: " + sum);
    }
    public static void main(String[] args)
    {
        EvenSum();
    }
}

//Sum of even integers: 6
