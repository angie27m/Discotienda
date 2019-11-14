/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.discotienda.controlador;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author angie
 */
@Named(value = "login")
@SessionScoped

public class Login implements Serializable {
    
    private String nombre;
    private String contrasena;
    /**
     * Creates a new instance of login
     */
    public Login() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public void iniciarSesion(){
        
    }
    
}