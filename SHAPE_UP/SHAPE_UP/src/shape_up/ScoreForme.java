package shape_up;

public class ScoreForme implements Score{
	private Carte c1;
	private Carte c2;
	private Carte c3;
	private Carte c4;
	private Carte c5;
	
	@Override
	public int calculerScore() {
		int total = 0;
		if(c1.getForme() == c2.getForme()) {
			total += 1;
		}else if(c1.getForme() == c2.getForme() && c1.getForme() == c3.getForme()) {
			total += 2;
		}else if (c1.getForme() == c2.getForme() && c1.getForme() == c3.getForme() && c1.getForme() == c4.getForme()) {
			total += 3;
		}else if (c1.getForme() == c2.getForme() && c1.getForme() == c3.getForme() && c1.getForme() == c4.getForme() && c1.getForme() == c5.getForme()) {
			total += 4;
		}
		return total;
	}

}
