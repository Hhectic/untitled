public class tipCalc {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBT;

    public tipCalc(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBT = 0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBT;
    }
    public double getTipPercentage(){
        return tipPercentage;
    }
    public void addMeal(double cost){
        totalBillBT = cost + totalBillBT;
    }
    public double tipAmount(){
        return totalBillBT*tipPercentage;
    }
    public double totalBill(){
        return  totalBillBT + tipAmount();
    }
    public double perPersonCostBeforeTip(){
        return totalBillBT/numPeople;
    }
    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }
    public double perPersonTotalCost(){
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }
}
