package com.epam.task33;

public class First {
    int a=1;
    public int number;
    public int price;
    String name;

    public First(){

    }

    public First(int a, int number, int price, String name) {
        this.a = a;
        this.number = number;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "First{" +
                "a=" + a +
                ", number=" + number +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
    public int countSum(int price, int number){
        int quantitySum = price*number;
        return quantitySum;
    }

    public String getName() {
        return name;
    }
}
