/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop101;

/**
 *
 * @author hager
 */
public class OOP101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car car1 = new BMW();
        Car car2 = new BMW(1000);
        
        car1.setYear(2020);
        car2.setPrice(1000000);
        
        car1.getFuelType();
        
        System.out.println(car1.getYear());
        System.out.println(car2.getPrice());
        
        
 
    }
    
}
