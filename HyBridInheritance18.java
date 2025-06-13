class Grandparent
{
	Grandparent()
	{
		System.out.println("my Son is Ram and Sham");
	}
}

class Parent1 extends Grandparent
{
	Parent1()
	{
		System.out.println("I am Ram");
	}
}

class Parent2 extends Grandparent
{
	Parent2()
	{
		System.out.println("I am Sham");
	}
}

class Son1 extends Parent1
{
	void Son1()
	{
		System.out.println("My father is Ram");
	}
}

class Son2 extends Parent2
{
	void Son2()
	{
		System.out.println("My father is Sham");
	}
}
class HyBridInheritance18
{
     public static void main(String []args)
     {
	Son1 S1=new Son1();
	Son2 S2=new Son2();

	S1.Son1();
	S2.Son2();
     }
}


