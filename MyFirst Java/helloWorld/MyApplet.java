/*
 * Created on Apr 7, 2015
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package helloWorld;
import java.awt.*;
import java.applet.*;
/**
 * @author smarge
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MyApplet extends Applet{
	String msg=" ";
		public void init()
		{
				msg+="init()--->";
				setBackground(Color.orange);
		}
		public void start()
		{
			msg+="start()--->";
			setForeground(Color.blue);

		}
		 public void paint(Graphics g)
		{
			msg+="paint()--->";
			g.drawString(msg,200,50);
		}


}
