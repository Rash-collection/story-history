/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package core;

/**
 * <p>Any and every entity has an ID or code-name.</p>
 * @author rash4
 * @param <T> the type of subclasses.
 */
public abstract class Entity <T extends Entity<T>> implements Comparable<Entity<T>>{
    private static int charx = 0;
    protected final String codeName;
    public Entity(){
        this.codeName = String.format("CN[%d]", ++charx); // tempo.
    }
    public Entity(String codeName){
        this.codeName = codeName; // tempo.
    }
    public abstract String getName();
    public String getCodeName(){return this.codeName;}
    /**
     * BEWARE
     * @param o
     * @return 
     */
    @Override public int compareTo(Entity<T> o) {
        if (o == null || this.getClass() != o.getClass())
            throw new errxs.NotSameClassException();
        return this.codeName.compareTo(o.codeName);
    }
}