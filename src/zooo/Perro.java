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
public class Perro extends Canino implements Mascota,Poderes{ 
       @Override
       public void comer (){
           System.out.println("El perro está comiendo ");
        
    }
    
       @Override
    public void deambular(){
        System.out.println("El perro está deambulando ");
        
    }

    @Override
    public void serAmigable() {
        System.out.println("El perro está siendo amigable");
    }

    @Override
    public void jugar() {
        System.out.println("El perro está jugando");
    } 
    
     @Override
    public void Volar() {
        System.out.println("El perro está siendo volando"); 
    }

    @Override
    public void SerInvicible() {
        System.out.println("El perro está siendo invicible"); 
    }
    
}
