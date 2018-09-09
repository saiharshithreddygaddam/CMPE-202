public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gM) {
		this.gumballMachine = gM;
	}
  
	public void insertQuarter(int q) {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}

	@Override
	public void insertCoins(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("You can't insert coins now");
	}

	@Override
	public void insertCoins(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("You can't insert coins now");
		
	}
}

