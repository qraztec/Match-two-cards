
public class Driver
{
	private String suit;
	private String value;
	
	
	
	

	public void PlayingCard(int s, int v)
	{
		
		//if ((s == 1) || (s == 2) || (s == 3))
			setSuit(s);
		//else 
			//this.suit = String.valueOf(s);
		
		
		//if ((v == 1) || (v > 10))
			setValue(v);
		//else
		//this.value = String.valueOf(v);
	}
	
	
	  public String getSuit() 
	  { 
		  return suit; 
	  }
	  
	  public String getValue() 
	  { 
		 
		  
		  return value;
		  
		
	  }
	  
	  public void setSuit(int s) 
	  { 
		    if (s == 1)
		    this.suit = "H";
			else if (s == 2)
			this.suit = "D";
			else if (s == 3)
			this.suit = "C";
			else 
			this.suit = "S";
		  
	  }
	  
	  public void setValue(int v) 
	  { 
		  if (v == 1)
			  this.value = "A"; 
		  else if (v == 11)
			  this.value = "J";
		  else if (v == 12)
			  this.value = "Q";
		  else if (v == 13)
			  this.value = "K";
		  else
			  this.value = String.valueOf(v);
		  
	  }
	 
	
	public String toString()
	{
		return "(" + getSuit() + "," + getValue() + ")";
	}
	
	
	
	
}
