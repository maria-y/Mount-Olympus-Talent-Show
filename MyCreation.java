/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class is the main class for the animation.
   This animation tells the story of the Mount Olympus Talent Show, an annual event
   where the gods of ancient Greece come to perform. At this year's show, there are
   four acts. First off, there is Poseidon with his Hippocampi. They flood the
   ampitheatre to perform a synchronised swimming routine. Next up, Hades and
   Cerberus perform a song duet. The third act is Artemis, who comes and shoots an
   arrow at the target. Finally, the last act is Hercules who comes and slays the
   Hydra using fire. Then the show ends.

*/


// The "MyCreation" class
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c; //the output Console

    //adds the IntroBackground class to MyCreation
    public void introBackground ()
    {
	IntroBackground b = new IntroBackground (c);
    }


    //adds the MainBackground class to MyCreation
    public void mainBackground ()
    {
	MainBackground m = new MainBackground (c);
    }


    //adds the FloodGround class to MyCreation (ampitheatre flooding)
    public void floodGround ()
    {
	FloodGround f = new FloodGround (c);
	f.start (); //starts the thread
	try
	{
	    f.join (); //joins with the poseidon thread, so that posedion only runs once this is done
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Poseidon class to MyCreation
    public void poseidon ()
    {
	Poseidon p = new Poseidon (c);
	//starts the thread
	p.start ();

    }


    //adds the Hippocampus class to MyCreation
    public void hippocampus ()
    {
	Hippocampus h = new Hippocampus (c);
	//starts the basic overloaded constructor
	h.start ();
	Hippocampus h1 = new Hippocampus (c, Color.orange);
	//starts the colour changing overloaded constructor
	h1.start ();
	Hippocampus h2 = new Hippocampus (c, Color.yellow, 60);
	//starts the colour and speed changing overloaded constructor
	h2.start ();
	try
	{
	    h2.join (); //joins hippocampus to emptyWater, so emptyWater only runs once hippocampus is done
	}
	catch (InterruptedException e)
	{
	}

    }


    //adds the EmptyWater class to MyCreation
    public void emptyWater ()
    {
	EmptyWater w = new EmptyWater (c);
	//starts the thread
	w.start ();
	try
	{
	    w.join (); //joins this thread with cerberus, so cerberus only runs once it is complete
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Cerberus class to MyCreation
    public void cerberus ()
    {
	Cerberus u = new Cerberus (c);
	//starts the thread
	u.start ();

    }


    //adds the Hades class to MyCreation
    public void hades ()
    {
	Hades h = new Hades (c);
	//starts the thread
	h.start ();
	try
	{
	    h.join (); //joines the thread with artemis
	}
	catch (InterruptedException e)
	{
	}
    }




    //adds the Artemis class to MyCreation
    public void artemis ()
    {
	Artemis a = new Artemis (c);
	a.start ();
	try
	{
	    a.join (); //joins artemis to hercules
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Hercules class to MyCreation
    public void hercules ()
    {
	Hercules h = new Hercules (c);
	//starts the thread
	h.run ();
    }


    //adds the Conclusion class to MyCreation
    public void conclusion ()
    {
	Conclusion o = new Conclusion (c);
    }


    //class constructor
    //creates a new window and gives it a name
    public MyCreation ()
    {
	c = new Console ("My Creation - Mount Olympus Talent Show");
    }


    public static void main (String[] args)  //main method, where all other methods are called
    {
	MyCreation z = new MyCreation ();
	z.introBackground ();
	z.mainBackground ();
	z.floodGround ();
	z.poseidon ();
	z.hippocampus ();
	z.emptyWater ();
	z.cerberus ();
	z.hades ();
       z.artemis ();
       z.hercules ();
       z.conclusion ();
    }
}
