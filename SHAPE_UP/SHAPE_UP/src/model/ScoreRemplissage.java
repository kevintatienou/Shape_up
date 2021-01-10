package model;

public class ScoreRemplissage implements Score{
	private Carte c1;
	private Carte c2;
	private Carte c3;
	private Carte c4;
	private Carte c5;
	
	public int calculerScore() {
		int total = 0;
		if(c1.isRemplissage() == c2.isRemplissage()) {
			total += 0;
		}else if (c1.isRemplissage() == c2.isRemplissage() && c1.isRemplissage() == c3.isRemplissage()) {
			total += 3;
		}else if(c1.isRemplissage() == c2.isRemplissage() && c1.isRemplissage() == c3.isRemplissage() && c1.isRemplissage() == c4.isRemplissage()) {
			total += 4;
		}else if(c1.isRemplissage() == c2.isRemplissage() && c1.isRemplissage() == c3.isRemplissage() && c1.isRemplissage() == c4.isRemplissage() && c1.isRemplissage() == c5.isRemplissage()) {
			total += 5;
		}
		return total;
	}
}
