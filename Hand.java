import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Hand
{
	private LinkedList<Card> cardList;

	public Hand()
	{
		this.cardList = new LinkedList<Card>();
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		int i = 0;
		for(Card c : this.cardList)
		{
			if(i != this.cardList.size() - 1)
				sb.append(c+", ");
			else
				sb.append(c);
			i++;
		}
		i = 0;
		sb.append("] : [");
		for(int value : this.count())
		{
			if(i != this.count().size() - 1)
				sb.append(value+", ");
			else
				sb.append(value);
			i++;
		}
		return sb.append(']').toString();
	}

	public void add(Card card)
	{
		this.cardList.add(card);
	}

	public void clear()
	{
		this.cardList.clear();
	}

	public List<Integer> count()
	{
		List<Integer> resultat = new ArrayList<Integer>();
		resultat.add(0);
		for(Card c : this.cardList)
		{
			int size = resultat.size();
			for(int i = 0; i < size; i++)
			{
				int val = resultat.get(i);
				resultat.set(i, val+c.getPoints());
				if(c.getPoints() == 1)
					resultat.add(val+11);
			}
		}
		return resultat;
	}

	public int best()
	{
		List<Integer> resultat = new ArrayList<Integer>();
		resultat = this.count();
		int bestScore = 0;
		for(int score : resultat)
		{
			if(score > bestScore && score <= 21)
				bestScore = score;
		}
		if(bestScore == 0)
			for(int score : resultat)
				if(score > bestScore)
					bestScore = score;
		return bestScore;
	}

	public List<Card> getCardList()
	{
		return this.cardList;
	}

}