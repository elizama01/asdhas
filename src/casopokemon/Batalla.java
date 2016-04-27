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
public class Batalla {
int ataque1;
Pokemon i1 ;
Pokemon i2;
int  turno =(int)(Math.random())*(2-1+1)+1;
public Batalla(Pokemon n1,Pokemon n2) {
    this.i1=n1;
    this.i2=n2;
    }
   
   
public void batalla( ){
    
    int poke1 =1 ;
    int poke2=2;
    int cont=0 ; 
   
    
    do {  
        if (poke1==turno){
          
            int vidares=i2.getPuntosVida()-daño(); 
        i1.setPuntosVida(vidares);
        } else {
            if (poke2==turno){
            int vidares=i2.getPuntosVida()-daño();
            i2.setPuntosVida(vidares);
            }
        }
      
       cont++;
    } while (i1.getPuntosVida()>0 && i2.getPuntosVida()>0);
    resultado();
    System.out.println("Cantidad de turnos de la batalla " + cont ); 
}
     public void resultado(){
         
         System.out.println("Batalla pokemon");
         System.out.println("nombre de pokemon"+i1.getNombre1());
         System.out.println("nombre de pokemon"+i2.getNombre1());
         System.out.println("Cantidad de vida de pokemon"+i1.getNombre1()+"es:  "+i1.getPuntosVida());
         System.out.println("Cantidad de vida de pokemon"+i2.getNombre1()+"es:  "+i2.getPuntosVida());
        
             
     }
    public int daño(){
  ataque1=(int)(Math.random())*(30-15+1)+15;
      
  return ataque1 ;}
}
