package Animal;
import java.awt.*;
import java.util.Scanner;
public class Superanimal extends Animal{
  
  private boolean wings;
  private boolean canTeleport;
  
  public Superanimal (String defaultName, String defaultColour, boolean defaultSkin, boolean defaultLegs, boolean defaultEyes, boolean defaultEars,boolean wings, boolean teleport){
    
    super(defaultName,defaultColour,defaultSkin,defaultLegs,defaultEyes,defaultEars);
    this.wings = wings; //"this" is global, default is local, class limian zhengzaiyong 
    canTeleport = teleport; //different names, no care 
    
    
  }
  
  public String fly(){
    if (wings==true){
      return(getName()+" can fly:");
    }
    else{
      return(getName()+ " cannot fly.");
      
    }
    
  }
  
  public String teleport(String place){
    
    if(canTeleport ==true){
      return(getName()+" can teleport to " + place);
    }
    else {
      return(getName()+" cannot teleport");
    }
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
}