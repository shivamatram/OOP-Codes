import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="SimpleApplet" width="300" height="300"></applet> */
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello Applet!", 100, 150);
    }
}
