

public class Main {


	public static void main(String[] args) {
		GumballMachine gumballMachine= new GumballMachine(5);

		System.out.println("----------Gumball Machine 1----------\n");
		
		
		gumballMachine.insertQuarter(5);
		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();
		
		System.out.println("\n----------Gumball Machine 2----------\n");
		GumballMachine gumballMachine2= new GumballMachine(5);
		
		gumballMachine2.insertCoins(25,0);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoins(25,25);
		gumballMachine2.turnCrank();
		gumballMachine2.ejectQuarter();
		
		System.out.println("\n----------Gumball Machine 3----------\n");
		
		GumballMachine gumballMachine3= new GumballMachine(5);
		int a[] = {25,10,10,10};
		int c[] = {25,25,5,25,10};
		gumballMachine3.insertCoins(a);
		gumballMachine3.insertCoins(a);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoins(c);
		gumballMachine3.turnCrank();

	}
	}

	

