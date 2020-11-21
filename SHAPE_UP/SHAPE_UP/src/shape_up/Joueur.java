package shape_up;

public class Joueur {
	private String nom;
	private int num;
	
	public Joueur(String nom, int num) {
		this.nom = nom;
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		String s = "Joueur " + this.num + this.getNom();
		return s;
	}
}
