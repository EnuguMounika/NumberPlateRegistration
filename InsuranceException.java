public class InsuranceException extends Exception
{
	public String toString()
	{
		return "Registration rejected because Insurance Number should be 9 characters long";
	}
}