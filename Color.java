public enum Color
{
	HEART("\u2665"),SPADE("\u2660"),CLUB("\u2663"),DIAMOND("\u2666");

	private String symbole;

	private Color(String symbole)
	{
		this.symbole = symbole;
	}

	public String getSymbole()
	{
		return this.symbole;
	}
}