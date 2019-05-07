/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class is draws the introduction background and outputs an
   introduction message that introduces the animation. The background includes
   hills, a textbox and a ancient greek ampitheatre seen from far away.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class IntroBackground //IntroBackground class
{
    private Console c; //reference variable for Console class

    public static void delay (int milliseconds)  //method used to delay the animation
    {
	try
	{
	    Thread.sleep (milliseconds); //allows you to pass an integer value for the delay in milliseconds
	}
	catch (Exception e)
	{
	}

    }


    //method that draws the background
    public void draw ()
    {
	//colour declarations
	Color skyColour = new Color (145, 212, 242);
	Color cloudColour = new Color (224, 242, 252);
	Color ampitheatre = new Color (237, 218, 182);
	Color lightGreen = new Color (205, 252, 95);
	Color greyShadow = new Color (206, 168, 107);
	Color darkGreen = new Color (106, 216, 65);
	Color tanBrown = new Color (224, 179, 107);
	Color sunColour = new Color (249, 255, 79);
	Color waterColour = new Color (34, 140, 193);
	Color forestGreen = new Color (45, 96, 34);
	Color darkBrown = new Color (79, 42, 11);
	Color gold = new Color (255, 215, 0);
	Color pink = new Color (255, 158, 171);
	Color violet = new Color (225, 137, 255);
	Color curtainRed = new Color (147, 0, 12);
	//variable declaration for colour positioning
	int flowerX, flowerY;
	//declaration of string array used to output text introduction
	String introText[] = {"Every year", "the Olympians gather", "for a feast", "and celebration.", "The time has come", "for the..."};
	String printedString; //variable used for string output

	//draw commands
	c.setColour (skyColour); //draws sky
	for (int x = 0 ; x < 641 ; x++)
	{
	    c.drawRect (0, 0, x, 500);
	}
	c.setColour (lightGreen); //draws side hills
	for (int x = 0 ; x < 300 ; x++)
	{
	    c.drawArc (560 - x / 2, 200, x, 680, 0, 180);
	    c.drawArc (80 - x / 2, 200, x, 680, 0, 180);
	}

	c.setColour (pink); //randomly draws pink flowers on hill
	for (int x = 0 ; x < 30 ; x++)
	{
	    flowerX = (int) (Math.random () * 131);
	    flowerY = (int) (Math.random () * 301 + 245);
	    for (int y = 0 ; y < 7 ; y++)
	    {
		c.drawOval (flowerX - y / 2, flowerY, y, 6);
	    }
	}

	c.setColour (violet); //randomly draws purple flowers on hill
	for (int x = 0 ; x < 30 ; x++)
	{
	    flowerX = (int) (Math.random () * 131 + 510);
	    flowerY = (int) (Math.random () * 301 + 245);
	    for (int y = 0 ; y < 7 ; y++)
	    {
		c.drawOval (flowerX - y / 2, flowerY, y, 6);
	    }
	}


	c.setColour (darkGreen); //draws central hill
	for (int x = 0 ; x < 421 ; x++)
	{
	    c.drawArc (320 - x / 2, 100, x, 950, 0, 180);
	}
	c.setColour (ampitheatre); //draws ampitheatre on hill
	for (int x = 0 ; x < 101 ; x++)
	{
	    c.drawRect (220, 80, 200, x);
	}
	for (int x = 0 ; x < 201 ; x++)
	{
	    c.drawLine (320, 20, 220 + x, 80);
	}
	c.setColour (greyShadow); //draws darker shadow within the ampitheatre
	for (int x = 0 ; x < 5 ; x++)
	{
	    for (int y = 0 ; y < 81 ; y++)
	    {
		c.drawRect (230 + x * 38, 90, 28, y);
	    }
	}

	//draws lines on ampitheatre
	c.setColour (tanBrown);
	c.drawLine (320, 30, 230, 80);
	c.drawLine (320, 30, 410, 80);
	c.drawLine (230, 80, 410, 80);

	c.setColour (cloudColour); //draws a cloud
	for (int x = 0 ; x < 51 ; x++)
	{
	    c.drawOval (500 - x / 2, 100, x, 50);
	    c.drawOval (525 - x / 2, 125, x, 50);
	    c.drawOval (540 - x / 2, 85, x, 50);
	    c.drawOval (565 - x / 2, 115, x, 50);
	}

	c.setColour (sunColour); //draw a sun
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawOval (80 - x / 2, 50, x, 100);
	}

	c.setColour (waterColour); //draws little pond and river
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawOval (380 - x / 2, 210, x, 80);
	}
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.drawLine (340 + x, 181, 360 + x, 230);
	}

	c.setColour (darkBrown); //draws tree trunks
	for (int x = 0 ; x < 6 ; x++)
	{
	    c.drawLine (247 + x, 215, 247 + x, 235);
	    c.drawLine (217 + x, 245, 217 + x, 265);
	    c.drawLine (287 + x, 255, 287 + x, 275);
	}

	c.setColour (forestGreen); //draws tree leaves
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.drawOval (250 - x / 2, 200, x, 15);
	    c.drawOval (220 - x / 2, 230, x, 15);
	    c.drawOval (290 - x / 2, 240, x, 15);
	}

	c.setColour (Color.white); //draws text box
	for (int x = 0 ; x < 351 ; x++)
	{
	    c.drawLine (145 + x, 400, 145 + x, 470);
	}

	c.setColour (gold); //draws outline of text box
	for (int x = 0 ; x < 21 ; x++)
	{
	    c.drawLine (163, 396, 141, 396 + x);
	    c.drawLine (477, 396, 499, 396 + x);
	    c.drawLine (163, 474, 141, 474 - x);
	    c.drawLine (477, 474, 499, 474 - x);
	}


	c.setFont (new Font ("Copperplate Gothic Bold", 0, 25));
	//for loop that outputs introduction text
	for (int x = 0 ; x < 6 ; x++)
	{
	    c.setColour (gold);
	    printedString = introText [x];
	    c.drawString (printedString, 320 - printedString.length () * 16 / 2, 440);
	    delay (1500);
	    c.setColour (Color.white);
	    c.fillRect (320 - printedString.length () * 16 / 2, 420, printedString.length () * 16, 21);
	}
	
	//draws curtains that cover the scene
	c.setColor (curtainRed);
	for (int x = 0 ; x < 321 ; x++)
	{
	    c.drawLine (x, 0, x, 500);
	    c.drawLine (640 - x, 0, 640 - x, 500);
	    delay (5);
	}
	
	//draws title and name on screen
	c.setColour (gold);
	c.setFont (new Font ("Elephant", 0, 25));
	c.drawString ("The Mount Olympus", 204, 230);
	c.drawString ("Talent Show", 252, 260);
	c.setFont (new Font ("Arial", 0, 18));
	c.drawString ("Maria Yampolsky", 20, 480);
	delay (2000);


    }


    public IntroBackground (Console con)
    {
	c = con; //constructor passes console and calls draw method
	draw ();
    }
}
