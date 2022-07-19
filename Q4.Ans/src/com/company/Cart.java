package com.company;

import java.util.List;
import java.util.Scanner;

public class Cart implements IMilk {
    Scanner sc = new Scanner(System.in);

    @Override
    public void f1(List<Milk> t, int n) {
//        for (int i = t.size() - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//
//            }
//        }
        int i = 0;
        while (i < n) {
            Milk e = new Milk();
            System.out.print("Enter product: ");
            e.product = sc.nextLine();
            System.out.print("Enter price: ");
            e.price = sc.nextDouble();
            t.add(e);
            sc.nextLine();
            i++;
        }
//        System.out.println("Added successfully!");
    }

    @Override
    public String f2(List<Milk> t) {
        double mostExpensive = t.get(0).getPrice();
        int j;
        Milk expObj = new Milk();
        for (j = 1; j < t.size(); j++) {
            double temp = t.get(j).getPrice();

            if (temp > mostExpensive) {
                mostExpensive = temp;
                expObj = t.get(j);
            }
        }
//        expObj = t.get(k);
        return expObj.toString();
    }
}
