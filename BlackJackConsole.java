import java.util.Scanner;

public class BlackJackConsole
{
	public BlackJackConsole()
	{
		System.out.println("Welcome to the BlackJack table. Let's play !");
		BlackJack blackjack = new BlackJack();
		System.out.println("The bank draw : "+blackjack.getBankHandString());
		System.out.println("Your draw : "+blackjack.getPlayerHandString());
		Scanner sc = new Scanner(System.in);
		while(!(blackjack.isGameFinished()))
		{
			System.out.println("Do you want another card ? [y/n]");
			String str = sc.nextLine();
			char answer = str.charAt(0);
			if(answer == 'y')
			{
				try
				{
					blackjack.playerDrawAnotherCard();
					System.out.println("Your new hand : "+blackjack.getPlayerHandString());
				}
				catch(EmptyDeckException ex)
				{
					System.err.println(ex.getMessage());
					System.exit(-1);
				}

			}
			else if(answer == 'n')
			{
				try
				{
					blackjack.bankLastTurn();
					System.out.println("The bank draw card. New hand : "+ blackjack.getBankHandString());
				}
				catch(EmptyDeckException ex)
				{
					System.err.println(ex.getMessage());
					System.exit(-1);
				}
			}
			else
				System.out.println("Wrong type, please enter y or n");
		}
		System.out.println("Player best : "+blackjack.getPlayerBest());
		System.out.println("Bank best : "+blackjack.getBankBest());
		if(blackjack.isPlayerWinner())
			System.out.println("You won !");
		else if(blackjack.isBankWinner())
			System.out.println("The bank won !");
		else
			System.out.println("Draw !");
		//This is an array of two cards
		/*Card[] tab = { new Card(Value.TWO,Color.HEART), new Card(Value.JACK, Color.SPADE)};
		for(Card c : tab) //For each card
		{
			System.out.println("This card is a "+c+" worth "+c.getPoints()+" points");
			System.out.print("It's a ");
			switch(c.getColorSymbole())
			{
				case "\u2665":
					System.out.print("heart");
				break;
				case "\u2660":
					System.out.print("spade");
				break;
				case "\u2663":
					System.out.print("club");
				break;
				case "\u2666":
					System.out.print("diamond");
				break;
			}
			if(c.getValueSymbole().matches("[JQK]"))
				System.out.println(" and a face !");
			else
				System.out.println(" and it's not a face !");

		}*/

		//Deck deck = new Deck(2);
		/*System.out.println("Here is the deck "+deck+"\n");
		for(int i = 0; i < 3; i++)
		{
			try
			{
				Card c = deck.draw();
				System.out.println("This card is a "+c+" worth "+c.getPoints()+" points");
				System.out.print("It's a ");
				switch(c.getColorSymbole())
				{
					case "\u2665":
						System.out.print("heart");
					break;
					case "\u2660":
						System.out.print("spade");
					break;
					case "\u2663":
						System.out.print("club");
					break;
					case "\u2666":
						System.out.print("diamond");
					break;
				}
				if(c.getValueSymbole().matches("[JQK]"))
					System.out.println(" and a face !");
				else
					System.out.println(" and it's not a face !");
			}*/
	//	Hand hand = new Hand();
		//System.out.println("Your hand is currently : "+hand);
		/*for(int i = 0; i < 3; i++)
		{
			try
			{
				hand.add(deck.draw());
			}

			catch(EmptyDeckException ex)
			{
				System.err.println(ex.getMessage());
				System.exit(-1);
			}
		}
		System.out.println("Your hand is currently : "+hand);
		System.out.println("The best score is: "+ hand.best());
		hand.clear();*/
		//System.out.println("Your hand is currently : "+hand);
	}

	public static void main(String[] Args)
	{
		new BlackJackConsole();
	}
}