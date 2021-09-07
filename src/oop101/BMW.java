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
public class BMW extends Car{
    
    private int carID;

    //Multiple constructors with different parameters
    public BMW(){}
    
    public BMW(int id){
         carID = id;
    }
    
    //carID getter and setter function 
    void setCarID(int id){
        carID = id;
    }
    
    int getCarID(){
        return carID;
    }
    
    @Override
    void getFuelType(){
        System.out.println("Fuel type is Gasoline");
    }
    
}
