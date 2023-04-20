import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer 
{
    private static final int BUFFER_SIZE = 10;
    private Queue<Integer> buffer = new LinkedList<>();

    public void produce() throws InterruptedException 
    {
        int item = 0;
        while (true) 
        {
            synchronized (this) 
            {
                while (buffer.size() == BUFFER_SIZE) 
                {
                    wait();
                }
                buffer.add(item);
                System.out.println("Produced item: " + item);
                item++;
                notify();
            }
        }
    }
    public void consume() throws InterruptedException 
    {
        while (true) 
        {
            synchronized (this) 
            {
                while (buffer.isEmpty()) 
                {
                    wait();
                }
                int item = buffer.remove();
                System.out.println("Consumed item: " + item);
                notify();
            }
        }
    }
    public static void main(String[] args) 
    {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try 
            {
                pc.produce();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try 
            {
                pc.consume();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
