package shape_up;

public class Carte {
	private String couleur;
	private String forme;
	private boolean remplissage;
	private int num;
	
	public Carte(String couleur, String forme, boolean remplissage, int num) {
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

	public String getCouleur() {
		return couleur;
	}

	public String getForme() {
		return forme;
	}

	public boolean isRemplissage() {
		return remplissage;
	}
	
}
