package Animal;
import java.awt.*; //
import java.util.Scanner;// scanner to get input

public class Animal{
  
  // Static class variable - Only use as a constant
  
  //use class variables (static - only if it is very necessary otherwise avoid it
  static Scanner myScanner = new Scanner(System.in);//declare scanner class as a static class variable
  
  static String ani = "cat";
  
  static double total=0; 
  
  //Characteristics/State - (Instance variables)
  private String colour;
  private String name;
  private boolean skin;
  private boolean legs;  
  private boolean eyes;
  private boolean ears;
  
  //Constructor method - has the same name as the class, has parameters that are passed
  public Animal(String defaultName, String defaultColour, boolean defaultSkin, boolean defaultLegs,boolean defaultEyes, boolean defaultEars) 
  { //This is the constructor
    name = defaultName;
    colour = defaultColour;
    skin = defaultSkin;
    legs = defaultLegs;
    eyes = defaultEyes;
    ears = defaultEars;
  }
  
  public Animal() 
  { //This is the constructor
    colour = "default";
    name = "default";
    skin = false;
    legs = false;
    eyes = false;
    ears = false;
  }
  
  public String getColour(){
    return colour;
  }
  public String getName(){
    return name;
    
  }
  public boolean getSkin(){
    return true;
  }
  
  public boolean getLegs(){
    return true;
  }
  
  public boolean getEyes(){
    return true;
  }    
  
  public boolean getEars(){
    return true;
  }
  
  public void setColour(String newColour) {
    colour = newColour;
  }
  
  public void setName(String newName){
    name = newName;
  }
  
  public void setSkin(boolean newSkin) {
    skin = newSkin;
  }
  
  public void setLegs(boolean newLegs) {
    legs = newLegs;
  }
  
  public void setEyes(boolean newEyes) {
    eyes = newEyes;
  }
  
    public void setEars(boolean newEars) {
    ears = newEars;
  }

    public void fighting(Animal cat){
      System.out.println("cat fights");
      if (cat.getColour().equals("black")){
        
        System.out.println("cat loses");
      }
    }
  
  
  
}
