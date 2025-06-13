class VotingOmkar extends Thread
{
	public void run()
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println("My vote is Omkar:"+i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

class VotingRam extends Thread
{
	public void run()
	{
		for(int j=1; j<=10; j++)
		{
			System.out.println("My vote is Ram:"+j);

			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

class Multithread10
{
	public static void main (String[]args)
	{
		VotingOmkar obj1=new VotingOmkar();
		VotingRam obj2=new VotingRam();

		obj1.start();
		obj2.start();
	}
}