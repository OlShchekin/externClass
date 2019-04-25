package model;

import entities.Tax;

import java.util.Comparator;


public class TaxComparator<T> implements Comparator<T> {


    @Override
    public int compare(Object o1, Object o2) {
        Double taxValue1 = ((Tax) o1).getTaxResultValue();
        Double taxValue2 = ((Tax) o2).getTaxResultValue();
        return taxValue2.compareTo(taxValue1);
    }
}
