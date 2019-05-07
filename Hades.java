/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class animates Hades, as he does his routine with Cerberus.
   He enters from the left and sings a little, with animated music notes floating
   near his head. He comes on from the left.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Hades extends Thread
{
    private Console c; //console reference

    public void hades ()
    {
	//colour declarations
	Color face = new Color (247, 197, 148);
	Color black = new Color (54, 48, 68);
	Color hair = new Color (42, 44, 48);
	Color ground = new Color (198, 153, 85);
	Color stone = new Color (165, 147, 124);
	Color tanBrown = new Color (224, 179, 107);
	Color pillar = new Color (247, 206, 170);
	for (int i = -430 ; i <= 0 ; i++) //this for loop makes Hades enter from the left of teh screen
	{
	    synchronized (c)
	    {
		c.setColor (ground); //ground erase
		c.fillRect (389 + i, 360, 40, 135);
	    }
	    //draw cloak
	    c.setColor (black);
	    c.fillArc (390 + i, 420, 40, 25, 0, 180);
	    c.setColor (black);
	    c.fillRect (390 + i, 430, 40, 60);
	    c.setColor (black);
	    c.fillArc (390 + i, 485, 20, 10, 180, 180);
	    c.setColor (black);
	    c.fillArc (410 + i, 485, 20, 10, 180, 180);
	    //draw hair
	    c.setColor (hair);
	    c.fillArc (390 + i, 364, 40, 60, 0, 180);
	    //draw neck
	    c.setColor (face);
	    c.fillRect (405 + i, 406, 10, 15);
	    //draw face
	    c.setColor (face);
	    c.fillOval (395 + i, 369, 30, 40);
	    //draw bangs
	    c.setColor (hair);
	    c.fillArc (395 + i, 365, 30, 20, 0, 180);
	    //draw eyes
	    c.setColor (Color.white);
	    c.fillArc (400 + i, 375, 8, 16, 180, 180);
	    c.setColor (Color.white);
	    c.fillArc (412 + i, 375, 8, 16, 180, 180);
	    c.setColor (Color.red);
	    c.fillOval (401 + i, 387, 6, 6);
	    c.setColor (Color.red);
	    c.fillOval (413 + i, 387, 6, 6);
	    c.setColor (Color.black);
	    c.fillOval (402 + i, 389, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (414 + i, 389, 4, 4);
	    int eyebrow1X[] = {400 + i, 400 + i, 410 + i, 410 + i};
	    int eyebrow1Y[] = {383, 380, 383, 386};
	    int eyebrow2X[] = {410 + i, 410 + i, 420 + i, 420 + i};
	    int eyebrow2Y[] = {386, 383, 380, 383};
	    c.setColor (Color.black); //draw eyebrows
	    c.fillPolygon (eyebrow1X, eyebrow1Y, 4);
	    c.setColor (Color.black);
	    c.fillPolygon (eyebrow2X, eyebrow2Y, 4);
	    c.setColor (Color.black); //nose
	    c.drawArc (407 + i, 392, 6, 4, 180, 180);
	    int mouthX[] = {403 + i, 417 + i, 413 + i, 407 + i};
	    int mouthY[] = {400, 400, 405, 405};
	    c.setColor (Color.black); //draw mouth
	    c.fillPolygon (mouthX, mouthY, 4);
	    c.setColor (Color.black); //draw crown
	    c.drawLine (395 + i, 435, 395 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (405 + i, 435, 405 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (415 + i, 435, 415 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (425 + i, 435, 425 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (395 + i, 455, 410 + i, 475);
	    c.setColor (Color.black);
	    c.drawLine (405 + i, 455, 410 + i, 465);
	    c.setColor (Color.black);
	    c.drawLine (415 + i, 455, 410 + i, 465);
	    c.setColor (Color.black);
	    c.drawLine (425 + i, 455, 410 + i, 475);
	    c.setColor (Color.black);
	    c.fillOval (405 + i, 465, 10, 10);
	    c.setColor (Color.black);
	    c.drawLine (396 + i, 369, 424 + i, 369);
	    for (int x = 0 ; x < 7 ; x++) //draw spikes on crown
	    {
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 369, 397 + i + 4 * x, 360);
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 361, 399 + i + 4 * x, 361);
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 364, 395 + i + 4 * x, 364);
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 366, 399 + i + 4 * x, 366);
	    }
	    c.setColour (pillar); //re-draw pillar
	    c.fillRect (40, 359, 40, 136);
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
	for (int y = 0 ; y < 10 ; y++) //this for loop makes Hades move side to side to dance and sing
	{

	    for (int i = 0 ; i >= -5 ; i--) //this loop makes him move left
	    {
		c.setColor (ground); //ground erase
		c.fillRect (388 + i, 360, 45, 135);
		c.setColor (ground);
		c.fillRect (380, 346 + i, 7, 14);
		c.setColor (black); //draw cloak
		c.fillArc (390 + i, 420, 40, 25, 0, 180);
		c.setColor (black);
		c.fillRect (390 + i, 430, 40, 60);
		c.setColor (black);
		c.fillArc (390 + i, 485, 20, 10, 180, 180);
		c.setColor (black);
		c.fillArc (410 + i, 485, 20, 10, 180, 180);
		c.setColor (hair); //draw hair
		c.fillArc (390 + i, 364, 40, 60, 0, 180);
		c.setColor (face); //draw neck
		c.fillRect (405 + i, 406, 10, 15);
		c.setColor (face); //draw face
		c.fillOval (395 + i, 369, 30, 40);
		c.setColor (hair); //draw bangs
		c.fillArc (395 + i, 365, 30, 20, 0, 180);
		c.setColor (Color.white); //draw eyes
		c.fillArc (400 + i, 375, 8, 16, 180, 180);
		c.setColor (Color.white);
		c.fillArc (412 + i, 375, 8, 16, 180, 180);
		c.setColor (Color.red);
		c.fillOval (401 + i, 387, 6, 6);
		c.setColor (Color.red);
		c.fillOval (413 + i, 387, 6, 6);
		c.setColor (Color.black);
		c.fillOval (402 + i, 389, 4, 4);
		c.setColor (Color.black);
		c.fillOval (414 + i, 389, 4, 4);
		int eyebrow1X[] = {400 + i, 400 + i, 410 + i, 410 + i};
		int eyebrow1Y[] = {383, 380, 383, 386};
		int eyebrow2X[] = {410 + i, 410 + i, 420 + i, 420 + i};
		int eyebrow2Y[] = {386, 383, 380, 383};
		c.setColor (Color.black); //draw eyebrows
		c.fillPolygon (eyebrow1X, eyebrow1Y, 4);
		c.setColor (Color.black);
		c.fillPolygon (eyebrow2X, eyebrow2Y, 4);
		c.setColor (Color.black); //nose
		c.drawArc (407 + i, 392, 6, 4, 180, 180);
		int mouthX[] = {403 + i, 417 + i, 413 + i, 407 + i};
		int mouthY[] = {400, 400, 405, 405};
		c.setColor (Color.black); //draw mouth
		c.fillPolygon (mouthX, mouthY, 4);
		c.setColor (Color.black); //draw crown
		c.drawLine (395 + i, 435, 395 + i, 455);
		c.setColor (Color.black);
		c.drawLine (405 + i, 435, 405 + i, 455);
		c.setColor (Color.black);
		c.drawLine (415 + i, 435, 415 + i, 455);
		c.setColor (Color.black);
		c.drawLine (425 + i, 435, 425 + i, 455);
		c.setColor (Color.black);
		c.drawLine (395 + i, 455, 410 + i, 475);
		c.setColor (Color.black);
		c.drawLine (405 + i, 455, 410 + i, 465);
		c.setColor (Color.black);
		c.drawLine (415 + i, 455, 410 + i, 465);
		c.setColor (Color.black);
		c.drawLine (425 + i, 455, 410 + i, 475);
		c.setColor (Color.black);
		c.fillOval (405 + i, 465, 10, 10);
		c.setColor (Color.black);
		c.drawLine (396 + i, 369, 424 + i, 369);
		for (int x = 0 ; x < 7 ; x++) //draw spikes on crown
		{
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 369, 397 + i + 4 * x, 360);
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 361, 399 + i + 4 * x, 361);
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 364, 395 + i + 4 * x, 364);
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 366, 399 + i + 4 * x, 366);
		}
		c.setColor (Color.black); //draw music note
		c.fillOval (380, 355 + i, 6, 4);
		c.drawLine (385, 357 + i, 386, 347 + i);
		try
		{
		    Thread.sleep (70);
		}
		catch (Exception e)
		{
		}
		c.setColor (ground);
		c.fillRect (380, 341, 7, 14); //cover music note

	    }
	    for (int i = -5 ; i <= 0 ; i++) //this for loop makes him move right
	    {
		c.setColor (ground); //ground erase
		c.fillRect (389 + i, 360, 45, 135);
		c.setColor (ground);
		c.fillRect (430, 341 - i, 7, 14);
		c.setColor (black); //draw cloak
		c.fillArc (390 + i, 420, 40, 25, 0, 180);
		c.setColor (black);
		c.fillRect (390 + i, 430, 40, 60);
		c.setColor (black);
		c.fillArc (390 + i, 485, 20, 10, 180, 180);
		c.setColor (black);
		c.fillArc (410 + i, 485, 20, 10, 180, 180);
		c.setColor (hair); //draw hair
		c.fillArc (390 + i, 364, 40, 60, 0, 180);
		c.setColor (face); //draw neck
		c.fillRect (405 + i, 406, 10, 15);
		c.setColor (face); //draw face
		c.fillOval (395 + i, 369, 30, 40);
		c.setColor (hair); //draw bangs
		c.fillArc (395 + i, 365, 30, 20, 0, 180);
		c.setColor (Color.white); //draw eyes
		c.fillArc (400 + i, 375, 8, 16, 180, 180);
		c.setColor (Color.white);
		c.fillArc (412 + i, 375, 8, 16, 180, 180);
		c.setColor (Color.red);
		c.fillOval (401 + i, 387, 6, 6);
		c.setColor (Color.red);
		c.fillOval (413 + i, 387, 6, 6);
		c.setColor (Color.black);
		c.fillOval (402 + i, 389, 4, 4);
		c.setColor (Color.black);
		c.fillOval (414 + i, 389, 4, 4);
		int eyebrow1X[] = {400 + i, 400 + i, 410 + i, 410 + i};
		int eyebrow1Y[] = {383, 380, 383, 386};
		int eyebrow2X[] = {410 + i, 410 + i, 420 + i, 420 + i};
		int eyebrow2Y[] = {386, 383, 380, 383};
		c.setColor (Color.black); //draw eyebrows
		c.fillPolygon (eyebrow1X, eyebrow1Y, 4);
		c.setColor (Color.black);
		c.fillPolygon (eyebrow2X, eyebrow2Y, 4);
		c.setColor (Color.black); //nose
		c.drawArc (407 + i, 392, 6, 4, 180, 180);
		int mouthX[] = {403 + i, 417 + i, 413 + i, 407 + i};
		int mouthY[] = {400, 400, 405, 405};
		c.setColor (Color.black);
		c.fillPolygon (mouthX, mouthY, 4); //draw mouth
		c.setColor (Color.black); //draw crown
		c.drawLine (395 + i, 435, 395 + i, 455);
		c.setColor (Color.black);
		c.drawLine (405 + i, 435, 405 + i, 455);
		c.setColor (Color.black);
		c.drawLine (415 + i, 435, 415 + i, 455);
		c.setColor (Color.black);
		c.drawLine (425 + i, 435, 425 + i, 455);
		c.setColor (Color.black);
		c.drawLine (395 + i, 455, 410 + i, 475);
		c.setColor (Color.black);
		c.drawLine (405 + i, 455, 410 + i, 465);
		c.setColor (Color.black);
		c.drawLine (415 + i, 455, 410 + i, 465);
		c.setColor (Color.black);
		c.drawLine (425 + i, 455, 410 + i, 475);
		c.setColor (Color.black);
		c.fillOval (405 + i, 465, 10, 10);
		c.setColor (Color.black);
		c.drawLine (396 + i, 369, 424 + i, 369);
		for (int x = 0 ; x < 7 ; x++) //draw spikes on crown
		{
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 369, 397 + i + 4 * x, 360);
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 361, 399 + i + 4 * x, 361);
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 364, 395 + i + 4 * x, 364);
		    c.setColor (Color.black);
		    c.drawLine (397 + i + 4 * x, 366, 399 + i + 4 * x, 366);

		}
		c.setColor (Color.black); //draw music note
		c.fillOval (430, 350 - i, 6, 4);
		c.drawLine (435, 352 - i, 436, 342 - i);
		try
		{
		    Thread.sleep (70);
		}
		catch (Exception e)
		{
		}
		c.setColor (ground); //cover music note
		c.fillRect (430, 341, 7, 14);
	    }
	}
	for (int i = 0 ; i >= -430 ; i--) //this for loop makes him exit to the left
	{
	    c.setColor (ground); //ground erase
	    c.fillRect (391 + i, 360, 40, 135);
	    c.setColor (black); //draw cloak
	    c.fillArc (390 + i, 420, 40, 25, 0, 180);
	    c.setColor (black);
	    c.fillRect (390 + i, 430, 40, 60);
	    c.setColor (black);
	    c.fillArc (390 + i, 485, 20, 10, 180, 180);
	    c.setColor (black);
	    c.fillArc (410 + i, 485, 20, 10, 180, 180);
	    c.setColor (hair); //draw hair
	    c.fillArc (390 + i, 364, 40, 60, 0, 180);
	    c.setColor (face); //draw neck
	    c.fillRect (405 + i, 406, 10, 15);
	    c.setColor (face); //draw face
	    c.fillOval (395 + i, 369, 30, 40);
	    c.setColor (hair); //draw bangs
	    c.fillArc (395 + i, 365, 30, 20, 0, 180);
	    c.setColor (Color.white); //draw eyes
	    c.fillArc (400 + i, 375, 8, 16, 180, 180);
	    c.setColor (Color.white);
	    c.fillArc (412 + i, 375, 8, 16, 180, 180);
	    c.setColor (Color.red);
	    c.fillOval (401 + i, 387, 6, 6);
	    c.setColor (Color.red);
	    c.fillOval (413 + i, 387, 6, 6);
	    c.setColor (Color.black);
	    c.fillOval (402 + i, 389, 4, 4);
	    c.setColor (Color.black);
	    c.fillOval (414 + i, 389, 4, 4);
	    int eyebrow1X[] = {400 + i, 400 + i, 410 + i, 410 + i};
	    int eyebrow1Y[] = {383, 380, 383, 386};
	    int eyebrow2X[] = {410 + i, 410 + i, 420 + i, 420 + i};
	    int eyebrow2Y[] = {386, 383, 380, 383};
	    c.setColor (Color.black); //draw eyebrows
	    c.fillPolygon (eyebrow1X, eyebrow1Y, 4);
	    c.setColor (Color.black);
	    c.fillPolygon (eyebrow2X, eyebrow2Y, 4);
	    c.setColor (Color.black);
	    c.drawArc (407 + i, 392, 6, 4, 180, 180); //nose
	    int mouthX[] = {403 + i, 417 + i, 413 + i, 407 + i};
	    int mouthY[] = {400, 400, 405, 405};
	    c.setColor (Color.black); //draw mouth
	    c.fillPolygon (mouthX, mouthY, 4);
	    c.setColor (Color.black); //draw crown
	    c.drawLine (395 + i, 435, 395 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (405 + i, 435, 405 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (415 + i, 435, 415 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (425 + i, 435, 425 + i, 455);
	    c.setColor (Color.black);
	    c.drawLine (395 + i, 455, 410 + i, 475);
	    c.setColor (Color.black);
	    c.drawLine (405 + i, 455, 410 + i, 465);
	    c.setColor (Color.black);
	    c.drawLine (415 + i, 455, 410 + i, 465);
	    c.setColor (Color.black);
	    c.drawLine (425 + i, 455, 410 + i, 475);
	    c.setColor (Color.black);
	    c.fillOval (405 + i, 465, 10, 10);
	    c.setColor (Color.black);
	    c.drawLine (396 + i, 369, 424 + i, 369);
	    for (int x = 0 ; x < 7 ; x++) //draw spikes on crown
	    {
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 369, 397 + i + 4 * x, 360);
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 361, 399 + i + 4 * x, 361);
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 364, 395 + i + 4 * x, 364);
		c.setColor (Color.black);
		c.drawLine (397 + i + 4 * x, 366, 399 + i + 4 * x, 366);
	    }
	    c.setColour (pillar); //re-draw pillar
	    c.fillRect (40, 359, 40, 136);
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


    public Hades (Console con)  //class constructor
    {
	c = con; //passes output window
    }


    public void run ()  //run method
    {
	hades ();
    }
}
