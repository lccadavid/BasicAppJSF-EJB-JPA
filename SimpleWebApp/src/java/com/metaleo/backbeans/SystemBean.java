
package com.metaleo.backbeans;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lcardozo
 */
@ManagedBean(name = "systemBean")
@RequestScoped
public class SystemBean {
    
    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        
        /*HttpSession ref=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        
        ref.invalidate();*/
        

        
        
        return dateFormat.format(new Date());
        
    }

}
