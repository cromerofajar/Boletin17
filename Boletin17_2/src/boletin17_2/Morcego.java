/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

/**
 *
 * @author cromerofajar
 */
public class Morcego extends Mamifero implements IPodeVoar{
    @Override
    public void voar(){
        System.out.println("Os morcegos poden voar");
    }
    
}
