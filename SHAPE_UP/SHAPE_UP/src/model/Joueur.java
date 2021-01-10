package model;

public class Joueur {
	private String nom;
	private int num;
	private int score = 0;
	private ScoreCouleur scCoul; 
	private ScoreRemplissage scRemp;
	private ScoreForme scForme;
	
	public Joueur(String nom, int num) {
		this.nom = nom;
		this.num = num;
	}

	public Joueur() {}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int Score() {
		score = this.scCoul.calculerScore() + this.scForme.calculerScore() + this.scRemp.calculerScore();
		return score;
	}
	
	@Override
	public String toString() {
		String s = "Joueur : \nnuméro : " + this.num + ",\nprenom : " + this.getNom()
					+ ".\nScore total : " + this.score;
		return s;
	}
}
