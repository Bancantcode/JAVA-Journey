public class WhileReverseNum 
{
    public static void main(String[] args) 
    {
        int num = 1234;
        int reverseNum = 0;
        while(num != 0)
        {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse of "+num+" is: "+reverseNum);
    }    
}
