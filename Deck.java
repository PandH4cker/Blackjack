import java.util.LinkedList;
import java.util.Collections;

public class Deck
{
	private LinkedList<Card> cardList = new LinkedList<Card>();

	public Deck(int nbBox)
	{
		for(int i = 0; i < nbBox; i++)
			for(Color c : Color.values())
				for(Value v : Value.values())
					cardList.add(new Card(v,c));
		Collections.shuffle(cardList);
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
		return sb.append(']').toString();
	}

	public Card draw() throws EmptyDeckException
	{
			if(cardList.size() < 1)
				throw new EmptyDeckException("The deck is empty !");
			return cardList.pollFirst();
	}


}