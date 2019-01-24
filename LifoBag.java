package P2_Imparte_surprize;

import java.util.ArrayList;

public class LifoBag implements IBag {

	public static ArrayList<ISurprise> lifoBag = new ArrayList();

	// adds a surprise in the bag
	public void put(ISurprise newSurprise) {
		lifoBag.add(newSurprise);
	}

	// adds all the surprises from another IBag
	//   -> the 'bagOfSurprises' will be empty() afterwards
	public void put(IBag bagOfSurprises) {

		while(!bagOfSurprises.isEmpty()) {

			lifoBag.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	// removes a surprise from the bag and returns it
	public ISurprise takeOut() {
		return lifoBag.remove(lifoBag.size()-1);
	}

	// Checks if the bag is empty or not
	public boolean isEmpty() {
		if(lifoBag.isEmpty())
			return true;
		else
			return false;  
	}

	// Returns the number of surprises
	public int size() {
		return lifoBag.size();
	}


}
