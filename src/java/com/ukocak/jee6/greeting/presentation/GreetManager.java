    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ukocak.jee6.greeting.presentation;

import javax.faces.bean.ManagedBean;
import org.jboss.logging.Logger;

/**
 *
 * @author UKO
 */
@ManagedBean(name = "manager")
public class GreetManager {
    
    public String greet() {
        //...
        Logger.getLogger(GreetManager.class.getName()).log(Logger.Level.INFO, "### manager wurde gerufen");
        return "greet";
    }
}
