package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.* ;

import javax.imageio.ImageIO;

public class TasDeCarte {

	private ArrayList<Carte> cartes;
	
	/*private Carte c1;
	private Carte c2;
	private Carte c3;
	private Carte c4;
	private Carte c5;
	private Carte c6;
	private Carte c7;
	private Carte c8;
	private Carte c9;
	private Carte c10;
	private Carte c11;
	private Carte c12;
	private Carte c13;
	private Carte c14;
	private Carte c15;
	private Carte c16;
	private Carte c17;
	private Carte c18;*/
	
	private Carte c1 =  new Carte(Couleur.Rouge,FormeCarte.Cercle,true,1);
	private Carte c2 =  new Carte(Couleur.Rouge,FormeCarte.Carre,true,2);
	private Carte c3 =  new Carte(Couleur.Rouge,FormeCarte.Triangle,true,3);
	private Carte c4 =  new Carte(Couleur.Rouge,FormeCarte.Cercle,false,4);
	private Carte c5 =  new Carte(Couleur.Rouge,FormeCarte.Carre,false,5);
	private Carte c6 =  new Carte(Couleur.Rouge,FormeCarte.Triangle,false,6);
	private Carte c7 =  new Carte(Couleur.Bleu,FormeCarte.Cercle,true,7);
	private Carte c8 =  new Carte(Couleur.Bleu,FormeCarte.Carre,true,8);
	private Carte c9 =  new Carte(Couleur.Bleu,FormeCarte.Triangle,true,9);
	private Carte c10 =  new Carte(Couleur.Bleu,FormeCarte.Cercle,false,10);
	private Carte c11 =  new Carte(Couleur.Bleu,FormeCarte.Carre,false,11);
	private Carte c12 =  new Carte(Couleur.Bleu,FormeCarte.Triangle,false,12);
	private Carte c13 =  new Carte(Couleur.Vert,FormeCarte.Cercle,true,13);
	private Carte c14 =  new Carte(Couleur.Vert,FormeCarte.Carre,true,14);
	private Carte c15 =  new Carte(Couleur.Vert,FormeCarte.Triangle,true,15);
	private Carte c16 =  new Carte(Couleur.Vert,FormeCarte.Cercle,false,16);
	private Carte c17 =  new Carte(Couleur.Vert,FormeCarte.Carre,false,17);
	private Carte c18 =  new Carte(Couleur.Vert,FormeCarte.Triangle,false,18);
	
	// là je crée un constructeur pour initialiser le tas de carte//
	public TasDeCarte() {
		this.cartes = new ArrayList<Carte>();
		//this.initCarte();
	}
	
	public int getNumCarte() {
		this.ajouterCarte();
		int c = 0;
		for(int i = 0; i < this.cartes.size(); i++) {
			return c = this.cartes.get(i).getNum();
		}
		return c;
	}

	public int getNbCarte() {
		return this.cartes.size();
	}
	
	/*public void initCarte() {
		try {
			Image img1 = ImageIO.read(new File("c1.png"));
			c1 =  new Carte(Couleur.Rouge,FormeCarte.Cercle,true,1,img1);
			
			Image img2 = ImageIO.read(new File("c2.png"));
			c2 =  new Carte(Couleur.Rouge,FormeCarte.Carre,true,2,img2);
			
			Image img3 = ImageIO.read(new File("c3.png"));
			c3 =  new Carte(Couleur.Rouge,FormeCarte.Triangle,true,3,img3);
			
			Image img4 = ImageIO.read(new File("c4.png"));
			c4 =  new Carte(Couleur.Rouge,FormeCarte.Cercle,false,4,img4);
			
			Image img5 = ImageIO.read(new File("c5.png"));
			c5 =  new Carte(Couleur.Rouge,FormeCarte.Carre,false,5,img5);
			
			Image img6 = ImageIO.read(new File("c6.png"));
			c6 =  new Carte(Couleur.Rouge,FormeCarte.Triangle,false,6,img6);
			
			Image img7 = ImageIO.read(new File("c7.png"));
			c7 =  new Carte(Couleur.Bleu,FormeCarte.Cercle,true,7,img7);
			
			Image img8 = ImageIO.read(new File("c8.png"));
			c8 =  new Carte(Couleur.Bleu,FormeCarte.Carre,true,8,img8);
			
			Image img9 = ImageIO.read(new File("c9.png"));
			c9 =  new Carte(Couleur.Bleu,FormeCarte.Triangle,true,9,img9);
			
			Image img10 = ImageIO.read(new File("c10.png"));
			c10 = new Carte(Couleur.Bleu,FormeCarte.Cercle,false,10,img10);
			
			Image img11 = ImageIO.read(new File("c11.png"));
			c11 = new Carte(Couleur.Bleu,FormeCarte.Carre,false,11,img11);
			
			Image img12 = ImageIO.read(new File("c12.png"));
			c12 = new Carte(Couleur.Bleu,FormeCarte.Triangle,false,12,img12);
			
			Image img13 = ImageIO.read(new File("c13.png"));
			c13 = new Carte(Couleur.Vert,FormeCarte.Cercle,true,13,img13);
			
			Image img14 = ImageIO.read(new File("c14.png"));
			c14 = new Carte(Couleur.Vert,FormeCarte.Carre,true,14,img14);
			
			Image img15 = ImageIO.read(new File("c15.png"));
			c15 = new Carte(Couleur.Vert,FormeCarte.Triangle,true,15,img15);
			
			Image img16 = ImageIO.read(new File("c16.png"));
			c16 = new Carte(Couleur.Vert,FormeCarte.Cercle,false,16,img16);
			
			Image img17 = ImageIO.read(new File("c17.png"));
			c17 = new Carte(Couleur.Vert,FormeCarte.Carre,false,17,img17);
			
			Image img18 = ImageIO.read(new File("c18.png"));
			c18 = new Carte(Couleur.Vert,FormeCarte.Triangle,false,18,img18);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}*/
	
	// Ajouter des cartes au tas
	//@param carte a ajouter 
	public void ajouterCarte () {
		this.cartes.add(c1);
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
		this.cartes.add(c18);
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
		this.retirerCarte(c);
		return c;
	}
	
	//piocher une carte après avoir mélanger
	public Carte piocherCarte() {
		Carte c = this.melanger();
		return c;
	}
	
	public String toString() {
		Carte c = this.piocherCarte();
		return c.toString();
	}
}


