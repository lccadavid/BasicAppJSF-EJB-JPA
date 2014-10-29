
package com.metaleo.ejb;

import com.metaleo.jpa.Student;
import javax.ejb.Stateless;

/**
 *
 * @author lcardozo
 */
@Stateless
public class StudentEJB implements StudentEJBLocal {

    @Override
    public void save(final Student s) {
        System.out.println("Saving student named " + s.getName());
    }
    
}
