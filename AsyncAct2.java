import java.util.Scanner;
public class AsyncAct2
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
		double total = 0;	
		total = (a*.20) + (b*.20) + (c*.20) + (d*.40);

		switch((int)total) {
		case 100, 99, 98, 97, 96:
		System.out.println("Outstanding");
		break;
		case 95, 94, 93, 92, 91:
		System.out.println("Excellent");
		break;
		case 90, 89, 88, 87, 86:
		System.out.println("Very Satisfying");
		break;
		case 85, 84, 83, 82, 81:
		System.out.println("Satisfying");
		break;
		case 80, 79, 78, 77, 76:
		System.out.println("Good");
		break;
		default:
		System.out.println("Needs Improvement");
		}
	}
}

//Santiago, Bryan Aaron B. | ICT-101