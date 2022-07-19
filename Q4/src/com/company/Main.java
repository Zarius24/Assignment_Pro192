package com.company;

import java.nio.channels.MulticastChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        IMilk c = new Cart();
        List<Milk> t = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        int tc = sc.nextInt();
        sc.nextLine();

        System.out.println("\nOUTPUT:");
        switch (tc) {
            case 1:
                int n;
                System.out.print("Enter number of products: ");
                n = sc.nextInt();
                c.f1(t, n);
                System.out.println("==============");
                System.out.println("Product list: ");
                display(t);
                break;
            case 2:
                t.add(0, new Milk("Milk", 12));
                t.add(1, new Milk("Cheese", 15));
                t.add(2, new Milk("Bread", 5));
                t.add(3, new Milk("Ham", 20));
                t.add(4, new Milk("Butter", 10));
                System.out.println(c.f2(t));
                break;
        }
    }

    public static void display(List<Milk> t) {
        for(int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i).toString());
        }
    }
}
