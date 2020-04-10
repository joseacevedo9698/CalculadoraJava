/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 57302
 */
public class Numero {
    private float numero;
    private boolean status = true;
    public Numero() {
        this.numero = 0;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
        this.status = numero >= 0;
    }
    
    public void changeSigned(){
        this.numero = numero*(-1);
        this.status = !this.status;
    }
    
    public void reloadNumber(){
        this.numero = 0;
        this.status = true;
    }
}
