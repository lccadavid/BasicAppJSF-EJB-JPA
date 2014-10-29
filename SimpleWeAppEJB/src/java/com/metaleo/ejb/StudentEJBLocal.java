/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metaleo.ejb;

import com.metaleo.jpa.Student;
import javax.ejb.Local;

/**
 *
 * @author lcardozo
 */
@Local
public interface StudentEJBLocal {
    

    public void save(Student s);
    
}
