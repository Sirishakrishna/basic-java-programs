import java.awt.*;
import java.awt.event.*;

public class DrawHouse extends java.applet.Applet 
                    implements ActionListener
// A graphics demo applet that draws a simple house.
{
    Graphics g;
    Canvas c;
    Button b1, b2;
    int hx, hy; // The x and y coordinates of the upper left
                // corner of the house.
    int hwidth, hheight;  // The house width and height.

    public void init()
    {
        c = new Canvas();
        c.setSize(400, 400);
        add(c);
        g = c.getGraphics();
        b1 = new Button("Start");
        b1.addActionListener(this);
        b2 = new Button("Display House");
        b2.addActionListener(this);
	add(b1); add(b2);
    }

    public void actionPerformed(ActionEvent event)
    {
        Object cause = event.getSource();

        if (cause == b1) // Set background.
	{
            g.setColor(Color.white);
            g.fillRect(0, 0, 200, 200);
        }
        if (cause == b2) // Draw the house.
	{
            hx = 50; hy = 90; // x,y coordinates for upper
                              // left corner of the house.
            hwidth = 200; hheight = 160; // House width and height.
            g.setColor(Color.YELLOW); // Color of front of house.
            g.fillRect(hx, hy, hwidth, hheight);
            // Draw front of house.
            g.setColor(Color.blue); // Color of roof.
            g.fillRect(hx - (hwidth/20), hy,
                    hwidth + (hwidth/10), hheight/3);
                    // Roof with some overhang.
            g.setColor(Color.pink); // Color for door and window.
            g.fillRect(hx + (2 * hwidth/3), hy + hheight/2,
                    hwidth/8, hheight/2); // Draw the door.
            g.fillRect(hx+(hwidth/4),hy+hheight/2,
                    hwidth/8, hheight/8); // Draw the window.
            
            g.setColor(Color.red); // Colr of chimney.
            g.fillRect(hx+(3*hwidth/4), hy-hheight/8,
                    hwidth/8, hheight/8); // Draw the chimney.
	}
    }
}
