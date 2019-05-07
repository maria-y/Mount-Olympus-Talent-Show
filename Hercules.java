/*
   Name: Maria Yampolsky
   Teacher: Ms. Krasteva
   Date: October 22nd, 2018
   Description: This class animates Hercules, who performs the final act. For his act
   he slays the Hydra (a multi-headed snake). He comes in carrying a torch and throws
   it at the Hydra, causing it to burst in flame. He enters from the left of
   scene, and exits the same way.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Hercules implements Runnable //Hercules class
{
    private Console c; //console class reference

    public void hercules ()
    {
	//colour declaration
	Color hair = new Color (44, 49, 51);
	Color skin = new Color (255, 197, 112);
	Color skinShade2 = new Color (251, 177, 85);
	Color skinShade3 = new Color (241, 167, 75);
	Color cape = new Color (255, 204, 50);
	Color darkOrange = new Color (226, 129, 9);
	Color skirt = new Color (166, 215, 234);
	Color ground = new Color (198, 153, 85);
	Color tanBrown = new Color (224, 179, 107);
	Color pillar = new Color (247, 206, 170);
	Color stone = new Color (165, 147, 124);

	for (int i = -340 ; i <= 0 ; i++) //this for loop animates Hercules entering from the left
	{
	    c.setColor (ground); //erase
	    c.fillRect (209 + i, 329, 110, 161);
	    for (int x = 0 ; x < 10 ; x++) //re-draws the stone perimeter
	    {
		c.setColor (stone);
		c.drawArc (-80, 250 + x, 800, 520, 135, 45);
	    }
	    c.setColor (darkOrange); //lion cape
	    c.fillOval (280 + i, 329, 40, 30);
	    int capeBackX[] = {285 + i, 315 + i, 325 + i, 275 + i};
	    int capeBackY[] = {344, 344, 380, 380};
	    c.fillPolygon (capeBackX, capeBackY, 4);
	    c.setColor (cape);
	    c.fillOval (285 + i, 334, 30, 20);
	    c.setColor (darkOrange);
	    c.fillOval (294 + i, 342, 12, 12);
	    c.setColor (skin);
	    c.fillOval (280 + i, 348, 40, 35); //face
	    c.fillRect (275 + i, 380, 50, 50); //body
	    c.fillRect (280 + i, 460, 15, 25); //legs
	    c.fillRect (305 + i, 460, 15, 25);
	    c.fillOval (277 + i, 480, 18, 10); //feet
	    c.fillOval (305 + i, 480, 18, 10);
	    c.setColor (skirt);
	    int skirtX[] = {275 + i, 275 + i, 325 + i, 325 + i};
	    int skirtY[] = {430, 476, 461, 430};
	    c.fillPolygon (skirtX, skirtY, 4); //draw skirt
	    c.setColor (Color.black); //draw torch
	    c.fillRect (215 + i, 400, 12, 20);
	    c.setColor (Color.red);
	    c.fillArc (210 + i, 370, 22, 60, 0, 180);
	    c.setColor (Color.orange);
	    c.fillArc (215 + i, 375, 12, 50, 0, 180);
	    c.setColor (Color.yellow);
	    c.fillArc (218 + i, 380, 6, 40, 0, 180);
	    c.setColor (skinShade3); //abdominal muscles
	    c.drawLine (300 + i, 425, 300 + i, 400);
	    c.drawArc (290 + i, 415, 10, 8, 180, 180);
	    c.drawArc (290 + i, 405, 10, 8, 180, 180);
	    c.drawArc (300 + i, 405, 10, 8, 180, 180);
	    c.drawArc (300 + i, 415, 10, 8, 180, 180);
	    c.setColor (skinShade2); //arms, shoulders and hands
	    c.fillArc (260 + i, 380, 30, 30, 90, 180);
	    c.fillArc (310 + i, 380, 30, 30, 270, 180);
	    c.fillOval (250 + i, 390, 30, 30);
	    c.fillOval (227 + i, 398, 30, 26);
	    c.fillOval (214 + i, 403, 16, 16);
	    c.fillOval (310 + i, 390, 30, 45);
	    c.fillOval (317 + i, 432, 16, 16);
	    c.setColor (Color.black); //hair
	    for (int z = 0 ; z < 2 ; z++)
	    {
		c.fillOval (286 + i + z * 18, 348, 10, 10);
		c.fillOval (280 + i + z * 29, 353, 10, 10);
		c.fillOval (276 + i + z * 34, 360, 12, 12);
		c.fillOval (280 + i + z * 28, 369, 12, 12);
	    }
	    c.fillOval (286 + i, 373, 28, 12); //beard
	    c.fillOval (290 + i, 348, 20, 12); //hair at the top of head
	    c.fillOval (291 + i, 364, 4, 4); //eyes
	    c.fillOval (303 + i, 364, 4, 4);
	    c.drawLine (290 + i, 340, 294 + i, 344); //lion eyes
	    c.drawLine (294 + i, 340, 290 + i, 344);
	    c.drawLine (305 + i, 340, 309 + i, 344);
	    c.drawLine (309 + i, 340, 305 + i, 344);
	    c.setColor (darkOrange); //lion arms
	    int capeX[] = {275 + i, 285 + i, 300 + i, 315 + i, 325 + i, 300 + i};
	    int capeY[] = {380, 380, 395, 380, 380, 405};
	    c.fillPolygon (capeX, capeY, 6);
	    c.setColor (cape);
	    c.fillOval (295 + i, 395, 10, 10);
	    c.setColour (pillar); //re-draw pillar
	    c.fillRect (40, 328, 40, 162);
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
	for (int i = 0 ; i <= 40 ; i++) //this for loop animates Hercules moving up the scene
	{
	    c.setColor (ground); //erase
	    c.fillRect (210, 330 - i, 130, 161);
	    c.setColor (darkOrange); //lion cape
	    c.fillOval (280, 329 - i, 40, 30);
	    int capeBackX[] = {285, 315, 325, 275};
	    int capeBackY[] = {344 - i, 344 - i, 380 - i, 380 - i};
	    c.fillPolygon (capeBackX, capeBackY, 4);
	    c.setColor (cape);
	    c.fillOval (285, 334 - i, 30, 20);
	    c.setColor (darkOrange);
	    c.fillOval (294, 342 - i, 12, 12);
	    c.setColor (skin);
	    c.fillOval (280, 348 - i, 40, 35); //face
	    c.fillRect (275, 380 - i, 50, 50); //body
	    c.fillRect (280, 460 - i, 15, 25); //legs
	    c.fillRect (305, 460 - i, 15, 25);
	    c.fillOval (277, 480 - i, 18, 10); //feet
	    c.fillOval (305, 480 - i, 18, 10);
	    c.setColor (skirt); //draw skirt
	    int skirtX[] = {275, 275, 325, 325};
	    int skirtY[] = {430 - i, 476 - i, 461 - i, 430 - i};
	    c.fillPolygon (skirtX, skirtY, 4);
	    c.setColor (Color.black); //draw torch
	    c.fillRect (215, 400 - i, 12, 20);
	    c.setColor (Color.red);
	    c.fillArc (210, 370 - i, 22, 60, 0, 180);
	    c.setColor (Color.orange);
	    c.fillArc (215, 375 - i, 12, 50, 0, 180);
	    c.setColor (Color.yellow);
	    c.fillArc (218, 380 - i, 6, 40, 0, 180);
	    c.setColor (skinShade3); //abdominal muscles
	    c.drawLine (300, 425 - i, 300, 400 - i);
	    c.drawArc (290, 415 - i, 10, 8, 180, 180);
	    c.drawArc (290, 405 - i, 10, 8, 180, 180);
	    c.drawArc (300, 405 - i, 10, 8, 180, 180);
	    c.drawArc (300, 415 - i, 10, 8, 180, 180);
	    c.setColor (skinShade2); //arms, shoulders and hands
	    c.fillArc (260, 380 - i, 30, 30, 90, 180);
	    c.fillArc (310, 380 - i, 30, 30, 270, 180);
	    c.fillOval (250, 390 - i, 30, 30);
	    c.fillOval (227, 398 - i, 30, 26);
	    c.fillOval (214, 403 - i, 16, 16);
	    c.fillOval (310, 390 - i, 30, 45);
	    c.fillOval (317, 432 - i, 16, 16);
	    c.setColor (Color.black); //hair
	    for (int z = 0 ; z < 2 ; z++)
	    {
		c.fillOval (286 + z * 18, 348 - i, 10, 10);
		c.fillOval (280 + z * 29, 353 - i, 10, 10);
		c.fillOval (276 + z * 34, 360 - i, 12, 12);
		c.fillOval (280 + z * 28, 369 - i, 12, 12);
	    }
	    c.fillOval (286, 373 - i, 28, 12); //beard
	    c.fillOval (290, 348 - i, 20, 12); //hair at the top of head
	    c.fillOval (291, 364 - i, 4, 4); //eyes
	    c.fillOval (303, 364 - i, 4, 4);
	    c.drawLine (290, 340 - i, 294, 344 - i); //lion eyes
	    c.drawLine (294, 340 - i, 290, 344 - i);
	    c.drawLine (305, 340 - i, 309, 344 - i);
	    c.drawLine (309, 340 - i, 305, 344 - i);
	    c.setColor (darkOrange); //lion arms
	    int capeX[] = {275, 285, 300, 315, 325, 300};
	    int capeY[] = {380 - i, 380 - i, 395 - i, 380 - i, 380 - i, 405 - i};
	    c.fillPolygon (capeX, capeY, 6);
	    c.setColor (cape);
	    c.fillOval (295, 395 - i, 10, 10);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }

	}
	for (int x = 0 ; x < 5 ; x++) //this for loop animates Hercules moving his hand to throw the torch
	{
	    c.setColor (ground); //erase
	    c.fillRect (210, 329 + x, 24, 44);
	    //draw torch
	    c.setColor (Color.black);
	    c.fillRect (215, 360 + x, 12, 20);
	    c.setColor (Color.red);
	    c.fillArc (210, 330 + x, 22, 60, 0, 180);
	    c.setColor (Color.orange);
	    c.fillArc (215, 335 + x, 12, 50, 0, 180);
	    c.setColor (Color.yellow);
	    c.fillArc (218, 340 + x, 6, 40, 0, 180);
	    c.setColor (skinShade2); //hand and lower arm
	    c.fillOval (214, 363 + x, 16, 16);
	    c.fillOval (227, 358, 30, 26);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int x = 5 ; x >= 0 ; x--) //this for loop animates Hercules moving his hand up and releasing the torch
	{
	    c.setColor (ground); //erase
	    c.fillRect (210, 332 + x, 24, 49);
	    //draw torch
	    c.setColor (Color.black);
	    c.fillRect (215, 360 + x, 12, 20);
	    c.setColor (Color.red);
	    c.fillArc (210, 330 + x, 22, 60, 0, 180);
	    c.setColor (Color.orange);
	    c.fillArc (215, 335 + x, 12, 50, 0, 180);
	    c.setColor (Color.yellow);
	    c.fillArc (218, 340 + x, 6, 40, 0, 180);
	    c.setColor (skinShade2); //hand and lower arm
	    c.fillOval (214, 363 + x, 16, 16);
	    c.fillOval (227, 358, 30, 26);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }

	}
	for (int x = 0 ; x >= -20 ; x--) //this for loop animates the torch flying out of Hercules' hand
	{
	    c.setColor (ground); //erase
	    c.fillRect (210, 332 + x, 24, 49);
	    //draw torch
	    c.setColor (Color.black);
	    c.fillRect (215, 360 + x, 12, 20);
	    c.setColor (Color.red);
	    c.fillArc (210, 330 + x, 22, 60, 0, 180);
	    c.setColor (Color.orange);
	    c.fillArc (215, 335 + x, 12, 50, 0, 180);
	    c.setColor (Color.yellow);
	    c.fillArc (218, 340 + x, 6, 40, 0, 180);
	    c.setColor (skinShade2);
	    c.fillOval (214, 363, 16, 16); //hand
	    c.fillOval (227, 358, 30, 26); //lower arm
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int x = 0 ; x <= 77 ; x++) //this for loop animates the torch flying at the Hydra
	{
	    c.setColor (ground); //erase
	    c.fillRect (210 - x, 312 - x / 2, 24, 49);
	    //re-draw Hydra
	    c.setColor (Color.green);
	    for (int y = 0 ; y < 60 ; y++)
	    {
		c.drawLine (110 + y, 270, 120 + (int) Math.round (y / 1.5), 300);
	    }
	    for (int y = 0 ; y <= 20 ; y++)
	    {
		c.drawLine (200, 300, 160, 300 - y);
	    }
	    //draw torch
	    c.setColor (Color.black); //holder
	    c.drawArc (190, 294, 3, 8, 270, 220);
	    c.drawLine (193, 294, 250, 263);
	    c.fillRect (215 - x + x / 20, 340 - x / 2, 12 - x / 10, 20 - x / 10);
	    c.setColor (Color.red); //flame
	    c.fillArc (210 - x, 310 - x / 2, 22, 60, 0, 180);
	    c.setColor (Color.orange);
	    c.fillArc (215 - x, 315 - x / 2, 12, 50, 0, 180);
	    c.setColor (Color.yellow);
	    c.fillArc (218 - x, 320 - x / 2, 6, 40, 0, 180);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int x = 0 ; x <= 40 ; x++) //this for loop animates the flame engulfing the Hydra
	{
	    c.setColor (Color.red); //draw flame with increasing diameter
	    c.fillArc (144 - (22 + x) / 2, 302 - (60 + x) / 2, 22 + x, 60 + x, 0, 180);
	    c.setColor (Color.orange);
	    c.fillArc (144 - (12 + x) / 2, 302 - (50 + x) / 2, 12 + x, 50 + x, 0, 180);
	    c.setColor (Color.yellow);
	    c.fillArc (144 - (6 + x) / 2, 302 - (40 + x) / 2, 6 + x, 40 + x, 0, 180);
	    c.setColor (ground);
	    c.drawLine (141, 315 - (int) Math.round (x / 3.1), 146, 315 - (int) Math.round (x / 3.1));
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 40 ; i >= 0 ; i--) //this for loop animates Hercules moving back down the scene
	{
	    c.setColor (ground); //erase
	    c.fillRect (214, 328 - i, 126, 161);
	    c.setColor (darkOrange); //lion cape
	    c.fillOval (280, 329 - i, 40, 30);
	    int capeBackX[] = {285, 315, 325, 275};
	    int capeBackY[] = {344 - i, 344 - i, 380 - i, 380 - i};
	    c.fillPolygon (capeBackX, capeBackY, 4);
	    c.setColor (cape);
	    c.fillOval (285, 334 - i, 30, 20);
	    c.setColor (darkOrange);
	    c.fillOval (294, 342 - i, 12, 12);
	    c.setColor (skin);
	    c.fillOval (280, 348 - i, 40, 35); //face
	    c.fillRect (275, 380 - i, 50, 50); //body
	    c.fillRect (280, 460 - i, 15, 25); //legs
	    c.fillRect (305, 460 - i, 15, 25);
	    c.fillOval (277, 480 - i, 18, 10); //feet
	    c.fillOval (305, 480 - i, 18, 10);
	    c.setColor (skirt); //draw skirt
	    int skirtX[] = {275, 275, 325, 325};
	    int skirtY[] = {430 - i, 476 - i, 461 - i, 430 - i};
	    c.fillPolygon (skirtX, skirtY, 4);
	    c.setColor (skinShade3); //abdominal muscles
	    c.drawLine (300, 425 - i, 300, 400 - i);
	    c.drawArc (290, 415 - i, 10, 8, 180, 180);
	    c.drawArc (290, 405 - i, 10, 8, 180, 180);
	    c.drawArc (300, 405 - i, 10, 8, 180, 180);
	    c.drawArc (300, 415 - i, 10, 8, 180, 180);
	    c.setColor (skinShade2); //arms, shoulders and hands
	    c.fillArc (260, 380 - i, 30, 30, 90, 180);
	    c.fillArc (310, 380 - i, 30, 30, 270, 180);
	    c.fillOval (250, 390 - i, 30, 30);
	    c.fillOval (227, 398 - i, 30, 26);
	    c.fillOval (214, 403 - i, 16, 16);
	    c.fillOval (310, 390 - i, 30, 45);
	    c.fillOval (317, 432 - i, 16, 16);
	    c.setColor (Color.black); //hair
	    for (int z = 0 ; z < 2 ; z++)
	    {
		c.fillOval (286 + z * 18, 348 - i, 10, 10);
		c.fillOval (280 + z * 29, 353 - i, 10, 10);
		c.fillOval (276 + z * 34, 360 - i, 12, 12);
		c.fillOval (280 + z * 28, 369 - i, 12, 12);
	    }
	    c.fillOval (286, 373 - i, 28, 12); //beard
	    c.fillOval (290, 348 - i, 20, 12); //hair at the top of head
	    c.fillOval (291, 364 - i, 4, 4); //eyes
	    c.fillOval (303, 364 - i, 4, 4);
	    c.drawLine (290, 340 - i, 294, 344 - i); //lion eyes
	    c.drawLine (294, 340 - i, 290, 344 - i);
	    c.drawLine (305, 340 - i, 309, 344 - i);
	    c.drawLine (309, 340 - i, 305, 344 - i);
	    c.setColor (darkOrange); //lion arms
	    int capeX[] = {275, 285, 300, 315, 325, 300};
	    int capeY[] = {380 - i, 380 - i, 395 - i, 380 - i, 380 - i, 405 - i};
	    c.fillPolygon (capeX, capeY, 6);
	    c.setColor (cape);
	    c.fillOval (295, 395 - i, 10, 10);
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }

	}
	for (int i = 0 ; i >= -340 ; i--) //this for loop animates Hercules moving left out of the scene
	{
	    c.setColor (ground); //erase
	    c.fillRect (214 + i, 329, 127, 161);
	    for (int x = 0 ; x < 10 ; x++) //re-draw stone perimeter
	    {
		c.setColor (stone);
		c.drawArc (-80, 250 + x, 800, 520, 135, 45);
	    }
	    c.setColor (darkOrange); //lion cape
	    c.fillOval (280 + i, 329, 40, 30);
	    int capeBackX[] = {285 + i, 315 + i, 325 + i, 275 + i};
	    int capeBackY[] = {344, 344, 380, 380};
	    c.fillPolygon (capeBackX, capeBackY, 4);
	    c.setColor (cape);
	    c.fillOval (285 + i, 334, 30, 20);
	    c.setColor (darkOrange);
	    c.fillOval (294 + i, 342, 12, 12);
	    c.setColor (skin);
	    c.fillOval (280 + i, 348, 40, 35); //face
	    c.fillRect (275 + i, 380, 50, 50); //body
	    c.fillRect (280 + i, 460, 15, 25); //legs
	    c.fillRect (305 + i, 460, 15, 25);
	    c.fillOval (277 + i, 480, 18, 10); //feet
	    c.fillOval (305 + i, 480, 18, 10);
	    //draw skirt
	    c.setColor (skirt);
	    int skirtX[] = {275 + i, 275 + i, 325 + i, 325 + i};
	    int skirtY[] = {430, 476, 461, 430};
	    c.fillPolygon (skirtX, skirtY, 4);
	    c.setColor (skinShade3); //abdominal muscles
	    c.drawLine (300 + i, 425, 300 + i, 400);
	    c.drawArc (290 + i, 415, 10, 8, 180, 180);
	    c.drawArc (290 + i, 405, 10, 8, 180, 180);
	    c.drawArc (300 + i, 405, 10, 8, 180, 180);
	    c.drawArc (300 + i, 415, 10, 8, 180, 180);
	    c.setColor (skinShade2); //arms, shoulders and hands
	    c.fillArc (260 + i, 380, 30, 30, 90, 180);
	    c.fillArc (310 + i, 380, 30, 30, 270, 180);
	    c.fillOval (250 + i, 390, 30, 30);
	    c.fillOval (227 + i, 398, 30, 26);
	    c.fillOval (214 + i, 403, 16, 16);
	    c.fillOval (310 + i, 390, 30, 45);
	    c.fillOval (317 + i, 432, 16, 16);
	    c.setColor (Color.black); //hair
	    for (int z = 0 ; z < 2 ; z++)
	    {
		c.fillOval (286 + i + z * 18, 348, 10, 10);
		c.fillOval (280 + i + z * 29, 353, 10, 10);
		c.fillOval (276 + i + z * 34, 360, 12, 12);
		c.fillOval (280 + i + z * 28, 369, 12, 12);
	    }
	    c.fillOval (286 + i, 373, 28, 12); //beard
	    c.fillOval (290 + i, 348, 20, 12); //hair at the top of head
	    c.fillOval (291 + i, 364, 4, 4); //eyes
	    c.fillOval (303 + i, 364, 4, 4);
	    c.drawLine (290 + i, 340, 294 + i, 344); //lion eyes
	    c.drawLine (294 + i, 340, 290 + i, 344);
	    c.drawLine (305 + i, 340, 309 + i, 344);
	    c.drawLine (309 + i, 340, 305 + i, 344);
	    c.setColor (darkOrange); //lion arms
	    int capeX[] = {275 + i, 285 + i, 300 + i, 315 + i, 325 + i, 300 + i};
	    int capeY[] = {380, 380, 395, 380, 380, 405};
	    c.fillPolygon (capeX, capeY, 6);
	    c.setColor (cape);
	    c.fillOval (295 + i, 395, 10, 10);
	    c.setColour (pillar); //re-draw pillar
	    c.fillRect (40, 328, 40, 162);
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



    public Hercules (Console con) //class constructor
    {
	c = con; //passes ouput console
    }


    public void run () //run method
    {
	hercules ();
    }
}


