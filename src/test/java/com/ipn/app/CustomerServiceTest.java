/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.app;

import com.ipn.app.bean.UsuarioBean;
import com.ipn.app.service.UsuarioService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dml
 */
public class CustomerServiceTest 
{
    protected final Log logger = LogFactory.getLog(getClass());
    
    private ApplicationContext ctx;
    
     @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("spring-customer.xml");
         Assert.assertNotNull(ctx );
        logger.debug("Inicio de la prueba unitaria");
    }
    
    @Test
    public void testUserProxy(){
        UsuarioBean userBean = (UsuarioBean) ctx.getBean("userBean");
        UsuarioService userService = (UsuarioService) ctx.getBean("userService");
        
        userService.addCustomer();
        
        System.out.println("\n****************************************\n");
        
        userService.agregarUsuarioReturnValue(userBean);
        
        System.out.println("\n****************************************\n");
        
        userService.agregarUsuarioAround(userBean);
        
        try {
            System.out.println("\n****************************************\n");
            userService.agregarUsuarioThrowException(userBean);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
}
