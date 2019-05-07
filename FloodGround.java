/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class draws water flooding the ampitheatre for Poseidon and the
   Hippocampi to perform their routine.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to accces Thread class

public class FloodGround extends Thread //FloodGround class
{
    private Console c;

    public void floodGround ()
    {
	c.setColor (Color.blue);
	for (int i = 500 ; i > 350 ; i--) //draws water rising
	{
	    c.drawLine (0, i, 39, i);
	    c.drawLine (81, i, 559, i);
	    c.drawLine (601, i, 640, i);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public FloodGround (Console con) //class constructor
    {
	c = con; //passes output Console
    }


    public void run () //run method
    {
	floodGround ();
    }
}


