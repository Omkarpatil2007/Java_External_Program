interface Omkar
{
	void Display1();
}

interface Shubham
{
	void Display2();
}

class MultipleInheritance implements Omkar,Shubham
{
	public void Display1()
	{
		System.out.println("I am Omkar");
	}
 \
	public void Display2()
	{
		System.out.println("I am Shubham");
	}
}

public class MultipleInheritance8
{
	public static void main(String []args)
	{
		MultipleInheritance MI=new MultipleInheritance();
		MI.Display1();
		MI.Display2();
	}
}