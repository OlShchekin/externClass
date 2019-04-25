package entities;


public class Tax implements IncomePoints {

    private int taxCode;

    private String taxName;

    private int incomeValue;

    private double rates;

    private double taxResultValue;

        public Tax(int taxCode, String taxName, int incomeValue, double rates) {
        this.taxCode = taxCode;
        this.taxName = taxName;
        this.rates = rates;
        this.incomeValue = incomeValue;
        this.taxResultValue = getTaxResultValue();
    }

        public double getTaxResultValue() {
        return incomeValue * rates;
    }

    @Override
    public String toString() {
        return "|" + taxCode + "| " +
                taxName + "| "
                + incomeValue + "| "
                + rates + " | " +
                this.taxResultValue + " | ";
    }
}