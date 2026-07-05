/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package errxs;

/**
 *
 * @author rash4
 */
public class NotSameClassException extends RuntimeException{
    public NotSameClassException(){
        super("Different classes type exception.");
    }
    public NotSameClassException(String msg){
        super(msg);
    }
}