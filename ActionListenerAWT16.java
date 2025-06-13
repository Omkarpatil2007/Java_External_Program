import java.awt.*;
import java.awt.event.*;

public class ActionListenerAWT16 extends Frame implements ActionListener
{
	Label L1;
	TextField TF;
	Button B1;

	public ActionListenerAWT16()
	{
		L1=new Label("Enter text and click the button:");
		L1.setBounds(50,50,250,30);

		TF=new TextField();
		TF.setBounds(50,100,100,30);

		B1=new Button("Submit");
		B1.setBounds(30,150,80,30);

		B1.addActionListener(this);

		add(L1);
		add(TF);
		add(B1);

		setVisible(true);
	
		setSize(250,300);
		setTitle("ActionListener");
	}

	public void actionPerformed(ActionEvent e)
	{
		L1.setText("You Entered:"+TF.getText());
	}
	
	public static void main(String []args)
	{
		ActionListenerAWT16 awt=new ActionListenerAWT16();
	}
}

