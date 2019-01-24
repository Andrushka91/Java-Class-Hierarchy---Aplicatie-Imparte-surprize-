package P2_Imparte_surprize;
import java.util.ArrayList;


public class FifoBag implements IBag {


	public ArrayList<ISurprise> fifoBag = new ArrayList();

	// adds a surprise in the bag
	public void put(ISurprise newSurprise) {
		fifoBag.add(newSurprise);
	}

	// adds all the surprises from another IBag
	//   -> the 'bagOfSurprises' will be empty() afterwards
	public void put(IBag bagOfSurprises) {

		while(!bagOfSurprises.isEmpty()) {
			fifoBag.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	// removes a surprise from the bag and returns it
	public ISurprise takeOut() {

		return fifoBag.remove(0);

	}

	// Checks if the bag is empty or not
	public boolean isEmpty(){
		return fifoBag.isEmpty();  
	}

	// Returns the number of surprises
	public int size(){
		return fifoBag.size();
	}
}

