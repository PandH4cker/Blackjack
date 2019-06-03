import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class BlackJack
{
	private Deck deck;
	private Hand playerHand;
	private Hand bankHand;
	public boolean gameFinished = false;

	public BlackJack()
	{
		this.deck = new Deck(4);
		this.bankHand = new Hand();
		this.playerHand = new Hand();
		try
		{
			this.reset();
		}
		catch(EmptyDeckException ex)
		{
			ex = new EmptyDeckException("Error, the deck has insuffisent cards");
			System.exit(-1);
		}
	}

	public void reset() throws EmptyDeckException
	{
		try
		{
			this.bankHand.clear();
			this.playerHand.clear();
			this.gameFinished = false;
			this.bankHand.add(this.deck.draw());
			this.playerHand.add(this.deck.draw());
			this.playerHand.add(this.deck.draw());
		}
		catch(EmptyDeckException ex)
		{
			System.err.println(ex.getMessage());
			System.exit(-1);
		}
	}

	public String getPlayerHandString()
	{
		return this.playerHand.toString();
	}

	public String getBankHandString()
	{
		return this.bankHand.toString();
	}

	public int getPlayerBest()
	{
		return this.playerHand.best();
	}

	public int getBankBest()
	{
		return this.bankHand.best();
	}

	public boolean isPlayerWinner()
	{
		if(this.isGameFinished() && this.getPlayerBest() <= 21  && (this.getPlayerBest() > this.getBankBest() || this.getBankBest() > 21))
			return true;
		return false;
	}

	public boolean isBankWinner()
	{
		if(this.isGameFinished() && this.getBankBest() <= 21 && (this.getBankBest() > this.getPlayerBest() || this.getPlayerBest() > 21))
			return true;
		return false;
	}

	public boolean isGameFinished()
	{
		if(gameFinished)
			return true;
		return false;
	}

	public void playerDrawAnotherCard() throws EmptyDeckException
	{
		try
		{
			if(!(this.isGameFinished()))
				this.playerHand.add(this.deck.draw());
			if(this.getPlayerBest() > 21)
				gameFinished = true;
		}
		catch(EmptyDeckException ex)
		{
			System.err.println(ex.getMessage());
			System.exit(-1);
		}
	}

	public void bankLastTurn() throws EmptyDeckException
	{
		try
		{
			if(!(this.isGameFinished()) && this.getPlayerBest() <= 21 && this.getBankBest() <= 21)
				while(this.getBankBest() < this.getPlayerBest())
					this.bankHand.add(this.deck.draw());
			gameFinished = true;
		}
		catch(EmptyDeckException ex)
		{
			System.err.println(ex.getMessage());
			System.exit(-1);
		}
	}

	public List<Card> getPlayerCardList()
	{
		List<Card> originalList = playerHand.getCardList();
		LinkedList<Card> copyList = new LinkedList<Card>(originalList);
		return copyList;
	}

	public List<Card> getBankCardList()
	{
		List<Card> originalList = bankHand.getCardList();
		LinkedList<Card> copyList = new LinkedList<Card>(originalList);
		return copyList;
	}
}