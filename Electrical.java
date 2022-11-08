/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackerapp;

/**
 *
 * @author fawasomoshonwon
 */
public class Electrical extends Tracker {
    private String type;
    private String make; 
    private String model;
  
    
     public Electrical() {
        super();
        type = " ";
        make = " ";
        model = " ";
     }
     public Electrical(int number, String description, double price, String url){
        super(number, description, price, url);
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDetails(){
        return super.getDetails()+  " Type: " +type+ " Make: " +make+ " Model: " +model;
    }
     
    
    
}
