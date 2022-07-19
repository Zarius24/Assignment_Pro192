/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3.ans;

/**
 *
 * @author ASUS
 */
public class Student {
    public String name, course;
    public int code;

    public Student() {
    }

    public Student(String name, int code, String course) {
        this.name = name;
        this.course = course;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return name + " " + code + " " + course;
    }
    
    
}
