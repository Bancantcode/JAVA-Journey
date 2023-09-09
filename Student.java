public class Student 
{
    private String studNum;
    private String name;
    private int[] grades;

    Student(String studNum, String name, int[] grades)
    {
        this.studNum = studNum;
        this.name = name;
        this.grades = grades;
    }
    public String getStudNum()
    {
        return studNum;
    }
    public String getName()
    {
        return name;
    }
    public double calculate()
    {
        int sum = 0;
        for(int grade:grades)
        {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    public void display()
    {
        System.out.println("Student Number: " + getStudNum());
        System.out.println("Name: " + getName());
        System.out.println("Average Grade: " + calculate());
    }
}



