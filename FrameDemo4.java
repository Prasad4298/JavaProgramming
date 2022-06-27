// this Frame is responsible	with event (Driven) handling

import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
	public Frame fobj;

	public MarvellousFrame(String name)
	{
		fobj = new Frame(name);		
		fobj.setSize(600,600);		// dimension in pixel
		fobj.setVisible(true);		

		fobj.addWindowListener(new MarvellousListener());
	}
}

class MarvellousListener extends WindowAdapter		//  implements WindowListener
{
	public void windowClosing(WindowEvent obj)
	{
		//System.out.println("Inside windowEven");
		System.exit(0);
	}	
}

class FrameDemo4
{
	public static void main(String arg[])
	{
		System.out.println("Print the data on console");		
		
		MarvellousFrame mobj = new MarvellousFrame("PPA");
	}
}