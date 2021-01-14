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

	public void poserCarte() {
		for(int i = 0; i < this.grille.length; i++) {
			for(int j = 0; j < this.grille.length; j++) {
				this.grille[i][j] = this.tas.getNumCarte();
			}
		}
	}
	
	public void deplacerCarte() {
		for(int i = 0; i < this.grille.length; i++) {
			for(int j = 0; j < this.grille.length; j++) {
				if(this.grille[i][j] !=0) {
					this.grille[i+1][j+1] = this.grille[i][j];
					this.grille[i][j] = this.tas.getNumCarte();
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Plateau [nbJoueur=" + nbJoueur + ", forme=" + forme + "]";
	}
	
	public String toString2() {
		return "Plateau [grille=" + this.grille + "]";
	}
}
