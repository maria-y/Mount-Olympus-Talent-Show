/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class is that animates the three Hippocampi (half horse half fish).
   They are Poseidon's followers and they follow him into the scene from the left
   and perform his routine with him, also leaving the scene through the bottom. This
   class includes three overloaded constructors.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Hippocampus extends Thread //Hippocampus class
{
    private Console c; //referance variable for COnsole class
    //declarations for parameters that change in overloaded constructors
    private Color fur;
    private int positionX, positionY;
    private int delay;
    private int danceDirection;

    public void hippocampus ()
    {
	//colour declarations
	Color lightTail = new Color (129, 234, 150);
	Color darkFur = new Color (94, 63, 28);
	Color nose = new Color (114, 83, 48);
	Color stone = new Color (165, 147, 124);
	Color pillar = new Color (247, 206, 170);
	Color ground = new Color (198, 153, 85);
	Color tanBrown = new Color (224, 179, 107);
	Color tail = new Color (109, 214, 130);

	for (int i = -396 ; i < -8 ; i++)
	{

	    //ground erase
	    c.setColor (ground);
	    c.fillRect (positionX + i + 98, positionY + 330, 60, 350 - positionY - 330);
	    //redraw stone perimeter
	    for (int x = 0 ; x < 10 ; x++)
	    {
		c.setColor (stone);
		c.drawArc (-80, 250 + x, 800, 520, 135, 6);
		c.setColor (Color.blue);
		c.fillRect (10, 350, 6, 5);
	    }
	    //erase over water
	    c.setColor (Color.blue);
	    c.fillRect (positionX + i + 98, 350, 60, positionY + 480 - 350);

	    //draw tail
	    c.setColor (tail);
	    c.fillArc (positionX + i + 100, positionY + 360, 40, 120, 180, 180);
	    c.setColor (lightTail);
	    c.fillOval (positionX + i + 98, positionY + 418, 44, 8);
	    //draw upper body
	    c.setColor (fur);
	    c.fillArc (positionX + i + 100, positionY + 360, 40, 120, 0, 180);
	    //draw face
	    c.setColor (fur);
	    c.fillArc (positionX + i + 100, positionY + 335, 40, 40, 0, 180);
	    //draw chin
	    int chinX[] = {positionX + i + 100, positionX + i + 140, positionX + i + 128, positionX + i + 112};
	    int chinY[] = {positionY + 355, positionY + 355, positionY + 390, positionY + 390};
	    c.setColor (fur);
	    c.fillPolygon (chinX, chinY, 4);
	    //draw triangular portion of tail
	    c.setColor (tail);
	    int tailX[] = {positionX + i + 120, positionX + i + 165, positionX + i + 120};
	    int tailY[] = {positionY + 479, positionY + 459, positionY + 449};
	    c.fillPolygon (tailX, tailY, 3);
	    //draw legs
	    c.setColor (darkFur);
	    c.fillArc (positionX + i + 108, positionY + 400, 8, 65, 0, 180);
	    c.setColor (darkFur);
	    c.fillArc (positionX + i + 124, positionY + 400, 8, 65, 0, 180);
	    //draw ears
	    int leftEarX[] = {positionX + i + 105, positionX + i + 103, positionX + i + 114};
	    int leftEarY[] = {positionY + 330, positionY + 345, positionY + 342};
	    int rightEarX[] = {positionX + i + 135, positionX + i + 137, positionX + i + 126};
	    int rightEarY[] = {positionY + 330, positionY + 345, positionY + 342};
	    c.setColor (darkFur);
	    c.fillPolygon (leftEarX, leftEarY, 3);
	    c.setColor (darkFur);
	    c.fillPolygon (rightEarX, rightEarY, 3);
	    //draw lines on face
	    c.setColor (darkFur);
	    c.drawArc (positionX + i + 105, positionY + 363, 8, 20, 0, 90);
	    c.setColor (darkFur);
	    c.drawArc (positionX + i + 125, positionY + 363, 8, 20, 90, 90);

	    //draw hooves
	    c.setColor (Color.black);
	    c.fillRect (positionX + i + 108, positionY + 432, 8, 4);
	    c.setColor (Color.black);
	    c.fillRect (positionX + i + 124, positionY + 432, 8, 4);

	    //draw nose
	    c.setColor (nose);
	    c.fillOval (positionX + i + 111, positionY + 372, 18, 16);

	    //draw eyes
	    c.setColor (Color.black);
	    c.drawArc (positionX + i + 107, positionY + 352, 10, 5, 0, 180);
	    c.setColor (Color.black);
	    c.drawArc (positionX + i + 123, positionY + 352, 10, 5, 0, 180);
	    c.setColor (Color.black);
	    c.fillOval (positionX + i + 110, positionY + 352, 5, 5);
	    c.setColor (Color.black);
	    c.fillOval (positionX + i + 127, positionY + 352, 5, 5);
	    //draw hair
	    c.setColor (Color.black);
	    c.fillArc (positionX + i + 110, positionY + 334, 20, 17, 300, 300);

	    //draw lines on nose
	    c.setColour (Color.pink);
	    c.drawArc (positionX + i + 107, positionY + 377, 8, 15, 0, 90);
	    c.setColour (Color.pink);
	    c.drawArc (positionX + i + 124, positionY + 377, 8, 15, 90, 91);
	    //re-draw pillar
	    c.setColour (pillar);
	    c.fillRect (40, 280, 40, 250);
	    c.setColor (tanBrown);
	    c.drawLine (40, 250, 40, 500);
	    c.setColor (tanBrown);
	    c.drawLine (80, 250, 80, 500);
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }

	}
	//this for loop is a continuation of the hippocampi entering the scene
	//after passing the pillar
	for (int i = -8 ; i <= 10 ; i++)
	{
	    //ground erase
	    c.setColor (ground);
	    c.fillRect (positionX + i + 97, positionY + 330, 60, 350 - positionY - 330);
	    c.setColor (Color.blue); //erase over water
	    c.fillRect (positionX + 98 + i, 350, 60, positionY + 480 - 350);
	    c.setColor (tail); //draw tail
	    c.fillArc (positionX + i + 100, positionY + 360, 40, 120, 180, 180);
	    c.setColor (lightTail);
	    c.fillOval (positionX + i + 98, positionY + 418, 44, 8);
	    c.setColor (fur); //draw upper body
	    c.fillArc (positionX + i + 100, positionY + 360, 40, 120, 0, 180);
	    c.setColor (fur); //draw face
	    c.fillArc (positionX + i + 100, positionY + 335, 40, 40, 0, 180);
	    int chinX[] = {positionX + i + 100, positionX + i + 140, positionX + i + 128, positionX + i + 112};
	    int chinY[] = {positionY + 355, positionY + 355, positionY + 390, positionY + 390};
	    c.setColor (fur);
	    c.fillPolygon (chinX, chinY, 4); //draw chin
	    c.setColor (tail); //draw triangular portion of tail
	    int tailX[] = {positionX + i + 120, positionX + i + 165, positionX + i + 120};
	    int tailY[] = {positionY + 479, positionY + 459, positionY + 449};
	    c.fillPolygon (tailX, tailY, 3);
	    c.setColor (darkFur); //draw legs
	    c.fillArc (positionX + i + 108, positionY + 400, 8, 65, 0, 180);
	    c.setColor (darkFur);
	    c.fillArc (positionX + i + 124, positionY + 400, 8, 65, 0, 180);
	    int leftEarX[] = {positionX + i + 105, positionX + i + 103, positionX + i + 114};
	    int leftEarY[] = {positionY + 330, positionY + 345, positionY + 342};
	    int rightEarX[] = {positionX + i + 135, positionX + i + 137, positionX + i + 126};
	    int rightEarY[] = {positionY + 330, positionY + 345, positionY + 342};
	    c.setColor (darkFur); //draw ears
	    c.fillPolygon (leftEarX, leftEarY, 3);
	    c.setColor (darkFur);
	    c.fillPolygon (rightEarX, rightEarY, 3);
	    c.setColor (darkFur); //draw lines on face
	    c.drawArc (positionX + i + 105, positionY + 363, 8, 20, 0, 90);
	    c.setColor (darkFur);
	    c.drawArc (positionX + i + 125, positionY + 363, 8, 20, 90, 90);
	    //draw hooves
	    c.setColor (Color.black);
	    c.fillRect (positionX + i + 108, positionY + 432, 8, 4);
	    c.setColor (Color.black);
	    c.fillRect (positionX + i + 124, positionY + 432, 8, 4);
	    //draw nose
	    c.setColor (nose);
	    c.fillOval (positionX + i + 111, positionY + 372, 18, 16);
	    //draw eyes
	    c.setColor (Color.black);
	    c.drawArc (positionX + i + 107, positionY + 352, 10, 5, 0, 180);
	    c.setColor (Color.black);
	    c.drawArc (positionX + i + 123, positionY + 352, 10, 5, 0, 180);
	    c.setColor (Color.black);
	    c.fillOval (positionX + i + 110, positionY + 352, 5, 5);
	    c.setColor (Color.black);
	    c.fillOval (positionX + i + 127, positionY + 352, 5, 5);
	    c.setColor (Color.black); //draw hair
	    c.fillArc (positionX + i + 110, positionY + 334, 20, 17, 300, 300);

	    c.setColour (Color.pink); //draw lines on nose
	    c.drawArc (positionX + i + 107, positionY + 377, 8, 15, 0, 90);
	    c.setColour (Color.pink);
	    c.drawArc (positionX + i + 124, positionY + 377, 8, 15, 90, 91);
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int z = 0 ; z < 3 ; z++) //this for loop make the hippocampi move up and down
	{
	    for (int x = 0 ; x < 10 ; x++) //this for loop makes one of them move up and two of them move down
	    {
		c.setColor (ground); //ground erase
		c.fillRect (positionX + 108, positionY + 330 + x * danceDirection, 60, 350 - (positionY + 330 + x * danceDirection));
		c.setColor (Color.blue); //erase over water
		c.fillRect (positionX + 108, 350, 67, positionY + 480 - 350);
		c.setColor (tail); //draw tail
		c.fillArc (positionX + 110, positionY + 360 + x * danceDirection, 40, 120, 180, 180);
		c.setColor (lightTail);
		c.fillOval (positionX + 108, positionY + 418 + x * danceDirection, 44, 8);
		c.setColor (fur); //draw upper body
		c.fillArc (positionX + 110, positionY + 360 + x * danceDirection, 40, 120, 0, 180);
		c.setColor (fur); //draw face
		c.fillArc (positionX + 110, positionY + 335 + x * danceDirection, 40, 40, 0, 180);
		int chinX[] = {positionX + 110, positionX + 150, positionX + 138, positionX + 122};
		int chinY[] = {positionY + 355 + x * danceDirection, positionY + 355 + x * danceDirection, positionY + x * danceDirection + 390, positionY + x * danceDirection + 390};
		c.setColor (fur);
		c.fillPolygon (chinX, chinY, 4); //draw chin
		c.setColor (tail); //draw triangular portion of tail
		int tailX[] = {positionX + 130, positionX + 175, positionX + 130};
		int tailY[] = {positionY + 479 + x * danceDirection, positionY + 459 + x * danceDirection, positionY + 449 + x * danceDirection};
		c.fillPolygon (tailX, tailY, 3);
		c.setColor (darkFur); //draw legs
		c.fillArc (positionX + 118, positionY + x * danceDirection + 400, 8, 65, 0, 180);
		c.setColor (darkFur);
		c.fillArc (positionX + 134, positionY + x * danceDirection + 400, 8, 65, 0, 180);
		int leftEarX[] = {positionX + 115, positionX + 113, positionX + 124};
		int leftEarY[] = {positionY + x * danceDirection + 330, positionY + x * danceDirection + 345, positionY + x * danceDirection + 342};
		int rightEarX[] = {positionX + 145, positionX + 147, positionX + 136};
		int rightEarY[] = {positionY + x * danceDirection + 330, positionY + x * danceDirection + 345, positionY + x * danceDirection + 342};
		c.setColor (darkFur); //draw ears
		c.fillPolygon (leftEarX, leftEarY, 3);
		c.setColor (darkFur);
		c.fillPolygon (rightEarX, rightEarY, 3);
		c.setColor (darkFur); //draw lines on face
		c.drawArc (positionX + 115, positionY + x * danceDirection + 363, 8, 20, 0, 90);
		c.setColor (darkFur);
		c.drawArc (positionX + 135, positionY + x * danceDirection + 363, 8, 20, 90, 90);

		c.setColor (Color.black); //draw hooves
		c.fillRect (positionX + 118, positionY + x * danceDirection + 432, 8, 4);
		c.setColor (Color.black);
		c.fillRect (positionX + 134, positionY + x * danceDirection + 432, 8, 4);

		c.setColor (nose); //draw nose
		c.fillOval (positionX + 121, positionY + x * danceDirection + 372, 18, 16);

		c.setColor (Color.black); //draw eyes
		c.drawArc (positionX + 117, positionY + x * danceDirection + 352, 10, 5, 0, 180);
		c.setColor (Color.black);
		c.drawArc (positionX + 133, positionY + x * danceDirection + 352, 10, 5, 0, 180);
		c.setColor (Color.black);
		c.fillOval (positionX + 120, positionY + x * danceDirection + 352, 5, 5);
		c.setColor (Color.black);
		c.fillOval (positionX + 137, positionY + x * danceDirection + 352, 5, 5);
		c.setColor (Color.black); //draw hair
		c.fillArc (positionX + 120, positionY + x * danceDirection + 334, 20, 17, 300, 300);

		c.setColour (Color.pink);
		//draw lines on nose
		c.drawArc (positionX + 117, positionY + x * danceDirection + 377, 8, 15, 0, 90);
		c.setColour (Color.pink);
		c.drawArc (positionX + 134, positionY + x * danceDirection + 377, 8, 15, 90, 91);
		try
		{
		    Thread.sleep (delay);
		}
		catch (Exception e)
		{
		}

	    }
	    for (int x = 9 ; x >= 0 ; x--) //this for loop makes one of them move down and two of them move up
	    {
		c.setColor (ground); //ground erase
		c.fillRect (positionX + 108, positionY + 330 + x * danceDirection, 60, 350 - positionY - 330);
		c.setColor (Color.blue); //erase over water
		c.fillRect (positionX + 108, 350, 67, positionY + 500 - 350);
		c.setColor (tail); //draw tail
		c.fillArc (positionX + 110, positionY + 360 + x * danceDirection, 40, 120, 180, 180);
		c.setColor (lightTail);
		c.fillOval (positionX + 108, positionY + 418 + x * danceDirection, 44, 8);
		c.setColor (fur); //draw upper body
		c.fillArc (positionX + 110, positionY + 360 + x * danceDirection, 40, 120, 0, 180);
		c.setColor (fur); //draw face
		c.fillArc (positionX + 110, positionY + 335 + x * danceDirection, 40, 40, 0, 180);
		int chinX[] = {positionX + 110, positionX + 150, positionX + 138, positionX + 122};
		int chinY[] = {positionY + 355 + x * danceDirection, positionY + 355 + x * danceDirection, positionY + x * danceDirection + 390, positionY + x * danceDirection + 390};
		c.setColor (fur);
		c.fillPolygon (chinX, chinY, 4); //draw chin
		c.setColor (tail); //draw triangular portion of tail
		int tailX[] = {positionX + 130, positionX + 175, positionX + 130};
		int tailY[] = {positionY + 479 + x * danceDirection, positionY + 459 + x * danceDirection, positionY + 449 + x * danceDirection};
		c.fillPolygon (tailX, tailY, 3);
		c.setColor (darkFur); //draw legs
		c.fillArc (positionX + 118, positionY + x * danceDirection + 400, 8, 65, 0, 180);
		c.setColor (darkFur);
		c.fillArc (positionX + 134, positionY + x * danceDirection + 400, 8, 65, 0, 180);
		int leftEarX[] = {positionX + 115, positionX + 113, positionX + 124};
		int leftEarY[] = {positionY + x * danceDirection + 330, positionY + x * danceDirection + 345, positionY + x * danceDirection + 342};
		int rightEarX[] = {positionX + 145, positionX + 147, positionX + 136};
		int rightEarY[] = {positionY + x * danceDirection + 330, positionY + x * danceDirection + 345, positionY + x * danceDirection + 342};
		c.setColor (darkFur); //draw ears
		c.fillPolygon (leftEarX, leftEarY, 3);
		c.setColor (darkFur);
		c.fillPolygon (rightEarX, rightEarY, 3);
		c.setColor (darkFur); //draw lines on face
		c.drawArc (positionX + 115, positionY + x * danceDirection + 363, 8, 20, 0, 90);
		c.setColor (darkFur);
		c.drawArc (positionX + 135, positionY + x * danceDirection + 363, 8, 20, 90, 90);

		c.setColor (Color.black); //draw hooves
		c.fillRect (positionX + 118, positionY + x * danceDirection + 432, 8, 4);
		c.setColor (Color.black);
		c.fillRect (positionX + 134, positionY + x * danceDirection + 432, 8, 4);

		c.setColor (nose); //draw nose
		c.fillOval (positionX + 121, positionY + x * danceDirection + 372, 18, 16);

		c.setColor (Color.black); //draw eyes
		c.drawArc (positionX + 117, positionY + x * danceDirection + 352, 10, 5, 0, 180);
		c.setColor (Color.black);
		c.drawArc (positionX + 133, positionY + x * danceDirection + 352, 10, 5, 0, 180);
		c.setColor (Color.black);
		c.fillOval (positionX + 120, positionY + x * danceDirection + 352, 5, 5);
		c.setColor (Color.black);
		c.fillOval (positionX + 137, positionY + x * danceDirection + 352, 5, 5);
		c.setColor (Color.black); //draw hair
		c.fillArc (positionX + 120, positionY + x * danceDirection + 334, 20, 17, 300, 300);

		c.setColour (Color.pink); //draw lines on nose
		c.drawArc (positionX + 117, positionY + x * danceDirection + 377, 8, 15, 0, 90);
		c.setColour (Color.pink);
		c.drawArc (positionX + 134, positionY + x * danceDirection + 377, 8, 15, 90, 91);
		try
		{
		    Thread.sleep (delay);
		}
		catch (Exception e)
		{
		}

	    }


	}
	for (int x = 0 ; x <= 190 ; x++) //this for loop makes teh hippocampi exit by moving down into the water
	{
	    c.setColor (ground); //ground erase
	    c.fillRect (positionX + 108, positionY + 330 + x, 60, 350 - positionY - 330);
	    c.setColor (Color.blue); //erase over water
	    c.fillRect (positionX + 108, 350, 67, 150);
	    c.setColor (tail); //draw tail
	    c.fillArc (positionX + 110, positionY + 360 + x, 40, 120, 180, 180);
	    c.setColor (lightTail);
	    c.fillOval (positionX + 108, positionY + 418 + x, 44, 8);
	    c.setColor (fur); //draw upper body
	    c.fillArc (positionX + 110, positionY + 360 + x, 40, 120, 0, 180);
	    c.setColor (fur); //draw face
	    c.fillArc (positionX + 110, positionY + 335 + x, 40, 40, 0, 180);
	    int chinX[] = {positionX + 110, positionX + 150, positionX + 138, positionX + 122};
	    int chinY[] = {positionY + 355 + x, positionY + 355 + x, positionY + x + 390, positionY + x + 390};
	    c.setColor (fur);
	    c.fillPolygon (chinX, chinY, 4); //draw chin
	    c.setColor (tail);
	    int tailX[] = {positionX + 130, positionX + 175, positionX + 130};
	    int tailY[] = {positionY + 479 + x, positionY + 459 + x, positionY + 449 + x};
	    c.fillPolygon (tailX, tailY, 3); //draw triangular portion of tail
	    c.setColor (darkFur); //draw legs
	    c.fillArc (positionX + 118, positionY + x + 400, 8, 65, 0, 180);
	    c.setColor (darkFur);
	    c.fillArc (positionX + 134, positionY + x + 400, 8, 65, 0, 180);
	    int leftEarX[] = {positionX + 115, positionX + 113, positionX + 124};
	    int leftEarY[] = {positionY + x + 330, positionY + x + 345, positionY + x + 342};
	    int rightEarX[] = {positionX + 145, positionX + 147, positionX + 136};
	    int rightEarY[] = {positionY + x + 330, positionY + x + 345, positionY + x + 342};
	    c.setColor (darkFur);
	    c.fillPolygon (leftEarX, leftEarY, 3); //draw ears
	    c.setColor (darkFur);
	    c.fillPolygon (rightEarX, rightEarY, 3);
	    c.setColor (darkFur); //draw lines on face
	    c.drawArc (positionX + 115, positionY + x + 363, 8, 20, 0, 90);
	    c.setColor (darkFur);
	    c.drawArc (positionX + 135, positionY + x + 363, 8, 20, 90, 90);
	    //draw hooves
	    c.setColor (Color.black);
	    c.fillRect (positionX + 118, positionY + x + 432, 8, 4);
	    c.setColor (Color.black);
	    c.fillRect (positionX + 134, positionY + x + 432, 8, 4);
	    //draw nose
	    c.setColor (nose);
	    c.fillOval (positionX + 121, positionY + x + 372, 18, 16);
	    //draw eyes
	    c.setColor (Color.black);
	    c.drawArc (positionX + 117, positionY + x + 352, 10, 5, 0, 180);
	    c.setColor (Color.black);
	    c.drawArc (positionX + 133, positionY + x + 352, 10, 5, 0, 180);
	    c.setColor (Color.black);
	    c.fillOval (positionX + 120, positionY + x + 352, 5, 5);
	    c.setColor (Color.black);
	    c.fillOval (positionX + 137, positionY + x + 352, 5, 5);
	    c.setColor (Color.black); //draw hair
	    c.fillArc (positionX + 120, positionY + x + 334, 20, 17, 300, 300);

	    c.setColour (Color.pink); //draw lines on nose
	    c.drawArc (positionX + 117, positionY + x + 377, 8, 15, 0, 90);
	    c.setColour (Color.pink);
	    c.drawArc (positionX + 134, positionY + x + 377, 8, 15, 90, 91);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }

	}

    }


    //basic constructor, passes console
    public Hippocampus (Console con)
    {
	c = con;
	fur = new Color (155, 115, 69); //default fur colour
	positionX = 130; //position
	positionY = 10;
	delay = 40; //default delay
	danceDirection = 1; //direction while dancing is positive
    }


    //second cosntructor, passes console and a colour
    public Hippocampus (Console con, Color f)
    {
	c = con;
	fur = f; //selected fur colour
	positionX = 55; //positon
	positionY = -20;
	delay = 40; //default delay
	danceDirection = -1;  //direction while dancing is negative

    }


    //third cosntructor, passes console, colour and delay
    public Hippocampus (Console con, Color f, int t)
    {
	c = con;
	fur = f; //selected fur colour
	positionX = -10; //position
	positionY = 10;
	delay = t; //selected delay
	danceDirection = 1; //direction while dancing is positive
    }


    public void run ()  //run method
    {
	hippocampus ();
    }
}


