/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab2.factoryMethod;

/**
 *
 * @author andrei
 */
public class DeviceFactory {
    
    public Device getDevice(String description){
        if(description.equals("powerful")){
            return new PC();
        } else if(description.equals("portable")){
            return new Laptop();
        }
        return null;
    }
}
