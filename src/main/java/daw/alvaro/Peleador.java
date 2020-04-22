/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.alvaro;

/**
 *
 * @author Álvaro
 */
public class Peleador {

    private int edad;
    private int peso;

    public Peleador(int edad, int peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public Peleador() {
        this.edad = 31;
        this.peso = 70;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
