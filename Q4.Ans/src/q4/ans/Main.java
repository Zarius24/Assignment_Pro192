/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4.ans;

/**
 *
 * @author HE170417
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        List<Milk> t = new ArrayList();
        List<Milk> h = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Add how many items: ");
        int n = sc.nextInt();
        sc.nextLine();
        double price = 0;
        String type = "";
        

        int tc;
        for(tc = 0; tc < n; ++tc) {
            System.out.println("item "+tc+"field");
            System.out.print("Enter item type: ");
            type = sc.nextLine();
            System.out.print("Enter item price: ");
            price = sc.nextDouble();
            sc.nextLine();
            t.add(new Milk(type, price));
            h.add(new Milk(type, price));
        }
        
        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        tc = sc.nextInt();
        sc.nextLine();
        IMilk u = new Cart();
        System.out.println("OUTPUT:");
        switch (tc) {
            case 1:
                u.f1(t);
                System.out.printf("\r\n");
                break;
            case 2:
                u.f2(t);
                System.out.printf("\r\n");
                break;
            default:
                return;
        }

        System.out.println();
    }
}

