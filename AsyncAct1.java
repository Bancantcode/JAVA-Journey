import java.util.Scanner;
public class AsyncAct1
{
	public static void main(String[] args)
	{
		int a, b, c, d; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Prelim: ");
		a = scan.nextInt();		
		System.out.print("Midterm: ");
		b = scan.nextInt();		
		System.out.print("Pre Final: ");	
		c = scan.nextInt();
		System.out.print("Finals: ");
		d = scan.nextInt();
		double total;
		total = (a*.20) + (b*.20) + (c*.20) + (d*.40);

		if (total > 95) {
		System.out.println("Outstanding"); }
		else if (total >= 91 && total < 96) {
		System.out.println("Excellent"); }
		else if (total >= 86 && total < 91) {
		System.out.println("Very Satisfying"); }
		else if (total >= 81 && total < 86) {
		System.out.println("Satisfying"); }
		else if (total >= 76 && total < 81) {
		System.out.println("Good"); } 
		else {
		System.out.println("Needs Improvement"); 
		}	
	}
}

//Santiago, Bryan Aaron B. | ICT-101