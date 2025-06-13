import java.util.*;
class wrapperclass5
{ 
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);

		System.out.println("Enter the number1");
		int number1=input.nextInt();

		System.out.println("Enter the number2");
		int number2=input.nextInt();

		//maximun Value Method
		System.out.println("After Maximum Value:"+Integer.max(number1,number2));

		//compare() Method
		System.out.println("After Compare:"+Integer.compare(number1,number2));

		//Minimum Method 
		System.out.println("After Minimum Value:"+Integer.min(number1,number2));

		//Sum Methods
		System.out.println("After Sum:"+Integer.sum(number1,number2));

		System.out.println("Reverse bits of number1: " + Integer.reverse(number1));

        		System.out.println("Value of integer number1: " + Integer.valueOf(number1));

	}
}
		