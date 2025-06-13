class 	MethodoverLoading20
{
	public void OverLoading()
	{
		System.out.println("I am Omkar");
	}

	public int OverLoading(int number1,int number2)
	{
		return (number1 + number2);
	}

	public int OverLoading(float number3,int number4)
	{
		return (int) (number3 + number4);
	}

	public static void main(String []args)
	{
		MethodoverLoading20 MO=new MethodoverLoading20();
		MO.OverLoading();
		int a=MO.OverLoading(10,12);
		int b=MO.OverLoading(45.6f,18);
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
			