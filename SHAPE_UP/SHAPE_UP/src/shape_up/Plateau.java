package shape_up;

import java.util.Random;

public class Plateau {
	private Carte [] cartes;
	private Joueur[] joueurs;
	private int nbJoueur; //2 ou 3
	private int[] ligne;
	private int[] colonne;
	private Forme forme;
	
	public Plateau (int j, int ligne, int colonne, Forme forme) {
		this.cartes = new Carte[17];
		//this.joueurs = new Joueur[j]; //j correspond au nombre de joueur que l'utilisateur va choisir (2 ou 3)
		//this.joueurs[0] = new Joueur(nom1, 1);
		//this.joueurs[1] = new Joueur(nom2, 2);
		//this.joueurs[2] = new Joueur(nom3, 3); ,String nom1, String nom2, String nom3
		this.nbJoueur = j;
		this.joueurs = new Joueur[this.nbJoueur];
		this.ligne = new int[ligne];
		this.colonne = new int[colonne];
		this.forme = forme;
	}
	
	public int getNbJoueur() {
		return this.nbJoueur;
	}
	
	public void addJoueur() {
		String nom1 = "";
		String nom2 = "";
		String nom3 = "";
		
		for(int i=1; i<= this.nbJoueur; i++) {
			if(this.nbJoueur == 2) {
				this.joueurs[0] = new Joueur(nom1, i);
				this.joueurs[1] = new Joueur(nom2, i+1);
			}else if(this.nbJoueur == 3) {
				this.joueurs[0] = new Joueur(nom1, i);
				this.joueurs[1] = new Joueur(nom2, i+1);
				this.joueurs[2] = new Joueur(nom3, i+2);
			}
		}
	}
	
	public void poserCarte() {
		for(int i = 0; i < this.ligne.length; i++) {
			for(int j = 0; j < this.colonne.length; j++) {
				if(this.ligne[i] == 0 && this.colonne[j] == 0) {
					this.ligne[i] = this.cartes[0].getNum();
					this.colonne[j] = this.cartes[0].getNum();
				}
			}
		}
	}
	
	public void deplacerCarte() {
		for(int i = 0; i < this.ligne.length; i++) {
			for(int j = 0; j < this.colonne.length; j++) {
				if(this.ligne[i] !=0 && this.colonne[j] !=0) {
					this.ligne[i+1] = this.ligne[i];
					this.colonne[j+1] = this.colonne[j];
					this.ligne[i] = this.cartes[0].getNum();
					this.colonne[j] = this.cartes[0].getNum();
				}
			}
		}
	}
	
	public Carte melangerCarte() {
		//numero de carte aleatoire entre 1 et 17
		int res = 1 + (int)(Math.random() * ((17 - 1) + 1));
		
		//couleur aleatoire entre rouge, bleu et vert
		Couleur[] couleur = new Couleur[3];
		couleur[0] = Couleur.Rouge;
		couleur[1] = Couleur.Bleu;
		couleur[2] = Couleur.Vert;
		Random r1 = new Random();
		int index1 = r1.nextInt(couleur.length);
		Couleur coul = couleur[index1];
		
		//forme aleatoire entre cercle, carre et triangle
		FormeCarte[] forme = new FormeCarte[3];
		forme[0] = FormeCarte.Carre;
		forme[1] = FormeCarte.Cercle;
		forme[2] = FormeCarte.Triangle;
		Random r2 = new Random();
		int index2 = r2.nextInt(forme.length);
		FormeCarte form = forme[index2];
		
		//remplis ou non genere aleatoirement
		Random r3 = new Random();
		boolean remp = r3.nextBoolean();
		
		//carte aleatoire
		Carte c = this.cartes[0];
		c.setNum(res);
		c.setCouleur(coul);
		c.setForme(form);
		c.setRemplissage(remp);
		return c;
	}
	
	public Carte piocherCarte() {
		Carte c = this.melangerCarte();
		return c;
	}
	
	public String choisirForme() {
		return this.forme.choisirForme();
	}
}
