package P2_Imparte_surprize;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public abstract class AbstractGiveSurprises {

	public Factory factory = new Factory();
	public IBag bag;
	public int waitTime;
	
	public AbstractGiveSurprises(String type,int waitTime) {
		this.waitTime = waitTime;
		bag = factory.makeBag(type);
	}
	
	//adauga o surpriza in container
	public void put(ISurprise newSurprise) {
		
		bag.put(newSurprise);
			
	}
	public ISurprise give() {
		ISurprise surprise = bag.takeOut();
		giveWithPassion();
		surprise.enjoy();
		
		return surprise;
	}
	
	
	public void giveAall() {
		
		while(!this.isEmpty()) { 
			give();
			System.out.println();
			put(GatherSurprises.gather());
			try {
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}

	public boolean isEmpty() {
		
		return bag.isEmpty();
	}
	
	abstract void giveWithPassion();
	
	
}
