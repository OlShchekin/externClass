package model;

import entities.DeclaretionFiller;
import entities.Tax;

import java.util.Map;


public class TaxesCreater<T> {


    public static Tax[] getTaxes() {
        Tax[] taxes = new Tax[DeclaretionFiller.getDeclaration().size()];
        int count = 0;
        if (taxes != null ) {
            for (Map.Entry<String, Integer> incomePoint : DeclaretionFiller.getDeclaration().entrySet()) {
                String taxName = "Tax of " + incomePoint.getKey();
                int incomValue = incomePoint.getValue();
                taxes[count] = new Tax(count+1001 ,taxName, incomValue, 0.18);
                count++;
            }
        }
        return taxes;
    }

}
