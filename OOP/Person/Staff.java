package Person;

public class Staff extends Person{
 private String school;
 private double pay;
 
  public Staff (String name, String address, String school, double pay){
    super(name,address);
    this.school= school;
    this.pay= pay;
  }
  
  public String getSchool(){
    return school;
  }
  public void setSchool(String newSchool){
    school = newSchool;
    
  }
  public double getPay(){
    return pay;
  }
    public void setPay(double newPay){
    pay=newPay;
  }
  
    public String toString(){
      return ("Stuff[Person [" +super.toString()+"school= "+school+", pay= "+pay+"]");
    }
}