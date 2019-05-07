/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class animates Artemis, the godess of the moon and archery.
   Her act is shooting an arrow at the target. She enters the screen from the left,
   fires her arrow and hits the target in the centre. She then exits to the right.

*/


import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Artemis extends Thread //Artemis class
{
    private Console c; //reference variable for Console

    public void artemis ()
    {
	//Colour declarations
	Color pillar = new Color (247, 206, 170);
	Color tanBrown = new Color (224, 179, 107);
	Color skin = new Color (249, 208, 142);
	Color hair = new Color (249, 186, 39);
	Color dress = new Color (219, 209, 255);
	Color redMouth = new Color (196, 7, 45);
	Color belt = new Color (252, 194, 47);
	Color bow = new Color (160, 102, 65);
	Color ground = new Color (198, 153, 85);
	Color arrow = new Color (109, 46, 5);
	for (int i = -400 ; i <= -150 ; i++) //this for loop makes Artemis enter from the left
	{
	    c.setColor (ground); //erase
	    c.fillRect (340 + i, 365, 81, 130);
	    c.setColor (skin);
	    c.fillOval (350 + i, 370, 30, 30); //face
	    c.fillRect (362 + i, 399, 6, 8); //neck
	    c.fillRect (375 + i, 420, 30, 8); //arm
	    c.fillOval (404 + i, 419, 10, 10); //hand

	    //draw dress
	    c.setColor (dress);
	    c.fillArc (347 + i, 405, 34, 80, 0, 180);
	    int skirtX[] = {348 + i, 382 + i, 382 + i, 340 + i};
	    int skirtY[] = {445, 445, 495, 495};
	    c.fillPolygon (skirtX, skirtY, 4);
	    //draw eye
	    c.setColor (Color.black);
	    c.fillOval (371 + i, 382, 4, 4);
	    c.drawLine (368 + i, 381, 370 + i, 382);
	    c.drawLine (368 + i, 384, 371 + i, 382);
	    c.setColour (redMouth); //draw mouth
	    c.drawArc (372 + i, 389, 8, 6, 180, 90);

	    c.setColor (belt); //belt
	    c.fillRect (348 + i, 441, 34, 8);

	    c.setColor (hair); //hair
	    c.fillOval (345 + i, 365, 16, 16);
	    c.fillArc (348 + i, 370, 32, 25, 45, 180);

	    c.setColor (bow); //draw bow
	    c.fillRect (407 + i, 385, 6, 80);
	    c.fillArc (397 + i, 375, 16, 20, 0, 90);
	    c.fillArc (397 + i, 365, 16, 20, 180, 90);
	    c.fillArc (397 + i, 455, 16, 20, 270, 90);
	    c.drawLine (370 + i, 431, 408 + i, 465);
	    c.drawLine (370 + i, 431, 402 + i, 385);

	    c.setColor (skin);
	    c.fillOval (359 + i, 410, 12, 12); //shoulder
	    //draw arm
	    c.fillOval (348 + i, 425, 10, 10);
	    c.fillOval (365 + i, 426, 10, 10);
	    int arm2X[] = {353 + i, 370 + i, 370 + i, 353 + i};
	    int arm2Y[] = {426, 427, 435, 434};
	    c.fillPolygon (arm2X, arm2Y, 4);
	    int armX[] = {359 + i, 369 + i, 358 + i, 348 + i};
	    int armY[] = {416, 416, 430, 430};
	    c.fillPolygon (armX, armY, 4);


	    c.setColor (arrow); //draw arrow
	    c.drawLine (425 + i, 420, 365 + i, 425);
	    int arrowTipX[] = {430 + i, 420 + i, 420 + i};
	    int arrowTipY[] = {420, 425, 415};
	    c.fillPolygon (arrowTipX, arrowTipY, 3);
	    c.setColour (pillar); //re-draw pillar
	    c.fillRect (40, 364, 40, 131);
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

	for (int i = 0 ; i < 15 ; i++) //this for loop makes the arm pull back on the bow line
	{
	    c.setColor (ground);
	    c.fillRect (197, 385, 83, 80); //erase
	    c.setColor (skin);
	    c.fillRect (225, 420, 30, 8); //arm
	    c.fillRect (212, 399, 6, 8); //neck
	    c.fillOval (200, 370, 30, 30); //face
	    c.fillOval (254, 419, 10, 10); //hand
	    c.setColor (Color.black); //draw eye
	    c.fillOval (221, 382, 4, 4);
	    c.drawLine (218, 381, 220, 382);
	    c.drawLine (218, 384, 221, 382);
	    c.setColour (redMouth); //draw mouth
	    c.drawArc (222, 389, 8, 6, 180, 90);
	    c.setColor (hair); //hair
	    c.fillOval (195, 365, 16, 16);
	    c.fillArc (198, 370, 32, 25, 45, 180);
	    //draw dress
	    c.setColor (dress);
	    c.fillArc (197, 405, 34, 80, 0, 180);
	    c.fillRect (197, 449, 34, 16);
	    c.setColor (belt); //belt
	    c.fillRect (198, 441, 34, 8);


	    c.setColor (bow); //draw bow
	    c.fillRect (257, 385, 6, 80);
	    c.fillArc (247, 375, 16, 20, 0, 90);
	    c.fillArc (247, 365, 16, 20, 180, 90);
	    c.fillArc (247, 455, 16, 20, 270, 90);

	    c.setColor (skin);
	    c.fillOval (209, 410, 12, 12); //shoulder
	    //draw moving arm
	    c.fillOval (198 - i, 425 - i / 4, 10, 10);
	    int armX[] = {215, 215, 203 - i, 203 - i};
	    int armY[] = {410, 422, 435 - i / 4, 425 - i / 4};
	    c.fillPolygon (armX, armY, 4); //top

	    c.setColor (bow); //draw moving bow line
	    c.drawLine (220 - i, 431 - i / 3, 258, 465);
	    c.drawLine (220 - i, 431 - i / 3, 252, 385);

	    c.setColor (skin);
	    c.fillOval (215 - i, 426, 10, 10); //hand
	    int arm2X[] = {203 - i, 220 - i, 220 - i, 203 - i};
	    int arm2Y[] = {426 - i / 4, 427, 435, 434 - i / 4};
	    c.fillPolygon (arm2X, arm2Y, 4); //bottom arm section

	    c.setColor (arrow); //draw arrow
	    c.drawLine (275 - i / 2, 420, 215 - i / 2, 425);
	    int arrowTipX[] = {280 - i / 2, 270 - i / 2, 270 - i / 2};
	    int arrowTipY[] = {420, 425, 415};
	    c.fillPolygon (arrowTipX, arrowTipY, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i < 58 ; i++) //this for loop makes her move her arm forward and release the arrow
	{
	    c.setColor (ground); //erase
	    c.fillRect (197 + i, 385, 73, 80);
	    c.setColor (skin);
	    c.fillRect (225, 420, 30, 8); //arm
	    c.fillRect (212, 399, 6, 8); //neck
	    c.fillOval (200, 370, 30, 30); //face
	    c.setColor (Color.black); //draw eye
	    c.fillOval (221, 382, 4, 4);
	    c.drawLine (218, 381, 220, 382);
	    c.drawLine (218, 384, 221, 382);
	    c.setColour (redMouth); //draw mouth
	    c.drawArc (222, 389, 8, 6, 180, 90);
	    c.setColor (hair); //hair
	    c.fillOval (195, 365, 16, 16);
	    c.fillArc (198, 370, 32, 25, 45, 180);
	    c.setColor (dress); //draw dress
	    c.fillArc (197, 405, 34, 80, 0, 180);
	    c.fillRect (197, 449, 34, 16);
	    c.setColor (belt); //belt
	    c.fillRect (198, 441, 34, 8);
	    c.setColor (skin); //hand
	    c.fillOval (254, 419, 10, 10);


	    c.setColor (bow); //draw bow
	    c.fillRect (257, 385, 6, 80);
	    c.fillArc (247, 375, 16, 20, 0, 90);
	    c.fillArc (247, 365, 16, 20, 180, 90);
	    c.fillArc (247, 455, 16, 20, 270, 90);

	    c.setColor (skin);
	    c.fillOval (209, 410, 12, 12); //shoulder
	    //draw arm
	    c.fillOval (184, 422, 10, 10);
	    int armX[] = {215, 215, 189, 189};
	    int armY[] = {410, 422, 432, 422};
	    c.fillPolygon (armX, armY, 4); //top section of arm
	    c.fillOval (201, 426, 10, 10);
	    int arm2X[] = {189, 206, 206, 189};
	    int arm2Y[] = {423, 427, 435, 431};
	    c.fillPolygon (arm2X, arm2Y, 4); //bottom  section of arm

	    c.setColor (bow); //draw moving bow line
	    c.drawLine (206 + i, 427, 254, 466);
	    c.drawLine (206 + i, 427, 252, 385);


	    c.setColor (arrow); //draw arrow
	    c.drawLine (268 + i, 420, 208 + i, 425);
	    int arrowTipX[] = {273 + i, 263 + i, 263 + i};
	    int arrowTipY[] = {420, 425, 415};
	    c.fillPolygon (arrowTipX, arrowTipY, 3);

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 150 ; i++) //this for loop makes the arrow fly and hit the target
	{
	    c.setColour (ground); //erase
	    c.fillRect (264 + i, 415 - ((i - 1) / 30), 73, 11);
	    //re-draw target
	    c.setColor (Color.white);
	    for (int x = 0 ; x <= 13 ; x++)
	    {
		c.drawLine (440, 411 + x, 450, 411 + x);
	    }
	    c.setColor (Color.red);
	    for (int x = 0 ; x <= 10 ; x++)
	    {
		c.drawLine (450, 411 + x, 460, 411 + x);
	    }
	    c.setColor (Color.cyan);
	    for (int x = 0 ; x <= 10 ; x++)
	    {
		c.drawLine (460, 411 + x, 480, 411 + x);
	    }
	    c.setColor (Color.red);
	    for (int x = 0 ; x < 17 ; x++)
	    {
		c.drawOval (480 - x / 2, 412, x, 16);
	    }
	    c.setColor (arrow); // draw the moving arrow
	    c.drawLine (325 + i, 420 - i / 30, 265 + i, 425 - i / 30);
	    int arrowTipX[] = {330 + i, 320 + i, 320 + i};
	    int arrowTipY[] = {420 - i / 30, 425 - i / 30, 415 - i / 30};
	    c.fillPolygon (arrowTipX, arrowTipY, 3);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = -150 ; i <= 320 ; i++) //this for loop makes Artemis leave the scene to the right
	{
	    c.setColor (ground); //erase
	    c.fillRect (332 + i, 365, 78, 130);
	    //re-draw target
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
		c.drawOval (480 - x / 2, 412, x, 18);
	    }
	    c.setColor (Color.orange);
	    for (int x = 0 ; x < 20 ; x++)
	    {
		c.drawLine (521, 410, 521 + x, 455 - x / 2);
	    }
	    c.setColor (arrow); //re-draw arrow sticking out of target
	    c.drawLine (475, 415, 415, 420);
	    int arrowTipX[] = {480, 470, 470};
	    int arrowTipY[] = {415, 420, 410};
	    c.fillPolygon (arrowTipX, arrowTipY, 3);
	    c.setColor (skin);
	    c.fillOval (350 + i, 370, 30, 30); //face
	    c.fillRect (362 + i, 399, 6, 8); //neck
	    c.fillRect (375 + i, 420, 30, 8); //arm
	    c.fillOval (404 + i, 419, 10, 10); //hand

	    //draw dress
	    c.setColor (dress);
	    c.fillArc (347 + i, 405, 34, 80, 0, 180);
	    int skirtX[] = {348 + i, 382 + i, 382 + i, 340 + i};
	    int skirtY[] = {445, 445, 495, 495};
	    c.fillPolygon (skirtX, skirtY, 4);
	    c.setColor (Color.black); //draw eye
	    c.fillOval (371 + i, 382, 4, 4);
	    c.drawLine (368 + i, 381, 370 + i, 382);
	    c.drawLine (368 + i, 384, 371 + i, 382);
	    c.setColour (redMouth); //draw mouth
	    c.drawArc (372 + i, 389, 8, 6, 180, 90);

	    c.setColor (belt); //belt
	    c.fillRect (348 + i, 441, 34, 8);

	    c.setColor (hair); //hair
	    c.fillOval (345 + i, 365, 16, 16);
	    c.fillArc (348 + i, 370, 32, 25, 45, 180);

	    c.setColor (bow); //draw bow
	    c.fillRect (407 + i, 385, 6, 80);
	    c.fillArc (397 + i, 375, 16, 20, 0, 90);
	    c.fillArc (397 + i, 365, 16, 20, 180, 90);
	    c.fillArc (397 + i, 455, 16, 20, 270, 90);
	    c.drawLine (414 + i, 431, 404 + i, 466);
	    c.drawLine (414 + i, 431, 402 + i, 385);

	    c.setColor (skin);
	    c.fillOval (359 + i, 410, 12, 12); //shoulder
	    c.fillOval (333 + i, 422, 10, 10); //elbow
	    c.fillOval (350 + i, 426, 10, 10); //hand
	    int arm2X[] = {338 + i, 355 + i, 355 + i, 338 + i};
	    int arm2Y[] = {423, 427, 435, 431};
	    c.fillPolygon (arm2X, arm2Y, 4); //bottom section of arm
	    int armX[] = {365 + i, 365 + i, 338 + i, 338 + i};
	    int armY[] = {410, 422, 432, 422};
	    c.fillPolygon (armX, armY, 4); //top section of arm

	    c.setColour (pillar); //re-draw pillar
	    c.fillRect (560, 364, 40, 131);
	    c.setColor (tanBrown);
	    c.drawLine (560, 20, 560, 500);
	    c.drawLine (600, 20, 600, 500);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public Artemis (Console con) //class constructor
    {
	c = con; //passes output console
    }


    public void run () //run method
    {
	artemis ();
    }
}


