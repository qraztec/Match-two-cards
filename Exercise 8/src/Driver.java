
public class Driver
{
	private char suit;
	private int value;
	
	
	
	

	public void PlayingCard(int s, int v)
	{
		
		if ((s == 1))
		this.suit = 'H';
		else if (s == 2)
		this.suit = 'D';
		else if (s == 3)
		this.suit = 'C';
		else
		this.suit = 'S';
		
		this.value = v;
	}
	
	
	  public char getSuit() 
	  { 
		  return suit; 
	  }
	  
	  public int getValue() 
	  { 
		 
		  {
		  return value;
		  }
		
	  }
	  
	  public void setSuit(int s) 
	  { 
		  this.suit = suit; 
	  }
	  
	  public void setValue(int v) 
	  { 
		  this.value = v; 
		  
	  }
	 
	
	public String toString()
	{
		return "(" + suit + "," + getValue() + ")";
	}
	
	
	
	
}
