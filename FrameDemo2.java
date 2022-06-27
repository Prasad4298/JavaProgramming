// this frame is non responsive

import java.lang.*;
import java.awt.*;

class MarvellousFrame
{
	public Frame fobj;

	public MarvellousFrame(String name)
	{
		fobj = new Frame(name);		// GUI
		fobj.setSize(600,600);
		fobj.setVisible(true);		// frame visible honyasathi ha Syntax
	}
}

class FrameDemo2
{
	public static void main(String arg[])
	{
		System.out.println("Print the data on console");		// CUI
		
		MarvellousFrame mobj = new MarvellousFrame("PPA");
	}
}