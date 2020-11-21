package shape_up;

import java.util.* ;




public class TasDeCarte {

	protected ArrayList cartes;
	
	// là je crée un constructeur pour initialiser le tas de carte//
	
	public TasDeCarte() {
		this.cartes = new ArrayList<Carte>();
		
	}
	// Ajouter des cartes au tas
	//@param carte a ajouter 
	
	public void ajouterCarte (Carte carte) {
		this.cartes.add(carte);
		}
	
	// retirer une carte au tas
	
	public void retirerCarte (Carte carte) {
		this.cartes.remove(carte);
	}
	//melanger les cartes
	
	public void melanger() {
	Collections.shuffle(this.cartes);	
	}
	public int getNombreCartes() {
		return this.cartes.size();
	}
	
	// je sais pas s'il faut preciser si dans le tas il y'a une carte..
	
	public String toString() {
        String str = "";

        for( int i=0 ; i<this.cartes.size() ; i++ ) {
            str += "------------------\r\n";
            str += " " + this.cartes.get(i) + "\r\n";
        }
        str += "------------------";

        return str;
    }
}


