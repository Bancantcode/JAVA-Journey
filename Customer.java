//Santiago, Bryan Aaron B. | WD-202

class Customer 
{
    private int customerNumber;
    private String customerName;
    private String customerAddress;
    private String itemDescription;
    private double itemPrice;
    private int quantity;
    private int modeOfPayment;

    public Customer(int customerNumber, String customerName, String customerAddress, String itemDescription, double itemPrice, int quantity, int modeOfPayment) 
    {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.modeOfPayment = modeOfPayment;
    }

    //Setters
    public void setCustomerNumber(int customerNumber) 
    {
        this.customerNumber = customerNumber;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) 
    {
        this.customerAddress = customerAddress;
    }

    public void setItemDescription(String itemDescription) 
    {
        this.itemDescription = itemDescription;
    }

    public void setItemPrice(double itemPrice) 
    {
        this.itemPrice = itemPrice;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public void setModeOfPayment(int modeOfPayment) 
    {
        this.modeOfPayment = modeOfPayment;
    }

    //Getters
    public int getCustomerNumber() 
    {
        return customerNumber;
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public String getCustomerAddress() 
    {
        return customerAddress;
    }

    public String getItemDescription() 
    {
        return itemDescription;
    }

    public double getItemPrice() 
    {
        return itemPrice;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public int getModeOfPayment() 
    {
        return modeOfPayment;
    }

    public double compute() 
    {
        return quantity * itemPrice;
    }

    public double NET() 
    {
        double totalItemPurchased = compute();
        switch (modeOfPayment) 
        {
            case 1:
                return totalItemPurchased - (totalItemPurchased * 0.05);
            case 2:
                return totalItemPurchased + (totalItemPurchased * 0.05);
            case 3:
                return totalItemPurchased + (totalItemPurchased * 0.1);
            default:
                throw new IllegalArgumentException("Invalid Mode Of Payment.");
        }
    }

    public void display()
    {
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Item Description: " + itemDescription);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Mode of Payment: " + modeOfPayment);
        System.out.println("Total Item Purchased: " + compute());
        System.out.println("Net Total Item Purchased: " + NET());
    }
}
