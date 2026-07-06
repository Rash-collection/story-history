/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package core;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>Any and every 'Entity' has a UID or code-name.</p>
 * @author rash4
 * @param <T> the type of Entity-subclasses.
 */
public abstract class Entity <T extends Entity<T>> implements Comparable<Entity<T>>{
    private static final AtomicLong counter = new AtomicLong();
    protected final long value; // is absolute and unique
    public Entity(){
        this.value = next(); // tempo
    }
    public Entity(long uid){ // for handlers
        this.value = uid;
    }
    public abstract String getName();
    public long getID(){return this.value;}
    @Override public int compareTo(Entity<T> o) {
        return Long.compare(this.value, o.value);
    }
    @Override public int hashCode(){
        return Long.hashCode(this.value);
    }
    @Override public boolean equals(Object o){
        return   o != null &&   // early skip
                (this == o ||   // fast ref check
                                // the real check
                (o instanceof Entity e && e.value == this.value));
    }
    /**
     * <p>incremented long-integer.</p>
     * @return 
     */
    protected static long next() {
        return counter.incrementAndGet();
    }
}