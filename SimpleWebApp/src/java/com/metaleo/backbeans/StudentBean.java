
package com.metaleo.backbeans;

import com.metaleo.ejb.Libro;
import com.metaleo.ejb.StudentEJBLocal;
import com.metaleo.jpa.Student;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    
    @Inject
    private Libro libro;

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
    
    
    public String bajarExcel(){
        System.out.println("Entro!");
        FacesContext context = FacesContext.getCurrentInstance();    
        try {    

             HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();  
             HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();  
             RequestDispatcher dispatcher = request.getRequestDispatcher("/DownloadExcel");  
             dispatcher.forward(request, response);  


        }catch (Exception e) {    
           e.printStackTrace();    
        }    
        finally{    
           context.responseComplete();    
        }   
        return "";
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
