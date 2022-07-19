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
public class Crush {
    protected String name;
    protected int age;

    public Crush() {
    }

    public Crush(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+", "+age;
    }
    

    
}
