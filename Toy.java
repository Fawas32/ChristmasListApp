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
public class Toy extends Tracker {
    private String name;
    private String type;
  
    
    public Toy() {
        super();
        name = " ";
        type = " ";
        
    }
    
    public Toy(int number, String description, double price, String url){
        super(number, description, price, url);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getDetails(){
        return super.getDetails()+  " Name: " +name+ " type: " +type;
    }
        
}
