package P2_Imparte_surprize;

import java.util.Random;

public class MinionToy implements ISurprise {

	private static int minionCounter = 0;
	private String minion;
	private static String[] minions = {"Stuart","Kevin","Bob","Dave","Phil","Tim","Carl","Jorge"};
	 
	public MinionToy(String minion) {
	  this.minion = minion;
	  
	   if(minionCounter < minions.length) {
		   minionCounter++;
	   }else
		minionCounter = 0;
	}
   
	public void enjoy() {
	 
	 System.out.println("I really enjoy this " + minion + " minion gift!!!");

	}
	
	public static ISurprise generate() {
	
		String name =  minions[minionCounter];
		MinionToy minionToy = new MinionToy(name);
		
	 return minionToy;
	}
	

}



