package P2_Imparte_surprize;
import java.util.Random;

public class Candies implements ISurprise {
   
	private static int nrCandies;
	private String candieType;
	private static final Random random = new Random();
	private static String[] candies = {"Lollipops","Jelly Beans","Rock Candy","Gummy","Candy Scoops","Big Candy","Skittles","StarBurst"};

	
	public Candies(int nrCandies, String candieType) {
		this.nrCandies = nrCandies;
		this.candieType = candieType;
	}
   
	public void enjoy() {
		if (nrCandies == 1) {
			System.out.println("I really enjoy my candie:" + candieType);
		} else if (nrCandies > 1) {
			System.out.println("I enjoy having received " +  nrCandies + " " + candieType + " candies!!!!");
		}
	}
	
	public static ISurprise generate() {
		int index = random.nextInt(candies.length);
	    nrCandies = random.nextInt(50) + 1;	
		
		Candies candieSurprise = new Candies(nrCandies,candies[index]);
	
		return candieSurprise;
		
	}
	

}
