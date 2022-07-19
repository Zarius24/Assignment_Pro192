/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2.ans;
/**
 *
 * @author HE170417
 */
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your crush Name: ");
        String crushName = sc.nextLine();
        System.out.print("Enter age: ");
        int crushAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter gender: ");
        String crushGen = sc.nextLine();
        System.out.println("1. toString()");
        System.out.println("2. isLegal()");
        System.out.println("3. specName()");
        System.out.print("Enter TC (1,2,3): ");
        int tc = sc.nextInt();
        sc.nextLine();
        System.out.println("OUTPUT:");
        switch (tc) {
            case 1:
                Crush a11 = new Crush(crushName, crushAge);
                System.out.println(a11.toString());
                MyCrush a12 = new MyCrush(crushName, crushAge, crushGen);
                System.out.println(a12.toString());
                break;
            case 2:
                MyCrush b2 = new MyCrush(crushName, crushAge, crushGen);
                System.out.println(b2.isLegal());
                break;
            case 3:
                MyCrush b3 = new MyCrush(crushName, crushAge, crushGen);
                System.out.println(b3.specName(b3.getName()));
        }

        System.out.println();
    }
}
