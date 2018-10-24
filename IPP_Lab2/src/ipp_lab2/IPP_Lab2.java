/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab2;

import ipp_lab2.factoryMethod.Device;
import ipp_lab2.factoryMethod.DeviceFactory;

/**
 *
 * @author andrei
 */
public class IPP_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeviceFactory factory = new DeviceFactory();
        Device device = factory.getDevice("portable");
        device.assamble();
        device = factory.getDevice("powerful");
        device.assamble();
    }
    
}
