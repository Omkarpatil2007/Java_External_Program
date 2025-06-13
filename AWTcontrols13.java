import java.awt.*;
class AWTcontrols13 extends Frame
{
	public AWTcontrols13()
	{
	Label la=new Label("Information");
	la.setBounds(40,40,60,30);
	add(la);

	CheckboxGroup CG=new CheckboxGroup();

	Checkbox C1=new Checkbox("java",true,CG);
	C1.setBounds(40,80,60,30);
	add(C1);
	
	Checkbox C2=new Checkbox("Python",false,CG);
	C2.setBounds(40,120,60,30);
	add(C2);

	Choice Ch=new Choice();
	Ch.setBounds(40,160,100,40);
	Ch.add("Kolhapur");
	Ch.add("Pune");
	Ch.add("Mumbai");
	Ch.add("Nagpur");
	add(Ch);

	List L1=new List(4);
	L1.setBounds(40,200,100,40);
	L1.add("Windows 7");
	L1.add("Windows 8");
	L1.add("Windows 9");
	L1.add("Windows 10");
	add(L1);

	TextArea TA=new TextArea("I am omkar Patil");
	TA.setBounds(40,240,60,30);
	add(TA);

	TextField TF=new TextField("I am From Undarwadi");
	TA.setBounds(40,280,60,30);
	add(TF);

	Button B1=new Button("Submit");
	B1.setBounds(40,300,60,30);
	add(B1);


	setLayout(null);
	setTitle("AWT Controls");
	setVisible(true);
	setSize(500,450);
            }

	public static void main(String []args)
	{
		AWTcontrols13 awt=new AWTcontrols13();
	}	
}
	