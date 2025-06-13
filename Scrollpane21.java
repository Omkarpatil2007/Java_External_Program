import java.awt.*;
class Scrollpane21 extends Frame
{
	public Scrollpane21()
	{	
		TextArea textarea=new TextArea();

		ScrollPane scrollpane=new ScrollPane();
		scrollpane.add(textarea);

		textarea.setText("I am Omkar patil");
		add(scrollpane);
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[]args)
	{
		new Scrollpane21();
	}
}