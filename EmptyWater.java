/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class removes the water from the ampitheatre and returns it to 
   its regular state.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class EmptyWater extends Thread //EmptyWater class
{
    private Console c; //console referance
 
    public void emptyWater ()
    {
//colour declrations
	Color ground = new Color (198, 153, 85);
	Color stone = new Color (165, 147, 124);
	for (int i = 349 ; i <= 500 ; i++)
	{
	    c.setColor (ground); //erase water
	    c.drawLine (0, i, 39, i);
	    c.setColor (ground);
	    c.drawLine (80, i, 559, i);
	    c.setColor (ground);
	    c.drawLine (601, i, 640, i);
	    for (int x = 0 ; x < 10 ; x++)
	    {
		c.setColor (stone); //redraw stone perimeter
		c.drawArc (-80, 250 + x, 800, 520, 135, 45);
		c.drawArc (-80, 250 + x, 800, 520, 0, 45);
	    }
	    //redraw target
	    c.setColor (Color.white);
	    for (int x = 0 ; x <= 80 ; x++)
	    {
		c.drawLine (440, 370 + x, 520, 390 + x);
	    }
	    c.setColor (Color.red);
	    for (int x = 0 ; x <= 55 ; x++)
	    {
		c.drawLine (450, 385 + x, 510, 400 + x);
	    }
	    c.setColor (Color.cyan);
	    for (int x = 0 ; x <= 30 ; x++)
	    {
		c.drawLine (460, 400 + x, 500, 410 + x);
	    }
	    c.setColor (Color.red);
	    for (int x = 0 ; x < 17 ; x++)
	    {
		c.drawOval (480 - x / 2, 412, x, 16);
	    }
	    for (int x = 0 ; x < 20 ; x++)
	    {
		c.setColor (Color.orange);
		c.drawLine (521, 410, 521 + x, 455 - x / 2);
	    }
	    for (int x = i + 1 ; x <= 500 ; x++)
	    {
		c.setColor (Color.blue); //draw water as it recedes
		c.drawLine (0, x, 39, x);
		c.setColor (Color.blue);
		c.drawLine (82, x, 559, x);
		c.setColor (Color.blue);
		c.drawLine (601, x, 640, x);
	    }
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public EmptyWater (Console con)//class constructor
    {
	c = con; //passes console
    }


    public void run () //run method
    {
	emptyWater ();
    }
}


