package model;

import java.util.* ;

public class TasDeCarte {

	private ArrayList<Carte> cartes;
	//private int nbCarte = 0;
	/*private Carte c1 =  new Carte(Couleur.Rouge,FormeCarte.Cercle,true,1);
	private Carte c2 =  new Carte(Couleur.Rouge,FormeCarte.Carre,true,2);
	private Carte c3 =  new Carte(Couleur.Rouge,FormeCarte.Triangle,true,3);
	private Carte c4 =  new Carte(Couleur.Rouge,FormeCarte.Cercle,false,4);
	private Carte c5 =  new Carte(Couleur.Rouge,FormeCarte.Carre,false,5);
	private Carte c6 =  new Carte(Couleur.Rouge,FormeCarte.Triangle,false,6);
	private Carte c7 =  new Carte(Couleur.Bleu,FormeCarte.Cercle,true,7);
	private Carte c8 =  new Carte(Couleur.Bleu,FormeCarte.Carre,true,8);
	private Carte c9 =  new Carte(Couleur.Bleu,FormeCarte.Triangle,true,9);
	private Carte c10 = new Carte(Couleur.Bleu,FormeCarte.Cercle,false,10);
	private Carte c11 = new Carte(Couleur.Bleu,FormeCarte.Carre,false,11);
	private Carte c12 = new Carte(Couleur.Bleu,FormeCarte.Triangle,false,12);
	private Carte c13 = new Carte(Couleur.Vert,FormeCarte.Cercle,true,13);
	private Carte c14 = new Carte(Couleur.Vert,FormeCarte.Carre,true,14);
	private Carte c15 = new Carte(Couleur.Vert,FormeCarte.Triangle,true,15);
	private Carte c16 = new Carte(Couleur.Vert,FormeCarte.Cercle,false,16);
	private Carte c17 = new Carte(Couleur.Vert,FormeCarte.Carre,false,17);
	private Carte c18 = new Carte(Couleur.Vert,FormeCarte.Triangle,false,18);*/
	
	// là je crée un constructeur pour initialiser le tas de carte//
	public TasDeCarte() {
		this.cartes = new ArrayList<Carte>();
	}
	
	public int getNumCarte() {
		for(Carte c : this.cartes) {
			return c.getNum();
		}
		return 0;
	}

	public int getNbCarte() {
		return this.cartes.size();
	}
	
	/*différentes possibilités de cartes
	public void initCarte() {
		//Carte 1
		c1.setNum(1);
		c1.setCouleur(Couleur.Rouge);
		c1.setForme(FormeCarte.Cercle);
		c1.setRemplissage(true);
		
		//Carte 2
		c2.setNum(2);
		c2.setCouleur(Couleur.Rouge);
		c2.setForme(FormeCarte.Carre);
		c2.setRemplissage(true);
		
		//Carte 3
		c3.setNum(3);
		c3.setCouleur(Couleur.Rouge);
		c3.setForme(FormeCarte.Triangle);
		c3.setRemplissage(true);
		
		//Carte 4
		c4.setNum(4);
		c4.setCouleur(Couleur.Rouge);
		c4.setForme(FormeCarte.Cercle);
		c4.setRemplissage(false);
		
		//Carte 5
		c5.setNum(5);
		c5.setCouleur(Couleur.Rouge);
		c5.setForme(FormeCarte.Carre);
		c5.setRemplissage(false);
		
		//Carte 6
		c6.setNum(6);
		c6.setCouleur(Couleur.Rouge);
		c6.setForme(FormeCarte.Triangle);
		c6.setRemplissage(false);
		
		//Carte 7
		c7.setNum(7);
		c7.setCouleur(Couleur.Bleu);
		c7.setForme(FormeCarte.Cercle);
		c7.setRemplissage(true);
		
		//Carte 8
		c8.setNum(8);
		c8.setCouleur(Couleur.Bleu);
		c8.setForme(FormeCarte.Carre);
		c8.setRemplissage(true);
		
		//Carte 9
		c9.setNum(9);
		c9.setCouleur(Couleur.Bleu);
		c9.setForme(FormeCarte.Triangle);
		c9.setRemplissage(true);
		
		//Carte 10
		c10.setNum(10);
		c10.setCouleur(Couleur.Bleu);
		c10.setForme(FormeCarte.Cercle);
		c10.setRemplissage(false);
		
		//Carte 11
		c11.setNum(11);
		c11.setCouleur(Couleur.Bleu);
		c11.setForme(FormeCarte.Carre);
		c11.setRemplissage(false);
		
		//Carte 12
		c12.setNum(12);
		c12.setCouleur(Couleur.Bleu);
		c12.setForme(FormeCarte.Triangle);
		c12.setRemplissage(false);
		
		//Carte 13
		c13.setNum(13);
		c13.setCouleur(Couleur.Vert);
		c13.setForme(FormeCarte.Cercle);
		c13.setRemplissage(true);
		
		//Carte 14
		c14.setNum(14);
		c14.setCouleur(Couleur.Vert);
		c14.setForme(FormeCarte.Carre);
		c14.setRemplissage(true);
		
		//Carte 15
		c15.setNum(15);
		c15.setCouleur(Couleur.Vert);
		c15.setForme(FormeCarte.Triangle);
		c15.setRemplissage(true);
		
		//Carte 16
		c16.setNum(16);
		c16.setCouleur(Couleur.Vert);
		c16.setForme(FormeCarte.Cercle);
		c16.setRemplissage(false);
		
		//Carte 17
		c17.setNum(17);
		c17.setCouleur(Couleur.Vert);
		c17.setForme(FormeCarte.Carre);
		c17.setRemplissage(false);
		
		//Carte 18
		c18.setNum(18);
		c18.setCouleur(Couleur.Vert);
		c18.setForme(FormeCarte.Triangle);
		c18.setRemplissage(false);
	}*/
	
	// Ajouter des cartes au tas
	//@param carte a ajouter 
	public void ajouterCarte (Carte carte) {
		/*this.cartes.add(c1);
		this.cartes.add(c2);
		this.cartes.add(c3);
		this.cartes.add(c4);
		this.cartes.add(c5);
		this.cartes.add(c6);
		this.cartes.add(c7);
		this.cartes.add(c8);
		this.cartes.add(c9);
		this.cartes.add(c10);
		this.cartes.add(c11);
		this.cartes.add(c12);
		this.cartes.add(c13);
		this.cartes.add(c14);
		this.cartes.add(c15);
		this.cartes.add(c16);
		this.cartes.add(c17);
		this.cartes.add(c18);*/
		this.cartes.add(carte);
	}
	
	// retirer une carte au tas
	public void retirerCarte (Carte carte) {
		this.cartes.remove(carte);
	}
	
	//melanger les cartes
	public Carte melanger() {
		//numero de carte aleatoire entre 1 et 18
		int res = 1 + (int)(Math.random() * ((18 - 1) + 1));
		
		//carte aleatoire
		Carte c = this.cartes.get(res);
		c.setNum(res);
		this.retirerCarte(c);
		return c;
		//Collections.shuffle(this.cartes);	
	}
	
	//piocher une carte après avoir mélanger
	public Carte piocherCarte() {
		Carte c = this.melanger();
		//Carte c = (Carte) this.cartes.get(0);
		this.retirerCarte(c);
		return c;
	}
	
	public String toString() {
		Carte c = this.piocherCarte();
		return c.toString();
	}
}


