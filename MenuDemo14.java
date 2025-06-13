import java.awt.*;
class MenuDemo14 extends Frame
{
	public MenuDemo14()
	{
	MenuBar MB=new MenuBar();
	setMenuBar(MB);

	Menu Color=new Menu("Color");
	MB.add(Color);

	MenuItem M1=new MenuItem("Red");
	Color.add(M1);

	MenuItem M2=new MenuItem("Orange");
	Color.add(M2);

	MenuItem M3=new MenuItem("Black");
	Color.add(M3);
	M3.setEnabled(false);

	MenuItem M4=new MenuItem("Green");
	Color.add(M4);

	setVisible(true);
	setSize(300,200);
	}
		
	public static void main(String[]args)
	{
		MenuDemo14 MD=new MenuDemo14();
	}
}
		