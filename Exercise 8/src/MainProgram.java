import java.util.List;
import java.util.Random;

public class MainProgram
{

	public static void main(String[] args)
	{
		boolean equale;
		Driver cards1 = new Driver();
		Driver cards2 = new Driver();
		
		Random rnd = new Random();
	//	Random rndc2 = new Random();
	//	Random rndv1 = new Random();
	//	Random rndv2 = new Random();
		
	//	int value = rndc.nextInt(13);
	//	int suit = rndc.nextInt(4);
		
		
		
		
		
		 
		 
		
		cards1.PlayingCard(rnd.nextInt(4) + 1, rnd.nextInt(13) + 1);
		cards2.PlayingCard(rnd.nextInt(4) + 1, rnd.nextInt(13) + 1);
		
		if ((cards1.getValue().equals(cards2.getValue()) || 
				(cards1.getSuit().equals(cards2.getSuit()))))
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
