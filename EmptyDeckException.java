import java.lang.Exception;

public class EmptyDeckException extends Exception
{
	public EmptyDeckException(String message)
	{
		super(message);
	}
}