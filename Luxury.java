public class Luxury extends CarRental 
{
    protected double chauffeur = 11754;
    protected Luxury(String name, int zp, int size, int day)
    {
        super(name, zp, size, day);
        rFree = 4621.02;
        ttlRental = (rFree+chauffeur)*days;
        CS = "Luxury Car";
    }    
    protected void display()
    {
        super.display();
        System.out.println("Chauffeur Fee\t\t: Php\t"+df.format(chauffeur*days));
    }
}
