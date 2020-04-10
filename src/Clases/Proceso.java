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
public class Proceso {

    private Numero ans = new Numero();
    private Numero n1 = new Numero();
    private Numero n2 = new Numero();
    public  boolean error = false;
    public Proceso() {
        ans.setNumero(0);
    }

    
    public float getAns() {
        return ans.getNumero();
    }

    public void setAns(float ans) {
        this.ans.setNumero(ans);
    }

    public float getN1() {
        return n1.getNumero();
    }

    public void setN1(float n1) {
        this.n1.setNumero(n1);
    }

    public float getN2() {
        return n2.getNumero();
    }

    public void setN2(float n2) {
        this.n2.setNumero(n2);
    }

    public void suma() {
        this.ans.setNumero(this.n1.getNumero() + this.n2.getNumero());
    }

    public void resta() {
        this.ans.setNumero(this.n1.getNumero() - this.n2.getNumero());
    }
    
    public void multiplicacion() {
        this.ans.setNumero(this.n1.getNumero() * this.n2.getNumero());
    }
    
    public void division() {
        this.ans.setNumero(this.n1.getNumero() / this.n2.getNumero());
    }
}
