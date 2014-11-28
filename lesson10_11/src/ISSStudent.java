/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evan5090
 */
public class ISSStudent implements Comparable {
    private String name;
    private String address;
    private int id;
    
    public ISSStudent(String n, String a, int i){
        name=n;
        address=a;
        id=i;
    }
    
    public int getid(){
        return id;
    }
    
    public String toString(){
        String str="Name:\t"+name;
        str+="\nAddress:\t"+address;
        str+="\nID number:\t"+id;
        return str;
    }
    
    public int compareTo(Object o) {
        int difference=id-((ISSStudent)o).getid();
        return difference;
    }
    
}
