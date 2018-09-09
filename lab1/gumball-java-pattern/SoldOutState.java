public class SoldOutState implements State {
	    GumballMachine gumballMachine;
	 
	    public SoldOutState(GumballMachine gM) {
	        this.gumballMachine = gM;
	    }
	 
		public void insertQuarter(int coin) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		}
	 
		public void ejectQuarter() {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
	 
		public void turnCrank() {
			System.out.println("You turned, but there are no gumballs");
		}
	 
		public void dispense() {
			System.out.println("No gumball dispensed");
		}
	 
		public String toString() {
			return "sold out";
		}

		@Override
		public void insertCoins(int i, int j) {
			// TODO Auto-generated method stub
			System.out.println("You can't insert money, the machine is sold out");
		}

		@Override
		public void insertCoins(int[] a) {
			// TODO Auto-generated method stub
			System.out.println("You can't insert money, the machine is sold out");
		}

		@Override
		public void ejectCoin() {
			// TODO Auto-generated method stub
			
		}
	}

