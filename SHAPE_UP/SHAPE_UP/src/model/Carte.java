package model;

import java.awt.Image;

public class Carte {
	private Couleur couleur;
	private FormeCarte forme;
	private boolean remplissage = false;
	private int num = 0;
	private Image image;
	
	Carte(Couleur couleur, FormeCarte forme, boolean remplissage, int num) {
		this.couleur = couleur;
		this.forme = forme;
		this.remplissage = remplissage;
		this.num = num;
		//this.setImage(image);
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	public FormeCarte getForme() {
		return forme;
	}
	
	public void setForme(FormeCarte forme) {
		this.forme = forme;
	}

	public boolean isRemplissage() {
		return remplissage;
	}
	
	public void setRemplissage(boolean remplissage) {
		this.remplissage = remplissage;
	}
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Carte : \n "
				+ "\t numéro : " + num + ",\n"
				+ "\t couleur : " + this.couleur + ",\n"
				+ "\t forme : " + this.forme + ",\n "
				+ "\t remplissage : " + this.remplissage
				+ "\t image : " + this.image;
	}
}
