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
public class Dvd extends Tracker {
    private String name;
    private String director;
    private String certifacte;
  
    
     public Dvd() {
        super();
        name = " ";
        director = " ";
        certifacte = " ";
     }
        
        public Dvd(int number, String description, double price, String url){
           super(number, description, price, url);
           this.name = name;
           this.director = director;
           this.certifacte = certifacte;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getDirector() {
           return director;
       }

       public void setDirector(String director) {
           this.director = director;
       }

       public String getCertifacte() {
           return certifacte;
       }

       public void setCertifacte(String certifacte) {
           this.certifacte = certifacte;
       }
       
       public String getDetails(){
        return super.getDetails()+  " Name: " +name+ " director: " +director+ " certifacte: " +certifacte;
    }

    
}