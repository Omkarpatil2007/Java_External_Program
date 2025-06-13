class GrandParent
{
	public void GrandFather()
	{
		System.out.println("I am GrandParent");
	}
}

class Parent extends GrandParent
{
	public void Father()
	{
		System.out.println("I am Father");
	}
}

class Child extends Parent 
{
	public void Son()
	{
		System.out.println("I am Son");
	}
}

class multilevel7
{
	public static void main(String []args)
	{	
	GrandParent Obj1=new GrandParent();
	Parent Obj2=new Parent();
	Child Obj3=new Child();

	Obj1.GrandFather();
	Obj2.Father();
	Obj3.Son();
	}
}