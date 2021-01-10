package model;

import java.util.Arrays;

public class Plateau {
	private TasDeCarte tas;
	private Joueur[] joueurs;
	private int nbJoueur; //2 ou 3
	//private int[] ligne;
	//private int[] colonne;
	private int[][] grille;
	private Forme forme;
	
	public Plateau (int j, int ligne, int colonne) {
		this.tas = new TasDeCarte();
		this.nbJoueur = j;
		this.joueurs = new Joueur[this.nbJoueur];
		//this.ligne = new int[ligne];
		//this.colonne = new int[colonne];
		this.grille = new int[ligne][colonne];
		this.forme = new Forme();
	}
	
	public int getNbJoueur() {
		return this.nbJoueur;
	}
	
	public void setNbJoueur(int nbJoueur) {
		this.nbJoueur = nbJoueur;
	}
	
	
	public Joueur[] getJoueurs() {
		return joueurs;
	}

	public TasDeCarte getTas() {
		return tas;
	}

	public void poserCarte(Carte c, int li, int col) {
		c = this.tas.piocherCarte();
		for(int i = 0; i < this.grille.length; i++) {
			for(int j = 0; j < this.grille.length; j++) {
				this.grille[li][col] = c.getNum();
			}
		}
	}
	
	/*public void deplacerCarte() {
		for(int i = 0; i < this.ligne.length; i++) {
			for(int j = 0; j < this.colonne.length; j++) {
				if(this.ligne[i] !=0 && this.colonne[j] !=0) {
					this.ligne[i+1] = this.ligne[i];
					this.colonne[j+1] = this.colonne[j];
					this.ligne[i] = this.tas.getNumCarte();
					this.colonne[j] = this.tas.getNumCarte();
				}
			}
		}
	}*/

	@Override
	public String toString() {
		return "Plateau [nbJoueur=" + nbJoueur + ", forme=" + forme + "]";
	}
	
	public String toString2() {
		return "Plateau [grille=" + this.grille + "]";
	}
}
