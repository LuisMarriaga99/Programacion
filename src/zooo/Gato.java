/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooo;

/**
 *
 * @author USER
 */
public class Gato extends Felino implements Mascota,Poderes { 
    

    @Override
    public void serAmigable() {
        System.out.println("El gato está siendo amigable");
    }

    @Override
    public void jugar() {
        System.out.println("El gato está siendo amigable"); 
    }

    @Override
    public void Volar() {
        System.out.println("El gato está siendo volando"); 
    }

    @Override
    public void SerInvicible() {
        System.out.println("El gato está siendo invicible"); 
    }
    
    
}
