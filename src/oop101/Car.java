package oop101;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hager
 */
public class Car {
    
    private double price;
    private String model;
    private int year;
    
    //price
    void setPrice(double p)
    {
     if(p<0){
         p = -p;
     }   
     else{
         price = p;
     }
    }
   
    double getPrice(){
        return price;
    }
    
    //model
    void setModel(String m){
        model = m;
    }
    String getModel(){
       return model; 
    }
    
    //year
    void setYear(int y){
        year = y;
    }
    int getYear(){
        return year;
    }
    
    void getFuelType(){
     System.out.println("Fuel Type is .......");
    }
}
