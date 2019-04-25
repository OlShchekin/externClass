package com.epam.task3;

public class Sum {
    public static void main(String[] args) {
        int sq[] = new int[50];
        for (int i = 0; i < 50; i++) {
            sq[i] = i;
            System.out.println(sq[i]);

            int x = 1;
            for(int zz : sq[50] ) {
                x = x >> zz;
                System.out.println(x);
            }
        }
    }
}