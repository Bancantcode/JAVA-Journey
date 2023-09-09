//Santiago, Bryan Aaron B. | WD-202

import java.text.DecimalFormat;
import java.util.Scanner;

class Pay
{
    public static double rate(int rate) 
    {
        double rph = 0;
        switch (rate) 
        {
            case 1:
                rph = 300;
                break;
            case 2:
                rph = 400;
                break;
            case 3:
                rph = 500;
                break;
            default:
                rph = 0;
        }
        return rph;
    }

    public static double withholdingTax(double totalGrossPay) 
    {
        double tax = 0;
        double annualGrossPay = totalGrossPay * 12;

        if (annualGrossPay < 250000) 
        {
            tax = 0;
        } 
        else if (annualGrossPay <= 400000) 
        {
            tax = (0.20 * annualGrossPay) / 12;
        } 
        else if (annualGrossPay <= 800000) 
        {
            tax = (30000 + 0.25 * (annualGrossPay - 400000)) / 12;
        } 
        else if (annualGrossPay <= 2000000) 
        {
            tax = (130000 + 0.30 * (annualGrossPay - 800000)) / 12;
        } 
        else if (annualGrossPay <= 8000000) 
        {
            tax = (490000 + 0.32 * (annualGrossPay - 2000000)) / 12;
        } 
        else if (annualGrossPay > 8000000) 
        {
            tax = (2041000 + 0.35 * (annualGrossPay - 8000000)) / 12;
        }
        return tax;
    }

    public static double socialSecurity(double totalGrossPay) 
    {
        return totalGrossPay * 0.0275;
    }

    public static double pagIbigContri(double totalGrossPay) 
    {
        return totalGrossPay * 0.01;
    }

    public static double philHealthContri(double totalGrossPay) 
    {
        return totalGrossPay * 0.0275;
    }

    public static double totalDeduction(double totalGrossPay) 
    {
        double tax = withholdingTax(totalGrossPay);
        double sss = socialSecurity(totalGrossPay);
        double pagIbig = pagIbigContri(totalGrossPay);
        double philHealth = philHealthContri(totalGrossPay);

        return tax + sss + pagIbig + philHealth;
    }

    public static double netPay(double totalGrossPay) 
    {
        return totalGrossPay - totalDeduction(totalGrossPay);
    }

    public static void display(double regGrossPay, double overtime, double totalGrosspay, int rph, double withholdingTaxAmount, double socialSecurityAmount, double pagIbigAmount, double philHealthAmount, double totalDeductionAmount, double netPayAmount) 
    {
        DecimalFormat currencyFormatter = new DecimalFormat("#,##0.00");

        System.out.println("Regular Gross pay: " + currencyFormatter.format(regGrossPay));
        System.out.println("Overtime Gross pay: " + currencyFormatter.format(overtime));
        System.out.println("Total Gross pay: " + currencyFormatter.format(totalGrosspay));
        System.out.println("Skill level: " + rph);
        System.out.println("Skill rate: " + currencyFormatter.format(rate(rph)));

        System.out.println("**DEDUCTION**");
        System.out.println("Withholding Tax: Php " + currencyFormatter.format(withholdingTaxAmount));
        System.out.println("Social Security: Php " + currencyFormatter.format(socialSecurityAmount));
        System.out.println("Pag-ibig Contri: Php " + currencyFormatter.format(pagIbigAmount));
        System.out.println("Philhealth Contri: Php " + currencyFormatter.format(philHealthAmount));
        System.out.println("Total Deduction: Php " + currencyFormatter.format(totalDeductionAmount));
        System.out.println("Net Pay: Php " + currencyFormatter.format(netPayAmount));
    }
    public static void main(String[] args) 
    {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        double regGrossPay = 0;
        double overtime = 0;
        double totalGrosspay = 0;

        // Skill level
        System.out.println("Skill level");
        System.out.println("[1]     Php     300.00 per hour");
        System.out.println("[2]     Php     400.00 per hour");
        System.out.println("[3]     Php     500.00 per hour");

        // Skill level input
        System.out.print("Enter the skill level: ");
        int rph = Integer.parseInt(input.nextLine());
        double rateOut = rate(rph);
        // Hours work input
        System.out.print("Enter hour's work: ");
        double hrsWorked = Double.parseDouble(input.nextLine());
        if (hrsWorked > 40) 
        {
            regGrossPay = (40 * rateOut);
            overtime = (hrsWorked - 40) * rate(rph) * 1.5;
        } 
        else if (hrsWorked < 40) 
        {
            regGrossPay = (hrsWorked * rateOut);
            overtime = 0;
        }
        totalGrosspay = regGrossPay + overtime;

        double withholdingTaxAmount = withholdingTax(totalGrosspay);
        double socialSecurityAmount = socialSecurity(totalGrosspay);
        double pagIbigAmount = pagIbigContri(totalGrosspay);
        double philHealthAmount = philHealthContri(totalGrosspay);
        double totalDeductionAmount = totalDeduction(totalGrosspay);
        double netPayAmount = netPay(totalGrosspay);

        display(regGrossPay, overtime, totalGrosspay, rph, withholdingTaxAmount, socialSecurityAmount, pagIbigAmount, philHealthAmount, totalDeductionAmount, netPayAmount);
    }
}
