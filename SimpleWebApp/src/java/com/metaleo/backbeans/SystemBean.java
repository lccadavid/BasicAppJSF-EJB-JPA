
package com.metaleo.backbeans;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lcardozo
 */
@ManagedBean(name = "systemBean")
@RequestScoped
public class SystemBean {
    
    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(new Date());
        
    }

}
