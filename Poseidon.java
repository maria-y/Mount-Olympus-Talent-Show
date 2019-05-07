/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class draws Poseidon's entrance, dance routine and exit.
   He enters from the left, floating on the water. His routine includes him
   bouncing up and down for a bit. He exits by descending down into the water.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Poseidon extends Thread  //Poseidon class
{
    private Console c; //Console referance

    public void poseidon ()
    {
	//colour declaration
	Color face = new Color (247, 197, 148);
	Color skin = new Color (249, 162, 79);
	Color hair = new Color (56, 73, 60);
	Color tail = new Color (109, 214, 130);
	Color lightTail = new Color (129, 234, 150);
	Color water = new Color (60, 97, 183);
	Color gold = new Color (224, 211, 31);
	Color pillar = new Color (247, 206, 170);
	Color ground = new Color (198, 153, 85);
	Color tanBrown = new Color (224, 179, 107);

	for (int i = -316 ; i < -100 ; i++) //for loop that draws his entrance
	{
	    c.setColor (ground);
	    c.fillRect (276 + i - 1, 330, 108, 20); //erase over ground
	    c.setColor (Color.blue);
	    c.fillRect (276 + i, 350, 108, 140); //erase over water

	    c.setColor (hair);
	    c.fillOval (299 + i, 357, 36, 36); //draws hair

	    c.setColor (gold);
	    c.fillRect (369 + i, 340, 8, 110); //draws trident
	    c.setColor (gold);
	    c.fillRect (359 + i, 355, 28, 8);
	    c.setColor (gold);
	    c.fillRect (359 + i, 335, 5, 28);
	    c.setColor (gold);
	    c.fillRect (382 + i, 335, 5, 28);
	    for (int x = 0 ; x < 5 ; x++)
	    {
		c.setColor (gold);
		c.drawLine (359 + x + i, 335, 361 + i, 330);
		c.setColor (gold);
		c.drawLine (382 + x + i, 335, 384 + i, 330);
	    }
	    for (int x = 0 ; x < 8 ; x++)
	    {
		c.setColor (gold);
		c.drawLine (369 + x + i, 340, 372 + i, 332);
	    }

	    //draws face and body
	    c.setColor (face);
	    c.fillOval (302 + i, 360, 30, 30);
	    c.setColor (face);
	    c.fillRect (302 + i, 390, 30, 40);
	    c.setColor (face);
	    c.fillOval (292 + i, 390, 10, 10);
	    c.setColor (face);
	    c.fillOval (332 + i, 390, 10, 10);
	    c.setColor (face);
	    c.fillOval (352 + i, 390, 10, 10);
	    c.setColor (face);
	    c.fillOval (367 + i, 375, 10, 10);
	    c.setColor (face);
	    c.fillOval (277 + i, 405, 10, 10);
	    c.setColor (face);
	    c.fillOval (292 + i, 420, 10, 10);


	    //declares arrays for arms
	    int topLeftArmX[] = {292 + i, 297 + i, 282 + i, 277 + i};
	    int topLeftArmY[] = {395, 400, 415, 410};
	    int topRightArmX[] = {337 + i, 337 + i, 357 + i, 357 + i};
	    int topRightArmY[] = {392, 398, 398, 392};
	    int bottomLeftArmX[] = {282 + i, 282 + i, 297 + i, 297 + i};
	    int bottomLeftArmY[] = {415, 405, 420, 430};
	    int bottomRightArmX[] = {357 + i, 357 + i, 377 + i, 367 + i};
	    int bottomRightArmY[] = {390, 398, 380, 380};
	    //draws arms
	    c.setColor (face);
	    c.fillPolygon (topLeftArmX, topLeftArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (bottomLeftArmX, bottomLeftArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (topRightArmX, topRightArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (bottomRightArmX, bottomRightArmY, 4);

	    //draws bangs
	    c.setColor (hair);
	    c.fillArc (302 + i, 354, 17, 15, 210, 180);
	    c.setColor (hair);
	    c.fillArc (317 + i, 354, 17, 15, 140, 180);
	    //draws beard
	    c.setColor (hair);
	    c.fillOval (301 + i, 380, 32, 12);
	    c.setColor (hair);
	    c.fillOval (305 + i, 387, 24, 9);
	    c.setColor (hair);
	    c.fillOval (312 + i, 392, 10, 6);
	    //draws tail
	    c.setColor (tail);
	    c.fillArc (302 + i, 370, 30, 120, 180, 180);
	    c.setColor (lightTail);
	    c.fillOval (300 + i, 426, 34, 5);

	    //draws eyes
	    c.setColor (Color.black);
	    c.fillOval (307 + i, 372, 5, 5);
	    c.setColor (Color.black);
	    c.fillOval (322 + i, 372, 5, 5);

	    //draws abominal muscles
	    c.setColor (skin);
	    c.drawLine (317 + i, 400, 317 + i, 422);
	    c.setColor (skin);
	    c.drawArc (307 + i, 402, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (307 + i, 412, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (317 + i, 402, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (317 + i, 412, 10, 5, 180, 180);

	    //set up array for tail coordinates
	    int tailX[] = {317 + i, 362 + i, 317 + i};
	    int tailY[] = {490, 470, 460};
	    c.setColor (tail);
	    //draws triangular portion of tail
	    c.fillPolygon (tailX, tailY, 3);

	    //set up array for crown coordinates
	    int crownX[] = {307 + i, 327 + i, 327 + i, 322 + i, 317 + i, 312 + i, 307 + i};
	    int crownY[] = {362, 362, 352, 357, 352, 357, 352};
	    c.setColor (gold);
	    //draws crown
	    c.fillPolygon (crownX, crownY, 7);

	    //re-draws pillar
	    c.setColour (pillar);
	    c.fillRect (40, 329, 40, 161);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//this for loop is a continuation of poseidon entering the scene
	//after passing the pillar
	for (int i = -100 ; i < 50 ; i++)
	{
	    //erases
	    c.setColor (ground);
	    c.fillRect (276 + i - 1, 330, 108, 20);
	    c.setColor (Color.blue);
	    c.fillRect (276 + i, 350, 108, 140);

	    //draw hair
	    c.setColor (hair);
	    c.fillOval (299 + i, 357, 36, 36);

	    //draw trident
	    c.setColor (gold);
	    c.fillRect (369 + i, 340, 8, 110);
	    c.setColor (gold);
	    c.fillRect (359 + i, 355, 28, 8);
	    c.setColor (gold);
	    c.fillRect (359 + i, 335, 5, 28);
	    c.setColor (gold);
	    c.fillRect (382 + i, 335, 5, 28);
	    for (int x = 0 ; x < 5 ; x++)
	    {
		c.setColor (gold);
		c.drawLine (359 + x + i, 335, 361 + i, 330);
		c.setColor (gold);
		c.drawLine (382 + x + i, 335, 384 + i, 330);
	    }
	    for (int x = 0 ; x < 8 ; x++)
	    {
		c.setColor (gold);
		c.drawLine (369 + x + i, 340, 372 + i, 332);
	    }

	    //draw head and body
	    c.setColor (face);
	    c.fillOval (302 + i, 360, 30, 30);
	    c.setColor (face);
	    c.fillRect (302 + i, 390, 30, 40);
	    c.setColor (face);
	    c.fillOval (292 + i, 390, 10, 10);
	    c.setColor (face);
	    c.fillOval (332 + i, 390, 10, 10);
	    c.setColor (face);
	    c.fillOval (352 + i, 390, 10, 10);
	    c.setColor (face);
	    c.fillOval (367 + i, 375, 10, 10);
	    c.setColor (face);
	    c.fillOval (277 + i, 405, 10, 10);
	    c.setColor (face);
	    c.fillOval (292 + i, 420, 10, 10);

	    //arm coordinates arrays
	    int topLeftArmX[] = {292 + i, 297 + i, 282 + i, 277 + i};
	    int topLeftArmY[] = {395, 400, 415, 410};
	    int topRightArmX[] = {337 + i, 337 + i, 357 + i, 357 + i};
	    int topRightArmY[] = {392, 398, 398, 392};
	    int bottomLeftArmX[] = {282 + i, 282 + i, 297 + i, 297 + i};
	    int bottomLeftArmY[] = {415, 405, 420, 430};
	    int bottomRightArmX[] = {357 + i, 357 + i, 377 + i, 367 + i};
	    int bottomRightArmY[] = {390, 398, 380, 380};
	    //draw arms
	    c.setColor (face);
	    c.fillPolygon (topLeftArmX, topLeftArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (bottomLeftArmX, bottomLeftArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (topRightArmX, topRightArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (bottomRightArmX, bottomRightArmY, 4);

	    //draws bangs
	    c.setColor (hair);
	    c.fillArc (302 + i, 354, 17, 15, 210, 180);
	    c.setColor (hair);
	    c.fillArc (317 + i, 354, 17, 15, 140, 180);
	    //draws beard
	    c.setColor (hair);
	    c.fillOval (301 + i, 380, 32, 12);
	    c.setColor (hair);
	    c.fillOval (305 + i, 387, 24, 9);
	    c.setColor (hair);
	    c.fillOval (312 + i, 392, 10, 6);
	    //drws tail
	    c.setColor (tail);
	    c.fillArc (302 + i, 370, 30, 120, 180, 180);
	    c.setColor (lightTail);
	    c.fillOval (300 + i, 426, 34, 5);

	    //draws eyes
	    c.setColor (Color.black);
	    c.fillOval (307 + i, 372, 5, 5);
	    c.setColor (Color.black);
	    c.fillOval (322 + i, 372, 5, 5);

	    //draws abdominal muscles
	    c.setColor (skin);
	    c.drawLine (317 + i, 400, 317 + i, 422);
	    c.setColor (skin);
	    c.drawArc (307 + i, 402, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (307 + i, 412, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (317 + i, 402, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (317 + i, 412, 10, 5, 180, 180);

	    //arrays for triangular tail portion
	    int tailX[] = {317 + i, 362 + i, 317 + i};
	    int tailY[] = {490, 470, 460};
	    c.setColor (tail);
	    //draw traignular tail portion
	    c.fillPolygon (tailX, tailY, 3);

	    //array for crown coordinates
	    int crownX[] = {307 + i, 327 + i, 327 + i, 322 + i, 317 + i, 312 + i, 307 + i};
	    int crownY[] = {362, 362, 352, 357, 352, 357, 352};
	    c.setColor (gold);
	    //draw crown
	    c.fillPolygon (crownX, crownY, 7);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 3 ; z++) //this for loop make Poseidon move up and down
	{
	    for (int y = 0 ; y <= 10 ; y++) //this for loop makes him move up
	    {
		//erase over ground
		c.setColor (ground);
		c.fillRect (355, 340 - y, 82, 15);
		//erase over water
		c.setColor (Color.blue);
		c.fillRect (326, 350, 120, 140);

		//draw hair
		c.setColor (hair);
		c.fillOval (349, 357 - y, 36, 36);

		//draw trident
		c.setColor (gold);
		c.fillRect (419, 340 - y, 8, 110);
		c.setColor (gold);
		c.fillRect (409, 355 - y, 28, 8);
		c.setColor (gold);
		c.fillRect (409, 335 - y, 5, 28);
		c.setColor (gold);
		c.fillRect (432, 335 - y, 5, 28);
		for (int x = 0 ; x < 5 ; x++)
		{
		    c.setColor (gold);
		    c.drawLine (409 + x, 335 - y, 411, 330 - y);
		    c.setColor (gold);
		    c.drawLine (432 + x, 335 - y, 434, 330 - y);
		}
		for (int x = 0 ; x < 8 ; x++)
		{
		    c.setColor (gold);
		    c.drawLine (419 + x, 340 - y, 422, 332 - y);
		}

		//draw face and body
		c.setColor (face);
		c.fillOval (352, 360 - y, 30, 30);
		c.setColor (face);
		c.fillRect (352, 390 - y, 30, 40);
		c.setColor (face);
		c.fillOval (342, 390 - y, 10, 10);
		c.setColor (face);
		c.fillOval (382, 390 - y, 10, 10);
		c.setColor (face);
		c.fillOval (402, 390 - y, 10, 10);
		c.setColor (face);
		c.fillOval (417, 375 - y, 10, 10);
		c.setColor (face);
		c.fillOval (327, 405 - y, 10, 10);
		c.setColor (face);
		c.fillOval (342, 420 - y, 10, 10);


		//arrays for arm coordinates
		int topLeftArmX[] = {342, 347, 332, 327};
		int topLeftArmY[] = {395 - y, 400 - y, 415 - y, 410 - y};
		int topRightArmX[] = {387, 387, 407, 407};
		int topRightArmY[] = {392 - y, 398 - y, 398 - y, 392 - y};
		int bottomLeftArmX[] = {332, 332, 347, 347};
		int bottomLeftArmY[] = {415 - y, 405 - y, 420 - y, 430 - y};
		int bottomRightArmX[] = {407, 407, 427, 417};
		int bottomRightArmY[] = {390 - y, 398 - y, 380 - y, 380 - y};
		//draw arms
		c.setColor (face);
		c.fillPolygon (topLeftArmX, topLeftArmY, 4);
		c.setColor (face);
		c.fillPolygon (bottomLeftArmX, bottomLeftArmY, 4);
		c.setColor (face);
		c.fillPolygon (topRightArmX, topRightArmY, 4);
		c.setColor (face);
		c.fillPolygon (bottomRightArmX, bottomRightArmY, 4);

		//draw bangs
		c.setColor (hair);
		c.fillArc (352, 354 - y, 17, 15, 210, 180);
		c.setColor (hair);
		c.fillArc (367, 354 - y, 17, 15, 140, 180);
		//draw beard
		c.setColor (hair);
		c.fillOval (351, 380 - y, 32, 12);
		c.setColor (hair);
		c.fillOval (355, 387 - y, 24, 9);
		c.setColor (hair);
		c.fillOval (362, 392 - y, 10, 6);
		//draw tail
		c.setColor (tail);
		c.fillArc (352, 370 - y, 30, 120, 180, 180);
		c.setColor (lightTail);
		c.fillOval (350, 426 - y, 34, 5);
		//dtraw eyes
		c.setColor (Color.black);
		c.fillOval (357, 372 - y, 5, 5);
		c.setColor (Color.black);
		c.fillOval (372, 372 - y, 5, 5);
		//draw abdominal muscles
		c.setColor (skin);
		c.drawLine (367, 400 - y, 367, 422 - y);
		c.setColor (skin);
		c.drawArc (357, 402 - y, 10, 5, 180, 180);
		c.setColor (skin);
		c.drawArc (357, 412 - y, 10, 5, 180, 180);
		c.setColor (skin);
		c.drawArc (367, 402 - y, 10, 5, 180, 180);
		c.setColor (skin);
		c.drawArc (367, 412 - y, 10, 5, 180, 180);

		//array for triangular tail portion coordinates
		int tailX[] = {367, 412, 367};
		int tailY[] = {490 - y, 470 - y, 460 - y};
		c.setColor (tail);
		//draw traingular portion of tail
		c.fillPolygon (tailX, tailY, 3);

		//arrays for crown coordinates
		int crownX[] = {357, 377, 377, 372, 367, 362, 357};
		int crownY[] = {362 - y, 362 - y, 352 - y, 357 - y, 352 - y, 357 - y, 352 - y};
		c.setColor (gold);
		//draw crown
		c.fillPolygon (crownX, crownY, 7);
		try
		{
		    Thread.sleep (40);
		}
		catch (Exception e)
		{
		}

	    }
	    for (int y = 10 ; y >= 0 ; y--) //this arrays make Poseidon move down
	    {
		//ground erase
		c.setColor (ground);
		c.fillRect (355, 329 - y, 82, 31);
		//water erase
		c.setColor (Color.blue);
		c.fillRect (326, 350, 120, 140);

		//draw hair
		c.setColor (hair);
		c.fillOval (349, 357 - y, 36, 36);
		//draw trident
		c.setColor (gold);
		c.fillRect (419, 340 - y, 8, 110);
		c.setColor (gold);
		c.fillRect (409, 355 - y, 28, 8);
		c.setColor (gold);
		c.fillRect (409, 335 - y, 5, 28);
		c.setColor (gold);
		c.fillRect (432, 335 - y, 5, 28);
		for (int x = 0 ; x < 5 ; x++)
		{
		    c.setColor (gold);
		    c.drawLine (409 + x, 335 - y, 411, 330 - y);
		    c.setColor (gold);
		    c.drawLine (432 + x, 335 - y, 434, 330 - y);
		}
		for (int x = 0 ; x < 8 ; x++)
		{
		    c.setColor (gold);
		    c.drawLine (419 + x, 340 - y, 422, 332 - y);
		}

		//draw face and body
		c.setColor (face);
		c.fillOval (352, 360 - y, 30, 30);
		c.setColor (face);
		c.fillRect (352, 390 - y, 30, 40);
		c.setColor (face);
		c.fillOval (342, 390 - y, 10, 10);
		c.setColor (face);
		c.fillOval (382, 390 - y, 10, 10);
		c.setColor (face);
		c.fillOval (402, 390 - y, 10, 10);
		c.setColor (face);
		c.fillOval (417, 375 - y, 10, 10);
		c.setColor (face);
		c.fillOval (327, 405 - y, 10, 10);
		c.setColor (face);
		c.fillOval (342, 420 - y, 10, 10);

		//arm coordinates
		int topLeftArmX[] = {342, 347, 332, 327};
		int topLeftArmY[] = {395 - y, 400 - y, 415 - y, 410 - y};
		int topRightArmX[] = {387, 387, 407, 407};
		int topRightArmY[] = {392 - y, 398 - y, 398 - y, 392 - y};
		int bottomLeftArmX[] = {332, 332, 347, 347};
		int bottomLeftArmY[] = {415 - y, 405 - y, 420 - y, 430 - y};
		int bottomRightArmX[] = {407, 407, 427, 417};
		int bottomRightArmY[] = {390 - y, 398 - y, 380 - y, 380 - y};
		//draw arms
		c.setColor (face);
		c.fillPolygon (topLeftArmX, topLeftArmY, 4);
		c.setColor (face);
		c.fillPolygon (bottomLeftArmX, bottomLeftArmY, 4);
		c.setColor (face);
		c.fillPolygon (topRightArmX, topRightArmY, 4);
		c.setColor (face);
		c.fillPolygon (bottomRightArmX, bottomRightArmY, 4);

		//draw bangs
		c.setColor (hair);
		c.fillArc (352, 354 - y, 17, 15, 210, 180);
		c.setColor (hair);
		c.fillArc (367, 354 - y, 17, 15, 140, 180);
		//draw beard
		c.setColor (hair);
		c.fillOval (351, 380 - y, 32, 12);
		c.setColor (hair);
		c.fillOval (355, 387 - y, 24, 9);
		c.setColor (hair);
		c.fillOval (362, 392 - y, 10, 6);
		c.setColor (tail);
		c.fillArc (352, 370 - y, 30, 120, 180, 180);
		c.setColor (lightTail);
		c.fillOval (350, 426 - y, 34, 5);
		//draw eyes
		c.setColor (Color.black);
		c.fillOval (357, 372 - y, 5, 5);
		c.setColor (Color.black);
		c.fillOval (372, 372 - y, 5, 5);
		//draw abdominal muscles
		c.setColor (skin);
		c.drawLine (367, 400 - y, 367, 422 - y);
		c.setColor (skin);
		c.drawArc (357, 402 - y, 10, 5, 180, 180);
		c.setColor (skin);
		c.drawArc (357, 412 - y, 10, 5, 180, 180);
		c.setColor (skin);
		c.drawArc (367, 402 - y, 10, 5, 180, 180);
		c.setColor (skin);
		c.drawArc (367, 412 - y, 10, 5, 180, 180);

		//arrays for traingular tail portion
		int tailX[] = {367, 412, 367};
		int tailY[] = {490 - y, 470 - y, 460 - y};
		c.setColor (tail);
		//draw traingular portion of tail
		c.fillPolygon (tailX, tailY, 3);

		//array for crown coordinates
		int crownX[] = {357, 377, 377, 372, 367, 362, 357};
		int crownY[] = {362 - y, 362 - y, 352 - y, 357 - y, 352 - y, 357 - y, 352 - y};
		c.setColor (gold);
		//draw crown
		c.fillPolygon (crownX, crownY, 7);
		try
		{
		    Thread.sleep (40);
		}
		catch (Exception e)
		{
		}

	    }
	}
	for (int y = 0 ; y >= -190 ; y--) //this for loop makes Poseidon exit the scene by moving down
	{
	    //erase over ground
	    c.setColor (ground);
	    c.fillRect (355, 329 - y, 82, 31);
	    //erase over water
	    c.setColor (Color.blue);
	    c.fillRect (326, 350, 120, 150);

	    //draw hair
	    c.setColor (hair);
	    c.fillOval (349, 357 - y, 36, 36);


	    //draw trident
	    c.setColor (gold);
	    c.fillRect (419, 340 - y, 8, 110);
	    c.setColor (gold);
	    c.fillRect (409, 355 - y, 28, 8);
	    c.setColor (gold);
	    c.fillRect (409, 335 - y, 5, 28);
	    c.setColor (gold);
	    c.fillRect (432, 335 - y, 5, 28);
	    for (int x = 0 ; x < 5 ; x++)
	    {
		c.setColor (gold);
		c.drawLine (409 + x, 335 - y, 411, 330 - y);
		c.setColor (gold);
		c.drawLine (432 + x, 335 - y, 434, 330 - y);
	    }
	    for (int x = 0 ; x < 8 ; x++)
	    {
		c.setColor (gold);
		c.drawLine (419 + x, 340 - y, 422, 332 - y);
	    }

	    //draws face and body
	    c.setColor (face);
	    c.fillOval (352, 360 - y, 30, 30);
	    c.setColor (face);
	    c.fillRect (352, 390 - y, 30, 40);
	    c.setColor (face);
	    c.fillOval (342, 390 - y, 10, 10);
	    c.setColor (face);
	    c.fillOval (382, 390 - y, 10, 10);
	    c.setColor (face);
	    c.fillOval (402, 390 - y, 10, 10);
	    c.setColor (face);
	    c.fillOval (417, 375 - y, 10, 10);
	    c.setColor (face);
	    c.fillOval (327, 405 - y, 10, 10);
	    c.setColor (face);
	    c.fillOval (342, 420 - y, 10, 10);

	    //arrays for arm coordinates
	    int topLeftArmX[] = {342, 347, 332, 327};
	    int topLeftArmY[] = {395 - y, 400 - y, 415 - y, 410 - y};
	    int topRightArmX[] = {387, 387, 407, 407};
	    int topRightArmY[] = {392 - y, 398 - y, 398 - y, 392 - y};
	    int bottomLeftArmX[] = {332, 332, 347, 347};
	    int bottomLeftArmY[] = {415 - y, 405 - y, 420 - y, 430 - y};
	    int bottomRightArmX[] = {407, 407, 427, 417};
	    int bottomRightArmY[] = {390 - y, 398 - y, 380 - y, 380 - y};
	    //draw arms
	    c.setColor (face);
	    c.fillPolygon (topLeftArmX, topLeftArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (bottomLeftArmX, bottomLeftArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (topRightArmX, topRightArmY, 4);
	    c.setColor (face);
	    c.fillPolygon (bottomRightArmX, bottomRightArmY, 4);
	    //draw bangs
	    c.setColor (hair);
	    c.fillArc (352, 354 - y, 17, 15, 210, 180);
	    c.setColor (hair);
	    c.fillArc (367, 354 - y, 17, 15, 140, 180);
	    //draw beard
	    c.setColor (hair);
	    c.fillOval (351, 380 - y, 32, 12);
	    c.setColor (hair);
	    c.fillOval (355, 387 - y, 24, 9);
	    c.setColor (hair);
	    c.fillOval (362, 392 - y, 10, 6);
	    //draw tail
	    c.setColor (tail);
	    c.fillArc (352, 370 - y, 30, 120, 180, 180);
	    c.setColor (lightTail);
	    c.fillOval (350, 426 - y, 34, 5);
	    //draw eyes
	    c.setColor (Color.black);
	    c.fillOval (357, 372 - y, 5, 5);
	    c.setColor (Color.black);
	    c.fillOval (372, 372 - y, 5, 5);
	    //draw abdominal muscles
	    c.setColor (skin);
	    c.drawLine (367, 400 - y, 367, 422 - y);
	    c.setColor (skin);
	    c.drawArc (357, 402 - y, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (357, 412 - y, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (367, 402 - y, 10, 5, 180, 180);
	    c.setColor (skin);
	    c.drawArc (367, 412 - y, 10, 5, 180, 180);

	    //arrays for traingular portion of tail coordinates
	    int tailX[] = {367, 412, 367};
	    int tailY[] = {490 - y, 470 - y, 460 - y};
	    c.setColor (tail);
	    //draw traingular portion of tail
	    c.fillPolygon (tailX, tailY, 3);

	    //array for crown coordinates
	    int crownX[] = {357, 377, 377, 372, 367, 362, 357};
	    int crownY[] = {362 - y, 362 - y, 352 - y, 357 - y, 352 - y, 357 - y, 352 - y};
	    c.setColor (gold);
	    //draw crown
	    c.fillPolygon (crownX, crownY, 7);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }

	}

    }


    public Poseidon (Console con) //class constructor
    {
	c = con; //passes console
    }


    public void run () //run method
    {
	poseidon ();
    }
}


