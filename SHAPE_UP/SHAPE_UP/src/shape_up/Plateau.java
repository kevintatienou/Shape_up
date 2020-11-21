package shape_up;

import java.util.Random;

public class Plateau {
	private Carte [] cartes;
	private Joueur[] joueurs;
	private int[] ligne;
	private int[] colonne;
	private Forme forme;
	
	public Plateau (int j,String nom1, String nom2, String nom3, int ligne, int colonne, Forme forme) {
		this.cartes = new Carte[17];
		this.joueurs = new Joueur[j]; //j correspond au nombre de joueur que l'utilisateur va choisir (2 ou 3)
		this.joueurs[0] = new Joueur(nom1, 1);
		this.joueurs[1] = new Joueur(nom2, 2);
		this.joueurs[2] = new Joueur(nom3, 3);
		this.ligne = new int[ligne];
		this.colonne = new int[colonne];
		this.forme = forme;
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
		String[] couleur = new String[3];
		couleur[0] = "rouge";
		couleur[1] = "bleu";
		couleur[2] = "vert";
		Random r1 = new Random();
		int index1 = r1.nextInt(couleur.length);
		String s1 = couleur[index1];
		
		//forme aleatoire entre cercle, carre et triangle
		String[] forme = new String[3];
		forme[0] = "cercle";
		forme[1] = "carre";
		forme[2] = "triangle";
		Random r2 = new Random();
		int index2 = r2.nextInt(forme.length);
		String s2 = forme[index2];
		
		//remplis ou non genere aleatoirement
		Random r3 = new Random();
		boolean remp = r3.nextBoolean();
		
		//carte aleatoire
		Carte c = this.cartes[0];
		c.setNum(res);
		c.setCouleur(s1);
		c.setForme(s2);
		c.setRemplissage(remp);
		return c;
	}
	
	public Carte piocherCarte() {
		Carte c = this.melangerCarte();
		return c;
	}
	
	public void choisirForme() {
		this.forme.choisirForme();
	}
}
