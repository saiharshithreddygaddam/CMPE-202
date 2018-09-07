
public class GumballMachine2 extends GumballMachine {

	
	GumballMachine2(int size){
		super(size);
	}
	
	public void insertQuarter(int coin1, int coin2) {
		
		if(coin1==25 && coin2 ==25) 
			this.setHas_money(true);
		else
			this.setHas_money(false);
	}
	
    

	
}
