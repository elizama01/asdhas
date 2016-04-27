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
public class CasoPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Pokemon n1 =new Pokemon("PIKAPIKA");
Pokemon n2 =new Pokemon("Skuadasjkdkl");

   Batalla b1 = new Batalla (n1,n2 );

   b1.batalla();
    }
    
}
