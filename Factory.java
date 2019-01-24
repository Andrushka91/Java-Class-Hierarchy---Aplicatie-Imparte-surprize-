package P2_Imparte_surprize;

public class Factory implements IBagFactory {

	public IBag makeBag(String type) {
		
		IBag bag = null;
		
		if(type.equals("fifo")) {
			
			FifoBag fifo = new FifoBag();
			bag = fifo;
		
		}else if(type.equals("lifo")) {
			
			LifoBag lifo = new LifoBag();
			bag = lifo;
		}else if(type.equals("randombag")) {
			
			RandomBag randomBag = new RandomBag();
			bag = randomBag;
		}
		return bag;		
	}
}
