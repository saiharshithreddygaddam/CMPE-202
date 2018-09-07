import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GumballMachine3 gumballMachine_3 = new GumballMachine3(5);
		System.out.println("-----GumballMachine 1-----");
	
		gumballMachine_3.insertQuarter( 25 );
		gumballMachine_3.turnCrank();
		
		gumballMachine_3.insertQuarter( 5 );
		gumballMachine_3.turnCrank();
		
		gumballMachine_3.insertQuarter( 25 );
		gumballMachine_3.turnCrank();
		
		System.out.println("");
		System.out.println("-----GumballMachine 2-----");
		
		
		gumballMachine_3.insertQuarter( 25,25 );
		gumballMachine_3.turnCrank();
		
		gumballMachine_3.insertQuarter( 0,25 );
		gumballMachine_3.turnCrank();

		System.out.println("");
		System.out.println("-----GumballMachine 3-----");
		
		int c[] = { 5,10,10,25};
		
		gumballMachine_3.insertQuarter( c );
		gumballMachine_3.turnCrank();
		int ca[] = {5,10,10};
		gumballMachine_3.insertQuarter( ca );
		gumballMachine_3.turnCrank();
		sc.close();

		}
}