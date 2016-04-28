/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.service;

import com.ipn.app.bean.UsuarioBean;

/**
 *
 * @author dml
 */
public interface UsuarioService 
{
    public void addCustomer();
    
    public void agregarUsuario( UsuarioBean usuario );
    
    public String agregarUsuarioReturnValue(UsuarioBean usuario);
    
    void agregarUsuarioThrowException(UsuarioBean usuario) throws Exception;
            
    void agregarUsuarioAround(UsuarioBean usuario);
}
