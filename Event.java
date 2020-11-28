package shape_up;

public class Event {
	private String titre;
	private Object donnee;
	
	public Event (String tit, Object don) {
		this.titre=tit;
		this.donnee=don;
	}

   public String getTtitre() {
	   return this.titre;
   }
   
   public Object getDonnee() {
	   return this.donnee;
   }
}
