/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package annots;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author rash4
 */
@Retention(RetentionPolicy.SOURCE)
//@Target(ElementType.FIELD) // this comment for ref.
public @interface Tag {
    /**
     * <p>general default tagging.</p>
     * @return 
     */
    String value();
}