/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class draws the main background used during the animation. It is
   an ampitheatre where all the performances will take place. It includes seats for
   spectators, a hydra and a target. As well as two pillars.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class MainBackground //MainBackground class
{
    private Console c; //reference variable for console

    public void draw ()
    {
	//colour declarations
	Color skyColour = new Color (145, 212, 242);
	Color cloudColour = new Color (224, 242, 252);
	Color ampitheatre = new Color (237, 218, 182);
	Color ground = new Color (198, 153, 85);
	Color tanBrown = new Color (224, 179, 107);
	Color stone = new Color (165, 147, 124);
	Color pillar = new Color (247, 206, 170);
	Color face = new Color (249, 197, 119);
	Color vines = new Color (53, 130, 62);
	Color gold = new Color (168, 139, 28);
	Color lightGold = new Color (209, 176, 54);
	Color sunColour = new Color (249, 255, 79);

	c.setColour (skyColour); //draws sky
	for (int x = 0 ; x < 641 ; x++)
	{
	    c.drawRect (0, 0, x, 200);
	}
	c.setColour (sunColour); //draw a sun
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawOval (80 - x / 2, 5, x, 100);
	}
	c.setColour (cloudColour); //draws a cloud
	for (int x = 0 ; x < 51 ; x++)
	{
	    c.drawOval (480 - x / 2, 20, x, 50);
	    c.drawOval (505 - x / 2, 45, x, 50);
	    c.drawOval (520 - x / 2, 5, x, 50);
	    c.drawOval (545 - x / 2, 35, x, 50);
	}


	for (int x = 0 ; x < 801 ; x++) //draws ampitheatre and floor of ampitheatre
	{
	    c.setColour (ampitheatre);
	    c.drawArc (320 - x / 2, 40, x, 520, 0, 180);
	    c.setColour (ground);
	    c.drawArc (320 - x / 2, 200, x, 520, 0, 180);
	}

	for (int x = 0 ; x < 41 ; x++)
	{
	    c.drawLine (0, 460 + x, 640, 460 + x);
	}

	c.setColour (tanBrown); //draws arcs between sections of ampitheatre
	for (int x = 0 ; x < 5 ; x++)
	{
	    c.drawArc (-80, 40 + x * 40, 800, 520, 0, 180);
	}


	for (int x = 0 ; x < 641 ; x = x + 15) //draws spectators seated in ampitheatre
	{
	    int y = (int) Math.round (20.0000 / 20050 * Math.pow (x - 320, 2) + 95);
	    Color spectator = new Color (252 - (int) Math.round (y / 1.5), 152 + y / 2, 65 + (int) Math.round (y / 1.5));
	    for (int d = 0 ; d < 5 ; d++)
	    {
		c.setColor (spectator);
		c.drawRect (x, y, d, 10);
		c.drawRect (x, y + 40, d, 10);
		c.drawRect (x, y + 80, d, 10);
		c.setColour (face);
		c.drawOval (x + 2 - d, y - 10, d * 2, 10);
		c.drawOval (x + 2 - d, y + 30, d * 2, 10);
		c.drawOval (x + 2 - d, y + 70, d * 2, 10);
	    }
	}

	c.setColour (stone); //draws stone perimeter on the ground
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.drawLine (315 + x, 200, 315 + x, 250);
	}
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.drawArc (-80, 250 + x, 800, 520, 0, 180);
	}


	for (int x = 0 ; x < 641 ; x = x + 40) //draws arc windows on ampitheatre wall
	{
	    c.setColour (skyColour);
	    int y = (int) Math.round (20.0000 / 20050 * Math.pow (x - 320, 2) + 45);
	    for (int d = 1 ; d < 21 ; d++)
	    {
		c.drawArc (10 - d / 2 + x, y, d, 40, 0, 180);
	    }
	    c.setColour (tanBrown); //draws window outlines
	    c.drawArc (x, y, 20, 40, 0, 180);
	    c.drawLine (x, y + 20, 20 + x, y + 20);
	}


	c.setColour (pillar); //draws two pillars in front
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.drawLine (40 + x, 0, 40 + x, 500);
	    c.drawLine (560 + x, 0, 560 + x, 500);
	}
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.drawLine (20 + x, 0, 20 + x, 20);
	    c.drawLine (540 + x, 0, 540 + x, 20);
	}
	c.setColour (tanBrown); //draws pillar outlines
	c.drawLine (40, 20, 40, 500);
	c.drawLine (80, 20, 80, 500);
	c.drawLine (560, 20, 560, 500);
	c.drawLine (600, 20, 600, 500);
	c.drawLine (20, 0, 20, 20);
	c.drawLine (100, 0, 100, 20);
	c.drawLine (540, 0, 540, 20);
	c.drawLine (620, 0, 620, 20);
	c.drawLine (20, 20, 40, 20);
	c.drawLine (80, 20, 100, 20);
	c.drawLine (540, 20, 560, 20);
	c.drawLine (600, 20, 620, 20);

	//lyre
	c.setColor (lightGold);
	for (int x = 0 ; x < 8 ; x++)
	{
	    c.drawLine (573, 102 + x, 589, 102 + x);
	}
	for (int x = 0 ; x < 6 ; x++)
	{
	    c.drawLine (574 + x, 140, 574 + x, 102);
	    c.drawLine (587 - x, 140, 587 - x, 102);
	}
	c.setColor (gold);
	for (int x = 32 ; x < 40 ; x++)
	{
	    c.drawArc (580 - x / 2, 120 - x / 2, x, x, 180, 180);
	}

	for (int x = 32 ; x < 40 ; x++)
	{
	    c.drawArc (574 - (x - 12) / 2, 120 - x / 2, x - 12, x, 110, 70);
	    c.drawArc (587 - (x - 12) / 2, 120 - x / 2, x - 12, x, 0, 70);
	}
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.drawOval (573 - x / 2, 106 - x / 2, x, x);
	    c.drawOval (589 - x / 2, 106 - x / 2, x, x);
	}


	//vines
	c.setColor (vines);
	c.drawArc (39, 100, 42, 20, 170, 180);
	c.drawArc (-1, 30, 82, 160, 270, 90);
	c.drawArc (40, 16, 82, 200, 180, 90);
	c.drawArc (39, 5, 72, 100, 180, 100);
	c.drawArc (39, 80, 42, 20, 200, 180);
	//leaves
	for (int x = 0 ; x <= 8 ; x++)
	{
	    c.drawOval (40, 124 - x / 2, 16, x);
	    c.drawOval (61, 144 - x / 2, 16, x);
	    c.drawOval (67 - x / 2, 84, x, 16);
	    c.drawOval (46, 164 - x / 2, 16, x);
	}

	//draws target
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
	c.setColor (Color.orange);
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.drawLine (521, 410, 521 + x, 455 - x / 2);
	}


	//draws Hydra
	c.setColor (Color.green);
	for (int x = 0 ; x < 60 ; x++) //body
	{
	    c.drawLine (110 + x, 270, 120 + (int) Math.round (x / 1.5), 300);
	}
	for (int x = 0 ; x <= 10 ; x++) //necks
	{
	    c.drawLine (110 + x, 270, 105 + x, 245);
	    c.drawLine (170 - x, 270, 175 - x, 245);
	    c.drawLine (135 + x, 270, 135 + x, 245);
	}
	for (int x = 0 ; x <= 18 ; x++) //heads
	{
	    c.drawOval (108 - x / 2, 238, x, 10);
	    c.drawOval (140 - x / 2, 238, x, 10);
	    c.drawOval (172 - x / 2, 238, x, 10);
	}
	for (int x = 0 ; x <= 20 ; x++) //tail
	{
	    c.drawLine (200, 300, 160, 300 - x);
	}
	c.setColor (Color.black); //eyes
	c.drawOval (105, 242, 2, 2);
	c.drawOval (136, 242, 2, 2);
	c.drawOval (142, 242, 2, 2);
	c.drawOval (173, 242, 2, 2);
	c.drawArc (190, 294, 3, 8, 270, 220);
	c.drawLine (193, 294, 250, 263);

    }


    public MainBackground (Console con)  //class constructor
    {
	c = con; //passes output console
	draw (); //calls draw method
    }
}
