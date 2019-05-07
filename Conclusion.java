/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class is the conclusion. It closes the scene with red curtains
   and outputs the words "The End" to show the user that the animation has ended.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Conclusion //Conclusion class
{
    private Console c; //console class reference

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


    public void draw ()  //draw method
    {
	//colour declarations
	Color gold = new Color (255, 215, 0);
	Color curtainRed = new Color (147, 0, 12);
	c.setColor (curtainRed); //draw curtains using lines
	for (int x = 0 ; x < 321 ; x++)
	{
	    c.drawLine (x, 0, x, 500);
	    c.drawLine (640 - x, 0, 640 - x, 500);
	    delay (5);
	}
	c.setColour (gold); //output the words "The End"
	c.setFont (new Font ("Elephant", 0, 25));
	c.drawString ("The End", 260, 230);
    }


    public Conclusion (Console con)  //class constructor
    {
	c = con; //passes output console
	draw (); //calls draw method
    }
}
