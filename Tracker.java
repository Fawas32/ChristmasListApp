/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackerapp;

import java.io.Serializable;

/**
 *
 * @author fawasomoshonwon
 */
public abstract class Tracker implements Serializable {
    
    protected int number; 
    protected String description, url;
    protected double price;
    
    public Tracker() {
        number = 0;
        description = " ";
        price = 0.00;
        url = " ";
    }
    
    public Tracker(int number, String description, double price, String url ) {
        this.number = number;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public void printDetails(){
        System.out.println("Item Details: " + number + "," + description + "," + price + "," + url);
    }
    
    public String getDetails(){
        return "Item Details: " + number + "," + description + "," + price + "," + url;
    }
    
}
    

