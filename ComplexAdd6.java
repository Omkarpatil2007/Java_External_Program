class ComplexAdd
{
	Double number1,number2;
	ComplexAdd(Double num1,Double num2)
	{
		number1=num1;
		number2=num2;
	}

	ComplexAdd()
	{
		number1=0.0;
		number2=0.0;
	}
	
	void Display()
	{
		System.out.println(number1+"+i"+number2);
	}

	ComplexAdd add(ComplexAdd Num1)
	{
		ComplexAdd CA=new ComplexAdd();
		CA.number1=number1+Num1.number1;
		CA.number2=number2+Num1.number2;
		return(CA);
	}
}

class ComplexAdd6
{
	public static void main(String[]args)
	{
		ComplexAdd Num1=new ComplexAdd(12.5,2.5);
		ComplexAdd Num2=new ComplexAdd(9.5,3.4);

		Num1.Display();
		Num2.Display();

		ComplexAdd Num3=new ComplexAdd();
		Num3=Num1.add(Num2);
		Num3.Display();
	}
}



		