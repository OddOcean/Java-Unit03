//Aidan Weygandt 09/27/21
// Purpose of Program: 
// Using the Math.random() method to randomly draw lines, circles, 
// and squares within a set grid area  

import java.awt.*;
import javax.swing.JFrame;

public class Lab03C_Weygandt extends Canvas {
   
   /* We need to create the JFrame object that will contain the Canvas Object*/
   public static void main(String[] args) {
    JFrame frame = new JFrame("Lab 03C Drawing Random Shapes");/*Creates the JFrame and gives it a title */
    Canvas canvas = new Lab03C_Weygandt();/*This class extends Canvas so it is itself a canvas class and inherits everything Canvas has, so the consructor call has to be the same name as the class we are in */
    canvas.setSize(1100, 800);/*Set dimensions of canvas changing these numbers will change the size of your canvas */
    canvas.setBackground(Color.white);/* Set the background color of the canvas */
    frame.add(canvas);/* add the canvas object to the frame object */
    frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
    frame.setVisible(true);/* display the thing*/
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//will end the application on close
        
  }
  public int rand(int num){//returns random number from 1-num
    int rand = (int)(Math.random()*num);
    return rand;
  }
	public void paint(Graphics g){
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);

    //Draw Random Lines
    for (int i = 0; i < 100; i += 1){//repeats on hundred times and randomly draws lines of random length in upper left quadrant
      g.setColor(new Color(rand(255), rand(255), rand(255), rand(255)));
      g.drawLine(rand(390) + 10, rand(290) + 10, rand(390) + 10, rand(290) + 10);
      delay();
    }

    //Draw Squares
		for (int i = 0; i < 100; i += 1){//repeats one hundred times and draws 50x50 pixel sqaures randomly placed in the upper right quadrant
      g.setColor(new Color(rand(255), rand(255), rand(255), rand(255)));
      g.drawRect(rand(340) + 400, rand(240) + 10, 50, 50);
      delay();
    }

    //Draw Circles
    for (int i = 0; i < 100; i += 1){//Draws 100 randomly placed circles anywhere from 1 to 200 pixels wide within lower left hand quadrant
      int diameter = rand(200);
      g.setColor(new Color(rand(255), rand(255), rand(255), rand(255)));
      g.drawOval(rand(390 - diameter) + 10, rand(290 - diameter) + 300, diameter, diameter);
      delay();
    }
		
		// Draw 3-D Box
    int [] green_x = {450, 500, 500, 450};//dimensions for box
    int [] green_y = {350, 400, 500, 450};

    int [] yellow_x = {450, 550, 550, 450};
    int [] yellow_y = {350, 350, 450, 450};
	
    int [] blue_x = {550, 600, 600, 550};
    int [] blue_y = {350, 400, 500, 450};
	
    int [] red_x = {500, 600, 600, 500};
    int [] red_y = {400, 400, 500, 500};

    g.setColor(Color.YELLOW);
    g.fillPolygon(yellow_x, yellow_y, 4);
    g.setColor(Color.GREEN);
    g.fillPolygon(green_x, green_y, 4);
    g.setColor(Color.BLUE);
    g.fillPolygon(blue_x, blue_y, 4);
    g.setColor(Color.RED);
    g.fillPolygon(red_x, red_y, 4);
   }

   //this is a delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay() - is the code you need to make this work
   public static void delay(){
      int delaytime = 50;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();
   }
   
   //this is another version of the delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay(50) - is the code you need to make this work, the number in the parentheses is how long the delay will last.
   public static void delay(int delay){
      int delaytime = delay;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();

   }


        

}