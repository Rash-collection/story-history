/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package core;

/**
 * <p>For starter just flat names -aka-> wrapped string.</p>
 * @author rash4
 */
public class Name implements Comparable<Name>{
    protected final String name;
//    protected final long span; // metadata (creted since.. story date)
    
    public Name(String name){
        this.name = name;
    }
    public String getName(){return this.name;}
    @Override public boolean equals(Object o){
        if(o == null || !(o instanceof Name otherName))
            return false;
        return this.name.equalsIgnoreCase(otherName.name);
    }
    @Override public int compareTo(Name o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}