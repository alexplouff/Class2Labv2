package model;

import java.util.Calendar;
import java.util.GregorianCalendar;




public class WelcomeClass {
    
    private final int hourOfDay;
    private String welcomeMessage;
    private String name;
    
    public WelcomeClass(String name){
         hourOfDay = Calendar.HOUR_OF_DAY;
         setWelcomeMessage();
         setName(name);
    }
    
    public final void setWelcomeMessage(){
        if(hourOfDay < 12){
            welcomeMessage = "Good Morning ";
        } else if (hourOfDay <18){
            welcomeMessage = "Good Evening ";
        } else {
            welcomeMessage = "Good Night ";
        }
        
    }
    
    public String getWelcomeMessage(){
        return welcomeMessage;
    }
    
    public final void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return welcomeMessage + name;
    }
}
