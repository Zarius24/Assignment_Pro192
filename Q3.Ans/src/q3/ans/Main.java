/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3.ans;

/**
 *
 * @author HE170417
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void OutputList(List<Student> t) {
        Iterator var1 = t.iterator();

        while(var1.hasNext()) {
            Student x = (Student)var1.next();
            System.out.printf("%s %d %s\r\n", x.getName(), x.getCode(),x.getCourse());
        }

    }

    public static void OutputListFile(List<Fan> t, PrintWriter q) {
        Iterator var2 = t.iterator();

        while(var2.hasNext()) {
            Student x = (Student)var2.next();
            q.printf("%s %d %s\r\n", x.getName(), x.getCode(),x.getCourse());
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Student> t = new ArrayList();
        List<Student> h = new ArrayList();
        System.out.print("Add how many students: ");
        int n = sc.nextInt();
        sc.nextLine();
        int xCode = 0;
        String xName = "";
        String xCourse = null;

        int tc;
        for(tc = 0; tc < n; ++tc) {
            System.out.print("Enter student name: ");
            xName = sc.nextLine();
            System.out.print("Enter student Code: ");
            xCode = sc.nextInt();
            System.out.println("Enter student course: ");
            xCourse = sc.nextLine();
            sc.nextLine();
            t.add(new Student(xName, xCode,xCourse));
            h.add(new Student(xName, xCode,xCourse));
        }

        System.out.print("Enter TC(1-f1;2-f2;3-f3): ");
        tc = sc.nextInt();
        sc.nextLine();
        IStudent u = new FptStudent();
        String givenCourse = "";
        int givenCode = 0;
        t.add(0, new Student("An", 135, "PRO192"));
        t.add(1, new Student("Truong", 216, "PRO192"));
        t.add(2, new Student("Manh", 246, "PRO192"));
        t.add(3, new Student("Toan", 101, "MAD101"));
        System.out.println("The list before running f1:");
        OutputList(t);
        switch (tc) {
            case 1:
                System.out.print("Enter xCode: ");
                givenCode = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter Course:");
                givenCourse = sc.nextLine();
                break;
            case 3:
                System.out.println("Enter xCode: ");
                givenCode = sc.nextInt();
                break;
        }

        System.out.println();
        System.out.printf("OUTPUT:\r\n");
        switch (tc) {
            case 1:
                u.f1(t, givenCode);
                OutputList(t);
                break;
            case 2:
                int count = u.f2(t, givenCourse);
                OutputList(t);
                System.out.printf("%d\r\n", count);
                break;
            case 3:
                u.f3(t,givenCode);
                OutputList(t);
        }

        System.out.println();
    }
}
