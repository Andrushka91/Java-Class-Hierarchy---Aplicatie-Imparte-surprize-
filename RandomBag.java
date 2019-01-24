package P2_Imparte_surprize;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {

	public ArrayList<ISurprise> randomBag = new ArrayList();
	public static final Random random = new Random();

	// adds a surprise in the bag
	public void put(ISurprise newSurprise) {
		randomBag.add(newSurprise);
	}

	// adds all the surprises from another IBag
	// -> the 'bagOfSurprises' will be empty() afterwards
	public void put(IBag bagOfSurprises) {

		while (!bagOfSurprises.isEmpty()) {
			randomBag.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	// removes a surprise from the bag and returns it
	public ISurprise takeOut() {

		int randomIndex = random.nextInt(randomBag.size());

		return randomBag.remove(randomIndex);
	}

	// Checks if the bag is empty or not
	public boolean isEmpty() {
		if (randomBag.isEmpty())
			return true;
		else
			return false;
	}

	// Returns the number of surprises
	public int size() {
		return randomBag.size();
	}

}
