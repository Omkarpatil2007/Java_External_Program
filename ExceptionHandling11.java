import java.util.*;
class ExceptionHandling11
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the number1:");
		int number1=input.nextInt();
		
		System.out.println("Enter the number2 is zero:");
		int number2=input.nextInt();

		int result;

		try
		{
			result=number1/number2;
			System.out.println("Result :"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is Divide by zero ");
		}
		finally
		{
			System.out.println("Finally blockis always execute");
		}
	}
}
		
		
		
	