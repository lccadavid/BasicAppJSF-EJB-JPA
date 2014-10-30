/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metaleo.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author lcardozo
 */
@Stateless
public class Libro {
    
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
