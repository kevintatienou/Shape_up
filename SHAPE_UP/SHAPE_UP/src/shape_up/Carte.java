package shape_up;

public enum Carte {
	c1(Carte.ROUGE, Carte.CERCLE, true,1),
	c2(Carte.ROUGE,Carte.CARRE,true,2),
	c3(Carte.ROUGE,Carte.TRIANGLE,true,3),
	c4(Carte.ROUGE,Carte.CERCLE,false,4),
	c5(Carte.ROUGE,Carte.CARRE,false,5),
	c6(Carte.ROUGE,Carte.TRIANGLE,false,6),
	c7(Carte.BLEU,Carte.CERCLE,true,7),
	c8(Carte.BLEU,Carte.CARRE,true,8),
	c9(Carte.BLEU,Carte.TRIANGLE,true,9),
	c10(Carte.BLEU,Carte.CERCLE,false,10),
	c11(Carte.BLEU,Carte.CARRE,false,11),
	c12(Carte.BLEU,Carte.TRIANGLE,false,12),
	c13(Carte.VERT,Carte.CERCLE,true,13),
	c14(Carte.VERT,Carte.CARRE,true,14),
	c15(Carte.VERT,Carte.TRIANGLE,true,15),
	c16(Carte.VERT,Carte.CERCLE,false,16),
	c17(Carte.VERT,Carte.CARRE,false,17),
	c18(Carte.VERT,Carte.TRIANGLE,false,18);
	
	public static final int ROUGE = 1;
	public static final int VERT = 2;
	public static final int BLEU = 3;
	public static final int CARRE = 1;
	public static final int CERCLE = 2;
	public static final int TRIANGLE = 3;
	
	private int couleur = 0;
	private int forme = 0;
	private boolean remplissage = false;
	private int num = 0;
	
	Carte(int couleur, int forme, boolean remplissage, int num) {
		this.couleur = couleur; //rouge ou vert ou bleu
		this.forme = forme; //cercle ou carré ou triangle
		this.remplissage = remplissage;
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCouleur() {
		return couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}
	
	public int getForme() {
		return forme;
	}
	
	public void setForme(int forme) {
		this.forme = forme;
	}

	public boolean isRemplissage() {
		return remplissage;
	}
	
	public void setRemplissage(boolean remplissage) {
		this.remplissage = remplissage;
	}

	public String couleurToString() {
		switch(this.couleur) {
			case ROUGE:
				return "Rouge";
			case VERT:
				return "Vert";
			case BLEU:
				return "Bleu";
		}
		return "";
	}
	
	public String formeToString() {
		switch(this.forme) {
			case CERCLE:
				return "Cercle";
			case CARRE:
				return "Carre";
			case TRIANGLE:
				return "Triangle";
		}
		return "";
	}
	
	@Override
	public String toString() {
		return "Carte : \n "
				+ "\t numéro : " + num + ",\n"
				+ "\t couleur : " + this.couleurToString() + ",\n"
				+ "\t forme : " + this.formeToString() + ",\n "
				+ "\t remplissage : " + remplissage;
	}
}
