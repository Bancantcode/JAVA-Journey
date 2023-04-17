public class ImplementStack 
{
    private int[] array;
    private int top;
    private int size;
    
    public ImplementStack(int size) 
    {
        this.array = new int[size];
        this.top = -1;
        this.size = size;
    }
    
    public void push(int value) 
    {
        if (top == size - 1) 
        {
            System.out.println("Stack is full.");
        } 
        else 
        {
            top++;
            array[top] = value;
        }
    }
    
    public int pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is empty.");
            return -1;
        } 
        else 
        {
            int value = array[top];
            top--;
            return value;
        }
    }
    
    public int peek() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is empty.");
            return -1;
        } 
        else 
        {
            return array[top];
        }
    }
}
