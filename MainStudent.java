import java.util.Scanner;

public class MainStudent 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStud = input.nextInt();
        input.nextLine(); // Consume the newline character

        Student[] students = new Student[numOfStud];

        for (int i = 0; i < numOfStud; i++) 
        {
            String studNum;
            String name;

            // Student Number Validation
            do 
            {
                System.out.print("Student Number: ");
                studNum = input.nextLine();
                if (!(studNum.startsWith("2") && studNum.length() == 8)) 
                {
                    System.out.println("Please enter a whole number starting with 2 and having a length of 8 digits.");
                }
            } while (!(studNum.startsWith("2") && studNum.length() == 8));
            System.out.println("Valid Student No: " + studNum);

            // Student Name
            System.out.print("Student Name: ");
            name = input.nextLine();
            int[] array = new int[5];

            // Grade Input Loop
            for (int j = 0; j < 5; j++) 
            {
                int grade;
                do 
                {
                    System.out.print("Enter Grade: ");
                    grade = input.nextInt();
                    if (grade < 0) 
                    {
                        System.out.println("Please enter a non-negative grade.");
                    }
                } while (grade < 0);
                array[j] = grade;
            }
            input.nextLine(); // Consume the newline character

            students[i] = new Student(studNum, name, array);
        }

        for (int i = 0; i < numOfStud; i++) 
        {
            System.out.println("\nStudent " + (i + 1) + " Information:");
            students[i].display();
        }
    }
}
