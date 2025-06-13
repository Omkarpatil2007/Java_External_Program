import java.awt.*;
public class fiveoffive extends Frame
{
   
    public fiveoffive()
  { 

   GridLayout grid=new GridLayout(5,5); 
    
     for(int i=1;i<=5;i++)
     {
        for(int j=1;j<=5;j++)
        {
           add(new Button("Button"+i*j));
        }
     }

   setVisible(true);
   setTitle("Five of Five Grid");
   setSize(400,500);
   setLayout(grid);
  }


 public static void main(String ar[])
  {
     fiveoffive f=new fiveoffive();
  }
}