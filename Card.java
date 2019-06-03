public class Card
{
	private Value value;
	private Color color;

	public Card(Value value, Color color)
	{
		this.value = value;
		this.color = color;
	}

	public String toString()
	{
		return this.getValueSymbole()+this.getColorSymbole();
	}

	public String getColorSymbole()
	{
		return this.color.getSymbole();
	}

	public String getColorName()
	{
		return this.color.name();
	}

	public String getValueSymbole()
	{
		return this.value.getSymbole();
	}

	public int getPoints()
	{
		return this.value.getPoints();
	}
}