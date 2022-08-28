import java.util.List;
import java.util.Random;

public class MainProgram
{

	public static void main(String[] args)
	{
		boolean equale;
		Driver cards1 = new Driver();
		Driver cards2 = new Driver();
		
		Random rndc1 = new Random();
		Random rndc2 = new Random();
		Random rndv1 = new Random();
		Random rndv2 = new Random();
		
	//	int value = rndc.nextInt(13);
	//	int suit = rndc.nextInt(4);
		
		
		
		
		
		 
		 
		
		cards1.PlayingCard(rndc1.nextInt(4), rndv1.nextInt(13));
		cards2.PlayingCard(rndc2.nextInt(4), rndv2.nextInt(13));
		
		if ((cards1.getValue() == cards2.getValue()) || 
				(cards1.getSuit() == cards2.getSuit()))
		{
			equale = true;
		}
		else
		{
			equale = false;
		}
		
		if (equale == true)
		System.out.print(cards1.toString() + " and " + cards2.toString() + " match");
		else
			System.out.print(cards1.toString() + " and " + cards2.toString() + " don't match");
		
		
		
		
		
		
		
		
		

	}
	
	
	
	

}
