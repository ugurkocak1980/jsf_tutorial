/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ukocak.jee6.greeting;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author UKO
 */
@ManagedBean
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
