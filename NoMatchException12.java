import java.util.*;
class NoMatchException extends Exception
{
	public NoMatchException(String s)
	{
		super(s);
	}
}

class NoMatchException12 
{
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		String Str1="India";

		System.out.println("enter the String");
		String Str2=input.nextLine();
	
		try
		{
		if(!Str2.equals(Str1))
		{
			throw new NoMatchException("String is not equals to India");
		}
		else
		{
			System.out.println("String is equals to India");
		}
		}
		catch(NoMatchException e)
		{
			System.out.println(e.getMessage());
		}
	}
}