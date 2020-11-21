package shape_up;

public class ScoreCouleur implements Score{
	private Carte c1;
	private Carte c2;
	private Carte c3;
	private Carte c4;
	private Carte c5;
	
	public int calculerScore() {
		int total = 0;
		if(c1.getCouleur() == c2.getCouleur()) {
			total = 0;
		}else if(c1.getCouleur() == c2.getCouleur() && c1.getCouleur() == c3.getCouleur()) {
			total += 4;
		}else if (c1.getCouleur() == c2.getCouleur() && c1.getCouleur() == c3.getCouleur() && c1.getCouleur() == c4.getCouleur()) {
			total += 5;
		}else if (c1.getCouleur() == c2.getCouleur() && c1.getCouleur() == c3.getCouleur() && c1.getCouleur() == c4.getCouleur() && c1.getCouleur() == c5.getCouleur()) {
			total += 6;
		}
		return total;
	}
}
