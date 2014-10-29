
package com.metaleo.backbeans;

import com.metaleo.ejb.StudentEJBLocal;
import com.metaleo.jpa.Student;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lcardozo
 */
@ManagedBean(name = "studentBean")
@RequestScoped
public class StudentBean {
    
    private String name;
    private String edad;
    private List<String> sport;
    
    @EJB
    private StudentEJBLocal studentEJB;

    public StudentBean() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setSport(List<String> sport) {
        this.sport = sport;
    }

    public List<String> getSport() {
        return sport;
    }
    
    public String validarEstudiante() {
        System.out.println("Submiting..");
        
        Student s = new Student();
        s.setName(getName());
        s.setAge(new Integer(getEdad()));
        s.setSport(new Integer(getSport().get(0)));
        
        studentEJB.save(s);
        
        return "welcome";
    }
    
    
    
}
