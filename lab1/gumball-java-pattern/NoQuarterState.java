public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gM) {
        this.gumballMachine = gM;
    }
 
	public void insertQuarter(int c) {
		if(c==25) {
			System.out.println("You inserted a quarter");
			gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		else {
			System.out.println("Only quarter has to be inserted");
			gumballMachine.setState(gumballMachine.getHasQuarterState());
			gumballMachine.ejectCoin();
			gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	}
	
	public void insertCoins(int coin1, int coin2) {
		if(coin1==25 && coin2==25) {
			System.out.println("You inserted 2 quarters");
			gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		else {
			System.out.println("You inserted only one quarter");
			gumballMachine.setState(gumballMachine.getHasQuarterState());
			gumballMachine.ejectQuarter();
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no quarters");
	 }
 
	public void dispense() {
		System.out.println("You need to pay ");
	} 
 
	

	
	public void insertCoins(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		if(sum>=50) {
			System.out.println("\nYou inserted "+sum+"cents");
			int change = sum-50;
			int r=0,rem=0,ar=0;
			
				if(change>0) {
					
					if(change/25>0) {
					r = change/25;
					change = change%25;
					System.out.print(" "+r+ " Quarter");
					}
					if(change/10>0) {
					rem = change/10;
					change = change%10;
					System.out.print("\n "+rem+ " 10 cents ");
					}
					if(change/5>0) {
					ar=change/5;
					change = change%5;
					System.out.print("\n "+ar+ " 5 cents");
				}
				
				System.out.println(" returned");
			gumballMachine.setState(gumballMachine.getHasQuarterState());
			}
		
		else {
			System.out.println("You cant insert coins worth less than 50c");
		}
	}
	}

	@Override
	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
		
	}
}


