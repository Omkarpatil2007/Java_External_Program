import java.awt.*;
class BorderLayout23 extends Frame
{	
	Button b1,b2,b3,b4,b5;
	public BorderLayout23()
	{
		setLayout(new BorderLayout());

		b1=new Button ("North");
		add(b1,BorderLayout.NORTH);

		b2=new Button("West");
		add(b2,BorderLayout.WEST);

		b3 =new Button("Center");
		add(b3,BorderLayout.CENTER);

		b4=new Button("East");
		add(b4,BorderLayout.EAST);		
	
		b5=new Button("South");
		add(b5,BorderLayout.SOUTH);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new BorderLayout23();
	}
}