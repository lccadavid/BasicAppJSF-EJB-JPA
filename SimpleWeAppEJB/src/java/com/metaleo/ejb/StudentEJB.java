
package com.metaleo.ejb;

import com.metaleo.jpa.Student;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lcardozo
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class StudentEJB implements StudentEJBLocal {


    @Override
    public void save(final Student s) {
        
        System.out.println("Saving student named " + s.getName());
    }
    
}
