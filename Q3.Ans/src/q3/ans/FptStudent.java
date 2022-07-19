/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3.ans;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class FptStudent implements IStudent {

    @Override
    public void f1(List<Student> t, int searchCode) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCode() == searchCode) {
//                System.out.println(t.get(i).getName() + " - " + t.get(i).getCourse());
                System.out.println(t.get(i).toString());
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    @Override
    public void f2(List<Student> t, String course) {
        List<Student> sameCourse = new ArrayList<>();
        for (int i = 0; i < t.size(); i++) {
            Student s = t.get(i);
            if (s.getCourse().compareTo(course) == 0) {
                sameCourse.add(s);
            }
        }
        for (int i = t.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int s1 = t.get(j).getCode();
                int s2 = t.get(j + 1).getCode();
                if (s1 < s2) {
                    Collections.swap(t, j, j + 1);
                }
            }
        }
        for(int i = 0; i < sameCourse.size(); i++) {
            System.out.println(sameCourse.get(i).toString());
        }
    }

    @Override
    public void f3(List<Student> t, int searchCode) {
//        List<Student> delStudent = new ArrayList<>();
        for (int i = 0; i < t.size(); i++) {
            Student s = t.get(i);
            if (s.getCode() == searchCode) {
                t.remove(s);
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

}
