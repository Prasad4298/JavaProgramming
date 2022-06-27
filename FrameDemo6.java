// this Frame is responsible	with event (Driven) handling

import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Demo
{
	public String DataDe()
	{
		return "Jay Ganesh......!";
	}
}

class MarvellousFrame extends WindowAdapter implements ActionListener
{
	public Frame fobj;
	public Button bobj;
	public TextField tobj;

	public MarvellousFrame(String name)
	{
		fobj = new Frame(name);	

		bobj = new Button("Marvellous");
		tobj = new TextField();

		tobj.setBounds(60,60,170,20);		// x, y coordinate and width and height
		bobj.setBounds(110,130,90,20);

		fobj.add(bobj);
		fobj.add(tobj);	

		fobj.setSize(600,600);
		fobj.setVisible(true);
		fobj.setLayout(null);		

		bobj.addActionListener(this);
		fobj.addWindowListener(this);
	}

	public void windowClosing(WindowEvent obj)
	{
		System.exit(0);
	}

	public void actionPerformed(ActionEvent obj)
	{
		Demo dobj = new Demo();
		String str = dobj.DataDe();

		//System.out.println(str);
		tobj.setText(str);
	}	
}

class FrameDemo6
{
	public static void main(String arg[])
	{				
		MarvellousFrame mobj = new MarvellousFrame("PPA");
	}
}