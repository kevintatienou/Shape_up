package model; 

public class Rectangle extends Forme{
	private double longueur;
	private double largeur;
	
    public Rectangle(int x, int y, double longueur, double largeur) {
    	//super(x, y);
    	this.longueur = longueur;
    	this.largeur = largeur;
    }
    
    public double getLongueur() {
    	return longueur;
    }
    public void setLongueur(double longueur) {
    	this.longueur=longueur;
    }
    public double getLargeur() {
    	return largeur;
    }
    public void setLargeur(double largeur) {
    	this.largeur= largeur;
    }
}