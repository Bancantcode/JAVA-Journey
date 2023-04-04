public class CatMidterm {

    private String name; 
    private int age;
    private String breed;
    private String color;

    public CatMidterm(String name, String breed, int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    //GETTERS
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    //SETTERS
    public String getName() 
    {
        return name;
    }
    public String getBreed() 
    {
        return breed;
    }
    public int getAge() 
    {
        return age;
    }
    public String getColor() 
    {
        return color;
    }

    public static void main(String[] args)
    {
        CatMidterm Fluffy = new CatMidterm("Fluffy", "Ragamuffin", 3, "Lilac");
        System.out.println("Hi! My name is " + Fluffy.getName());
        System.out.println("My breed is " + Fluffy.getBreed());
        System.out.println("I am " + Fluffy.getAge() + " years old and my color is "+ Fluffy.getColor());     
    }
}