/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author Sunny
 */

    
    
    public class Laptop implements Comparable<Laptop>{
    
    
   

    private String brand;
    private int price;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand=" + brand + ", price=" + price + '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
  
    public int compareTo(Laptop o2)
    {
      
        return this.getBrand().compareTo(o2.getBrand());
       
    }
    
    
}


    

