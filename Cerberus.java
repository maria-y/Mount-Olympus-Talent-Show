/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class animates cerberus, a 3 headed dog who guards
   the entrance to the Underworld. Cerberus performers a song and dance with Hades
   and enters alongside him from the left part of the screen.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Cerberus extends Thread //Cerberus class
{
    private Console c; //Console referance

    public void cerberus ()
    {
	//Colour declaration
	Color cerberus = new Color (91, 61, 55);
	Color darkFur = new Color (81, 51, 45);
	Color ground = new Color (198, 153, 85);
	Color tanBrown = new Color (224, 179, 107);
	Color pillar = new Color (247, 206, 170);
	for (int i = -450 ; i <= -20 ; i++) //this for loop is his entrance from the left
	{
	    c.setColor (ground); //ground erase
	    c.fillRect (299 + i, 399, 75, 84);

	    c.setColor (darkFur);
	    c.fillRect (310 + i, 445, 10, 33); //draw back leg
	    c.setColor (darkFur);
	    c.fillOval (310 + i, 475, 16, 8); //draw foot
	    c.setColor (darkFur);
	    c.fillRect (310 + i, 445, 35, 18); //draw back body
	    int[] ear1X = {306 + i, 318 + i, 312 + i};
	    int[] ear1Y = {418, 418, 408};
	    int[] ear2X = {374 + i, 362 + i, 368 + i};
	    int[] ear2Y = {418, 418, 408};
	    int[] ear3X = {331 + i, 342 + i, 336 + i};
	    int[] ear3Y = {408, 408, 398};
	    int[] ear4X = {349 + i, 338 + i, 344 + i};
	    int[] ear4Y = {408, 408, 398};
	    //draw four ears
	    c.setColor (cerberus);
	    c.fillPolygon (ear1X, ear1Y, 3);
	    c.setColor (cerberus);
	    c.fillPolygon (ear2X, ear2Y, 3);
	    c.setColor (cerberus);
	    c.fillPolygon (ear3X, ear3Y, 3);
	    c.setColor (cerberus);
	    c.fillPolygon (ear4X, ear4Y, 3);
	    //draw heads
	    c.setColor (cerberus);
	    c.fillOval (300 + i, 415, 24, 22);
	    c.setColor (cerberus);
	    c.fillOval (328 + i, 405, 24, 22);
	    c.setColor (cerberus);
	    c.fillOval (356 + i, 415, 24, 22);
	    //draw polygon for all three necks
	    int necksX[] = {312 + i, 324 + i, 332 + i, 332 + i, 348 + i, 348 + i, 356 + i, 368 + i, 356 + i, 324 + i};
	    int necksY[] = {437, 426, 436, 425, 425, 436, 426, 437, 448, 448};
	    c.setColor (cerberus);
	    c.fillPolygon (necksX, necksY, 10);
	    //draw front body
	    c.setColor (cerberus);
	    c.fillArc (324 + i, 430, 32, 36, 180, 180);
	    //draw tail
	    c.setColor (cerberus);
	    c.fillArc (300 + i, 445, 20, 30, 90, 180);
	    //draw legs
	    c.setColor (cerberus);
	    c.fillRect (325 + i, 448, 10, 30);
	    c.setColor (cerberus);
	    c.fillRect (345 + i, 448, 10, 30);
	    //draw feet
	    c.setColor (cerberus);
	    c.fillOval (325 + i, 475, 16, 8);
	    c.setColor (cerberus);
	    c.fillOval (345 + i, 475, 16, 8);
	    //draw eyes
	    c.setColor (Color.white);
	    c.fillOval (308 + i, 420, 6, 6);
	    c.setColor (Color.white);
	    c.fillOval (332 + i, 410, 6, 6);
	    c.setColor (Color.white);
	    c.fillOval (342 + i, 410, 6, 6);
	    c.setColor (Color.white);
	    c.fillOval (366 + i, 420, 6, 6);
	    c.setColor (Color.black);
	    c.fillOval (309 + i, 423, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (333 + i, 413, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (343 + i, 413, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (367 + i, 423, 4, 4);
	    //noses
	    c.setColor (Color.black);
	    c.fillRect (300 + i, 425, 4, 4);
	    c.setColor (Color.black);
	    c.fillRect (338 + i, 418, 4, 4);
	    c.setColor (Color.black);
	    c.fillRect (376 + i, 425, 4, 4);
	    //re draws pillar
	    c.setColour (pillar);
	    c.fillRect (40, 398, 40, 85);
	    c.setColor (tanBrown);
	    c.drawLine (40, 20, 40, 500);
	    c.setColor (tanBrown);
	    c.drawLine (80, 20, 80, 500);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int y = 0 ; y < 10 ; y++) //this for loop makes cerberus move left to right to dance
	{

	    for (int i = -10 ; i >= -15 ; i--) //move left
	    {
		c.setColor (ground); //ground erase
		c.fillRect (289 + i, 399, 82, 84);
		c.setColor (darkFur);
		c.fillRect (300 + i, 445, 10, 33); //draw back leg
		c.setColor (darkFur);
		c.fillOval (300 + i, 475, 16, 8); //draw foot
		c.setColor (darkFur);
		c.fillRect (300 + i, 445, 35, 18); //draw back body
		int[] ear1X = {296 + i, 308 + i, 302 + i};
		int[] ear1Y = {418, 418, 408};
		int[] ear2X = {364 + i, 352 + i, 358 + i};
		int[] ear2Y = {418, 418, 408};
		int[] ear3X = {321 + i, 332 + i, 326 + i};
		int[] ear3Y = {408, 408, 398};
		int[] ear4X = {339 + i, 328 + i, 334 + i};
		int[] ear4Y = {408, 408, 398};
		//draw four ears
		c.setColor (cerberus);
		c.fillPolygon (ear1X, ear1Y, 3);
		c.setColor (cerberus);
		c.fillPolygon (ear2X, ear2Y, 3);
		c.setColor (cerberus);
		c.fillPolygon (ear3X, ear3Y, 3);
		c.setColor (cerberus);
		c.fillPolygon (ear4X, ear4Y, 3);
		c.setColor (cerberus);
		//draw heads
		c.fillOval (290 + i, 415, 24, 22);
		c.setColor (cerberus);
		c.fillOval (318 + i, 405, 24, 22);
		c.setColor (cerberus);
		c.fillOval (346 + i, 415, 24, 22);
		int necksX[] = {302 + i, 314 + i, 322 + i, 322 + i, 338 + i, 338 + i, 346 + i, 358 + i, 346 + i, 314 + i};
		int necksY[] = {437, 426, 436, 425, 425, 436, 426, 437, 448, 448};
		c.setColor (cerberus);
		//draw polygon for all three necks
		c.fillPolygon (necksX, necksY, 10);
		c.setColor (cerberus); //draw front body
		c.fillArc (314 + i, 430, 32, 36, 180, 180);
		c.setColor (cerberus); //draw tail
		c.fillArc (290 + i, 445, 20, 30, 90, 180);
		c.setColor (cerberus); //draw legs
		c.fillRect (315 + i, 448, 10, 30);
		c.setColor (cerberus);
		c.fillRect (335 + i, 448, 10, 30);
		c.setColor (cerberus); //draw feet
		c.fillOval (315 + i, 475, 16, 8);
		c.setColor (cerberus);
		c.fillOval (335 + i, 475, 16, 8);
		c.setColor (Color.white); //draw eyes
		c.fillOval (298 + i, 420, 6, 6);
		c.setColor (Color.white);
		c.fillOval (322 + i, 410, 6, 6);
		c.setColor (Color.white);
		c.fillOval (332 + i, 410, 6, 6);
		c.setColor (Color.white);
		c.fillOval (356 + i, 420, 6, 6);
		c.setColor (Color.black);
		c.fillOval (299 + i, 423, 4, 4);
		c.setColor (Color.black);
		c.fillOval (323 + i, 413, 4, 4);
		c.setColor (Color.black);
		c.fillOval (333 + i, 413, 4, 4);
		c.setColor (Color.black);
		c.fillOval (357 + i, 423, 4, 4);
		//noses
		c.setColor (Color.black);
		c.fillRect (290 + i, 425, 4, 4);
		c.setColor (Color.black);
		c.fillRect (328 + i, 418, 4, 4);
		c.setColor (Color.black);
		c.fillRect (366 + i, 425, 4, 4);

		try
		{
		    Thread.sleep (60);
		}
		catch (Exception e)
		{
		}
	    }
	    for (int i = -15 ; i <= -10 ; i++) //this for loop makes him move right
	    {
		c.setColor (ground); //ground erase
		c.fillRect (289 + i, 399, 82, 84);
		c.setColor (darkFur);
		c.fillRect (300 + i, 445, 10, 33); //draw back leg
		c.setColor (darkFur);
		c.fillOval (300 + i, 475, 16, 8); //draw foot
		c.setColor (darkFur);
		c.fillRect (300 + i, 445, 35, 18); //draw back body
		int[] ear1X = {296 + i, 308 + i, 302 + i};
		int[] ear1Y = {418, 418, 408};
		int[] ear2X = {364 + i, 352 + i, 358 + i};
		int[] ear2Y = {418, 418, 408};
		int[] ear3X = {321 + i, 332 + i, 326 + i};
		int[] ear3Y = {408, 408, 398};
		int[] ear4X = {339 + i, 328 + i, 334 + i};
		int[] ear4Y = {408, 408, 398};
		c.setColor (cerberus); //draw four ears
		c.fillPolygon (ear1X, ear1Y, 3);
		c.setColor (cerberus);
		c.fillPolygon (ear2X, ear2Y, 3);
		c.setColor (cerberus);
		c.fillPolygon (ear3X, ear3Y, 3);
		c.setColor (cerberus);
		c.fillPolygon (ear4X, ear4Y, 3);
		c.setColor (cerberus); //draw heads
		c.fillOval (290 + i, 415, 24, 22);
		c.setColor (cerberus);
		c.fillOval (318 + i, 405, 24, 22);
		c.setColor (cerberus);
		c.fillOval (346 + i, 415, 24, 22);
		int necksX[] = {302 + i, 314 + i, 322 + i, 322 + i, 338 + i, 338 + i, 346 + i, 358 + i, 346 + i, 314 + i};
		int necksY[] = {437, 426, 436, 425, 425, 436, 426, 437, 448, 448};
		c.setColor (cerberus); //draw polygon for all three necks
		c.fillPolygon (necksX, necksY, 10);
		c.setColor (cerberus); //draw front body
		c.fillArc (314 + i, 430, 32, 36, 180, 180);
		c.setColor (cerberus); //draw tail
		c.fillArc (290 + i, 445, 20, 30, 90, 180);
		c.setColor (cerberus); //draw legs
		c.fillRect (315 + i, 448, 10, 30);
		c.setColor (cerberus);
		c.fillRect (335 + i, 448, 10, 30);
		c.setColor (cerberus); //draw feet
		c.fillOval (315 + i, 475, 16, 8);
		c.setColor (cerberus);
		c.fillOval (335 + i, 475, 16, 8);
		c.setColor (Color.white); //draw eyes
		c.fillOval (298 + i, 420, 6, 6);
		c.setColor (Color.white);
		c.fillOval (322 + i, 410, 6, 6);
		c.setColor (Color.white);
		c.fillOval (332 + i, 410, 6, 6);
		c.setColor (Color.white);
		c.fillOval (356 + i, 420, 6, 6);
		c.setColor (Color.black);
		c.fillOval (299 + i, 423, 4, 4);
		c.setColor (Color.black);
		c.fillOval (323 + i, 413, 4, 4);
		c.setColor (Color.black);
		c.fillOval (333 + i, 413, 4, 4);
		c.setColor (Color.black);
		c.fillOval (357 + i, 423, 4, 4);
		//noses
		c.setColor (Color.black);
		c.fillRect (290 + i, 425, 4, 4);
		c.setColor (Color.black);
		c.fillRect (328 + i, 418, 4, 4);
		c.setColor (Color.black);
		c.fillRect (366 + i, 425, 4, 4);

		try
		{
		    Thread.sleep (60);
		}
		catch (Exception e)
		{
		}
	    }
	}
	for (int i = -20 ; i >= -450 ; i--) //this for loop makes him exit by moving off of the screen
	{
	    c.setColor (ground); //ground erase
	    c.fillRect (307 + i, 399, 75, 84);
	    c.setColor (darkFur);
	    c.fillRect (310 + i, 445, 10, 33); //draw back leg
	    c.setColor (darkFur);
	    c.fillOval (310 + i, 475, 16, 8); //draw foot
	    c.setColor (darkFur);
	    c.fillRect (310 + i, 445, 35, 18); //draw back body
	    int[] ear1X = {306 + i, 318 + i, 312 + i};
	    int[] ear1Y = {418, 418, 408};
	    int[] ear2X = {374 + i, 362 + i, 368 + i};
	    int[] ear2Y = {418, 418, 408};
	    int[] ear3X = {331 + i, 342 + i, 336 + i};
	    int[] ear3Y = {408, 408, 398};
	    int[] ear4X = {349 + i, 338 + i, 344 + i};
	    int[] ear4Y = {408, 408, 398};
	    c.setColor (cerberus); //draw four ears
	    c.fillPolygon (ear1X, ear1Y, 3);
	    c.setColor (cerberus);
	    c.fillPolygon (ear2X, ear2Y, 3);
	    c.setColor (cerberus);
	    c.fillPolygon (ear3X, ear3Y, 3);
	    c.setColor (cerberus);
	    c.fillPolygon (ear4X, ear4Y, 3);
	    c.setColor (cerberus); //draw heads
	    c.fillOval (300 + i, 415, 24, 22);
	    c.setColor (cerberus);
	    c.fillOval (328 + i, 405, 24, 22);
	    c.setColor (cerberus);
	    c.fillOval (356 + i, 415, 24, 22);
	    int necksX[] = {312 + i, 324 + i, 332 + i, 332 + i, 348 + i, 348 + i, 356 + i, 368 + i, 356 + i, 324 + i};
	    int necksY[] = {437, 426, 436, 425, 425, 436, 426, 437, 448, 448};
	    c.setColor (cerberus);
	    c.fillPolygon (necksX, necksY, 10); //draw polygon for all three necks
	    c.setColor (cerberus); //draw front body
	    c.fillArc (324 + i, 430, 32, 36, 180, 180);
	    c.setColor (cerberus); //draw tail
	    c.fillArc (300 + i, 445, 20, 30, 90, 180);
	    c.setColor (cerberus); //draw legs
	    c.fillRect (325 + i, 448, 10, 30);
	    c.setColor (cerberus);
	    c.fillRect (345 + i, 448, 10, 30);
	    c.setColor (cerberus); //draw feet
	    c.fillOval (325 + i, 475, 16, 8);
	    c.setColor (cerberus);
	    c.fillOval (345 + i, 475, 16, 8);
	    c.setColor (Color.white); //draw eyes
	    c.fillOval (308 + i, 420, 6, 6);
	    c.setColor (Color.white);
	    c.fillOval (332 + i, 410, 6, 6);
	    c.setColor (Color.white);
	    c.fillOval (342 + i, 410, 6, 6);
	    c.setColor (Color.white);
	    c.fillOval (366 + i, 420, 6, 6);
	    c.setColor (Color.black);
	    c.fillOval (309 + i, 423, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (333 + i, 413, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (343 + i, 413, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (367 + i, 423, 4, 4);
	    //noses
	    c.setColor (Color.black);
	    c.fillRect (300 + i, 425, 4, 4);
	    c.setColor (Color.black);
	    c.fillRect (338 + i, 418, 4, 4);
	    c.setColor (Color.black);
	    c.fillRect (376 + i, 425, 4, 4);

	    c.setColour (pillar);
	    c.fillRect (40, 398, 40, 85);
	    c.setColor (tanBrown);
	    c.drawLine (40, 20, 40, 500);
	    c.setColor (tanBrown);
	    c.drawLine (80, 20, 80, 500);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Cerberus (Console con)  //class constructor
    {
	c = con; //passes console
    }


    public void run ()  //run method
    {
	cerberus ();
    }
}


