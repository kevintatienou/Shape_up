package shape_up;

import java.util.ArrayList ; 

public class Piocher extends TasDeCarte{
	
    
	
    public Piocher (int extension) {
        for( Carte c: Carte.values() ) // values ici n,'est pas définie , je pensais à une vlaueur de la carte.
       {
           
        this.melanger();
    }
    
   
    public Carte piocher() {

        Carte c = (Carte) this.cartes.get(0);

        this.retirerCarte(c);

        return c;
    }
	
}
