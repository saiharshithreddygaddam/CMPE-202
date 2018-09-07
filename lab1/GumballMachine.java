public class GumballMachine
{

    private int num_gumballs;

	private boolean has_money;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.setHas_money(false);
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.setHas_money(true) ;
        else 
            this.setHas_money(false) ;
    }
    
    public void turnCrank()
    {
    	if ( this.isHas_money() )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.setHas_money(false) ;
    			System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Insufficient money inserted! Try again" ) ;
    	}        
    }

	public boolean isHas_money() {
		return has_money;
	}

	public void setHas_money(boolean has_money) {
		this.has_money = has_money;
	}
}
