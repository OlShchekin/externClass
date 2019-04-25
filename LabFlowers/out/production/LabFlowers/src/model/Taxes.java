package model;

import entities.Tax;

import java.util.Arrays;


public class Taxes<T> {
    private Tax[] taxes;

    public void setTaxes(Tax[] taxes) {
        this.taxes = taxes;
    }

    public Tax[] getTaxes() {
        return taxes;
    }

    public double getTotalTaxes() {
        double totalTaxes = 0;
        for (int i = 0; i < taxes.length; i++) {
            totalTaxes += taxes[i].getTaxResultValue();
        }
        return totalTaxes;
    }


    public Tax[] sortTaxesInDesc() {
        Tax[] temp = TaxesCreater.getTaxes();
        Arrays.sort(temp, new TaxComparator<Tax>());
        return temp;
    }
}
