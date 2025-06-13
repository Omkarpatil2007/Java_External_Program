import java.awt.*;
import java.awt.event.*;

public class ItemListenerAWT17 extends Frame implements ItemListener
{
	Label L1;
	Checkbox C1;
	
	public ItemListenerAWT17()
	{
		L1=new Label("Check the box:");
		L1.setBounds(50,100,200,40);
		
		C1=new Checkbox("Accept term");
		C1.setBounds(100,250,100,40);

		C1.addItemListener(this);
		
		add(L1);
		add(C1);
		setVisible(true);
		
		setSize(300,300);
		setTitle("ItemListener");
	}

	public void itemStateChanged(ItemEvent e)
	{
	if(C1.getState())
	{
		L1.setText("Checkbox is Checked");
	}
	else
	{
		L1.setText("Checkbox is UnChecked");
	}
	}
	
	public static void main(String[] args) 
    	{
       		 new ItemListenerAWT17();
    	}
}