// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random(1234);
		for (int k=1; k<=200; k++)
		{
		
		
		// Draw Random Lines
        int x1 =rnd.nextInt(400);
        int y1 =rnd.nextInt(300);
        int x2 =rnd.nextInt(400);
        int y2 =rnd.nextInt(300);
        int red=rnd.nextInt(256);
		int green=rnd.nextInt(256);
		int blue=rnd.nextInt(256);
		g.setColor(new Color(red,green,blue));
        g.drawLine(x1, y1, x2, y2);
        
       
		}

        
          
          
				
		
		// Draw Random Squares
		  for (int k=1; k<=200;k++)
    	  {

		int x =rnd.nextInt(350)+400;
		int y= rnd.nextInt(250);
		int red=rnd.nextInt(256);
		int green=rnd.nextInt(256);
		int blue=rnd.nextInt(256);
		g.setColor(new Color(red,green,blue));
		g.fillRect(x, y, 50, 50);
		
        	  }
		




		
		// Draw Random Circles
		  for (int k=1; k<=100;k++)
    	  {
		int x1 =rnd.nextInt(250);
		int y1 =rnd.nextInt(150)+300;
		int x2 =rnd.nextInt(200);
		int y2 =rnd.nextInt(150);
		int red=rnd.nextInt(250);
		int green=rnd.nextInt(250);
		int blue=rnd.nextInt(250);
		g.setColor(new Color(red,green,blue));
		g.drawOval(x1, y1, x2, y2);
		
		
    	  }
  
        	  
        	
        		  
        	  
	}
        	  




		
		// Draw 3-D Box
	
	
	
		
	
	}
		     
	
	
	
	

	

    
 