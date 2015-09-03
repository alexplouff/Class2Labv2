/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alex
 */
public class WelcomeService {
    
    private WelcomeClass wCl;
    
    public WelcomeService(){
    }
    
    public void setWelcomeClass(WelcomeClass wCl){
        this.wCl = wCl;
    }
    
    public WelcomeClass getWelcomeClass(){
        return wCl;
    }
    
    public String getWelcomeMessage(String name){
        wCl = new WelcomeClass(name);
        return wCl.toString();
    }
}
