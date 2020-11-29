package shape_up;

public class Carte {
	private Couleur couleur;
	private FormeCarte forme;
	private boolean remplissage;
	private int num;
	
	public Carte(Couleur couleur, FormeCarte forme, boolean remplissage, int num) {
		this.couleur = couleur; //rouge ou vert ou bleu
		this.forme = forme; //cercle ou carré ou triangle
		this.remplissage = remplissage;
		this.num = num;
	}
	
	public Carte() {}

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
	
}
