package P2_Imparte_surprize;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {
 
	 public GiveSurpriseAndSing(String type, int waitTime){
		 super(type,waitTime);
	 }
	
	public void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
	}
}
