import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //Scanner is set, allowing us to store user inputs into variables
        //User input for bill stored into a double
        Scanner AUGH = new Scanner(System.in);

        System.out.println("How much is the tip percentage as a decimal?");
        double tip = AUGH.nextDouble();
        System.out.println("What is the party size");
        int party = AUGH.nextInt();
        System.out.println("How much is the total bill");
        double totalBill = AUGH.nextDouble();

        tipCalc he = new tipCalc(party, tip);
        he.addMeal(totalBill);
        he.tipAmount();
        he.totalBill();
        he.perPersonCostBeforeTip();
        he.perPersonTipAmount();
        he.perPersonTotalCost();
        System.out.println("The total bill before tip is " + he.getTotalBillBeforeTip());
        System.out.println("Your tip percentage as a decimal is " + he.getTipPercentage());
        System.out.println("The total tip amount is " + he.tipAmount());
        System.out.println("The total cost of the bill is " + he.totalBill());
        System.out.println("The total tip each person has to pay is" );








        System.out.println(he.getTotalBillBeforeTip());






    }
}