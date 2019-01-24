package P2_Imparte_surprize;
import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	
	private static final Random random = new Random();
	 
	private static ArrayList<ISurprise> surprises;
	
	GatherSurprises() {
		
	}
	 
	public static ArrayList<ISurprise> gather(int n) {
	
		surprises =  new ArrayList(n);
		
		for(int i = 0;i<n;i++) {
			
		 surprises.add(gather());
		 
		}
		return surprises;
	}

	public static ISurprise gather() {
		
		ISurprise surprise = null;
	 
		int randomIndex = random.nextInt(3) + 1;
		
		if(randomIndex == 1) {
			
			surprise = Candies.generate();
			
		}else if(randomIndex == 2) {
			
		    surprise = MinionToy.generate();
			
		}else if(randomIndex == 3) {
			
		    surprise = FortuneCookie.generate();
		}
		return surprise;
	}
	
}
