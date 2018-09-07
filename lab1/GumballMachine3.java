
public class GumballMachine3 extends GumballMachine2 {

	public GumballMachine3(int size) {
	super(size);
	
	}
	
	public void insertQuarter(int[] coins) {
		int sum=0;
		for(int i=0;i<coins.length;i++) {
			sum += coins[i]; 
		}
		if(sum==50) 
			this.setHas_money(true);
        else 
			this.setHas_money(false);
	}
}
