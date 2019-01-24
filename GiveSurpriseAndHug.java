package P2_Imparte_surprize;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {
	 
	 public GiveSurpriseAndHug(String type, int waitTime){
		 super(type,waitTime);
	 }
	
	public void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}
}
