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
public class MyCrush extends Crush {
    protected String gender;

    public MyCrush() {
    }

    public MyCrush(String gender) {
        this.gender = gender;
    }

    public MyCrush(String name, int age,String gender) {
        super(name, age);
        this.gender = gender;
    }
    
    public boolean isLegal(){
        return age >= 18;
    }

    @Override
    public String toString() {
        return name+", "+age+", "+gender;
    }
    
    public String specName(String str){
        String [] tk = str.split("[\\s+]");
        String result, ten="";
        int counter = 0;
        int i;
        if(tk.length ==1 ){
            return "Ten: "+ tk[0];
        }
        else{
            result = "Ho:"+tk[0];
            for(i =1; i<tk.length;i++){
                ten += tk[i]+ " ";
            }
            return result + "||Ten:"+ten;
        }
        
    }
    
    
}
