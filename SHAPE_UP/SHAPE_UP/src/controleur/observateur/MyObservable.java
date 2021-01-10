package controleur.observateur;

import java.util.ArrayList;

public abstract class MyObservable {
	private ArrayList<MyObservateur> obs = new ArrayList<>();
	
	public void addObs(MyObservateur o) {
		this.obs.add(o);
	}
	
	public void removeObs(MyObservateur o) {
		this.obs.remove(o);
	}
	
	protected void Notify() {
		for(MyObservateur o : obs)
			o.update();
	}
}
