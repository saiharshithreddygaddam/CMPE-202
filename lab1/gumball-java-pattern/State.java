

public interface State {
	 
	public void insertQuarter(int coin);
	public void ejectQuarter();
	public void ejectCoin();
	public void turnCrank();
	public void dispense();
	public void insertCoins(int i, int j);
	public void insertCoins( int[] a);
}

