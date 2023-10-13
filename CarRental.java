import java.text.DecimalFormat;

class CarRental 
{
    protected String rName;
    protected int zip;
    protected int cSize;
    protected double rFree;
    protected int days;
    protected double ttlRental;
    protected String CS;

    DecimalFormat df = new DecimalFormat("#,##0.00");
    protected CarRental(String name, int zp, int size, int day)
    {
        rName = name;
        zip = zp;
        cSize = size;
        days = day;
        if (cSize == 1)
        {
            rFree = 1702.53;
            CS = "Economy";
        }
        else if (cSize == 2)
        {
            rFree = 2213.46;
            CS = "MidSize";
        }
        else if (cSize == 3)
        {
            rFree = 2469.50;
            CS = "FullSize";
        }
        ttlRental = rFree * days; //Compute
    }
    protected void display()
    {
        System.out.println("Renter's Name\t\t:\t"+rName);
        System.out.println("Renter's Zipcode\t:\t"+zip);
        System.out.println("Car Size\t\t:\t"+CS);
        System.out.println("Daily rental Fee\t: Php\t"+df.format(rFree));
        System.out.println("No of days rented\t:\t"+days);
        System.out.println("Total Amount Due\t: Php\t"+df.format(ttlRental));
    }

}