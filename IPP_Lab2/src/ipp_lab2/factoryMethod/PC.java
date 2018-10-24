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
public class PC implements Device{

    @Override
    public void assamble() {
        System.out.println("I'm a powerful PC.");
    }
    
}
