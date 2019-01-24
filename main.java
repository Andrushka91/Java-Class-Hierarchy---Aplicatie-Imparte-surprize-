package P2_Imparte_surprize;

public class main {
	
	public static void main(String[] args) {
		
		 
		GiveSurpriseAndApplause gift1 = new GiveSurpriseAndApplause("lifo",3);
		
		
	    gift1.put(GatherSurprises.gather());
	    gift1.give();
	   // gift1.giveAall();	
	     
		GiveSurpriseAndSing gift2 = new GiveSurpriseAndSing("lifo",3);
		gift2.put(GatherSurprises.gather());
		gift2.give();
		 
		GiveSurpriseAndHug gift3 = new GiveSurpriseAndHug("lifo",3);
	    gift3.put(GatherSurprises.gather());
	    gift3.give();
	}

}
