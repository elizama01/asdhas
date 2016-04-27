/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casopokemon;

/**
 *
 * @author pcccasd
 */
public class Pokemon {
int puntosVida=100;  int ataque1;   String nombre1;
public Pokemon(String nombre) {
  this.nombre1=nombre;
   }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public double getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }


    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
      
    }
    
 
   
    

    @Override
    public String toString() {
        return "Pokemon{" + "puntosVida=" + puntosVida + ", ataque1=" + ataque1 + ", nombre1=" + nombre1 + '}';
    }
    
}
