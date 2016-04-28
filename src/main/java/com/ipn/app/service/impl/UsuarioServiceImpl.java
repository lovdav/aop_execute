/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app.service.impl;

import com.ipn.app.bean.UsuarioBean;
import com.ipn.app.service.UsuarioService;

/**
 *
 * @author dml
 */
public class UsuarioServiceImpl implements UsuarioService
{
    
    public void addCustomer(){
        System.out.println("addCustomer() is running ");
    }
    
    public void agregarUsuario(UsuarioBean usuario) {
        System.out.println("Usuario agregado: " + usuario.getNombre() + " " + usuario.getApPaterno() + " " + usuario.getApMaterno());
    }

    public String agregarUsuarioReturnValue(UsuarioBean usuario) {
        System.out.println("Usuario agregado: " + usuario.getNombre() + " " + usuario.getApPaterno() + " " + usuario.getApMaterno());
        return "10";
    }

    public void agregarUsuarioThrowException(UsuarioBean usuario) throws Exception {
        System.out.println("Usuario agregado: " + usuario.getNombre() + " " + usuario.getApPaterno() + " " + usuario.getApMaterno());
        throw new Exception("Generic Error");
    }

    public void agregarUsuarioAround(UsuarioBean usuario) {
        System.out.println("Usuario agregado: " + usuario.getNombre() + " " + usuario.getApPaterno() + " " + usuario.getApMaterno());
    }
    
}
