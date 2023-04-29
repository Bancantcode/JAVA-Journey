public class WhileFibonacciSeries 
{
    public static void main(String[] args) 
    {
        int n = 10;
        int prevNum = 0;
        int nextNum = 1;
        System.out.print(prevNum+" "+nextNum+" ");
        while(nextNum <= n){
            int temp = prevNum + nextNum;
            System.out.print(temp+" ");
            prevNum = nextNum;
            nextNum = temp;
        }
    }    
}
